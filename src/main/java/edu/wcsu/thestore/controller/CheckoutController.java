package edu.wcsu.thestore.controller;

import edu.wcsu.thestore.domain.*;
import edu.wcsu.thestore.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @author Ray Chen
 * @version 1.0
 */
@Controller
public class CheckoutController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderLineService orderLineService;

    @Autowired
    private CartService cartService;

    @Autowired
    private AddressService addressService;

    @Autowired
    private LoginService loginService;

    @RequestMapping("/checkout")
    public String checkout(HttpSession session, Model model) {
        List myShoppingCart = cartService.findShoppingCartByUserID((Long) session.getAttribute("userID"));
        model.addAttribute("myCart", myShoppingCart);

        double total = 0;
        for (Object cart : myShoppingCart) {
            ShoppingCart obj = (ShoppingCart) cart;
            total += (obj.getCost() * obj.getQuantity());
        }
        model.addAttribute("total", total);

        Address myAddress = addressService.getUserAddress((Long) session.getAttribute("userID"));
        model.addAttribute("Address", myAddress);

        return "checkout";
    }

    @RequestMapping("/payment")
    public String payment(@RequestParam("username") String username,
                          @RequestParam("street") String street,
                          @RequestParam("city") String city,
                          @RequestParam("state") String state,
                          @RequestParam("phone") String phone,
                          HttpSession session) {
        Address myAddress = addressService.getUserAddress((Long) session.getAttribute("userID"));
        if (myAddress == null) {
            myAddress = new Address();
        }
        Optional<User> user = loginService.findUserById((Long) session.getAttribute("userID"));
        if (user.isPresent()) {
            myAddress.setUser(user.get());
        }
        myAddress.setName(username);
        myAddress.setStreet(street);
        myAddress.setCity(city);
        myAddress.setState(state);
        myAddress.setPhone(phone);
        addressService.save(myAddress);

        Order order = new Order();
        Date now = new Date();
        order.setDateOrdered(new SimpleDateFormat ("MM/dd/yyyy").format(now));
        order.setStatus("Success");
        List myShoppingCart = cartService.findShoppingCartByUserID((Long) session.getAttribute("userID"));
        double totalCost = 0;
        int totalItems = 0;
        for (Object cart : myShoppingCart) {
            ShoppingCart obj = (ShoppingCart) cart;
            totalCost += (obj.getCost() * obj.getQuantity());
            totalItems += obj.getQuantity();
        }
        order.setTotalCost(totalCost);
        order.setTotalItems(totalItems);
        order.setUserID((Long) session.getAttribute("userID"));
        Order saved = orderService.save(order);


        for (Object cart : myShoppingCart) {
            ShoppingCart obj = (ShoppingCart) cart;
            OrderLine orderLine = new OrderLine();
            orderLine.setOrderID(saved.getOrderID());
            orderLine.setCost(obj.getCost());
            orderLine.setProduct(obj.getProduct());
                    //setProductID(obj.getProduct().getProductID());
            orderLine.setQuantity(obj.getQuantity());
            orderLineService.saveOrderLine(orderLine);
            cartService.delShoppingCartByID(obj.getShoppingCartID());
        }

        return "redirect:/myaccount";
    }
}
