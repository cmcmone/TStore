package edu.wcsu.thestore.controller;

import edu.wcsu.thestore.domain.Product;
import edu.wcsu.thestore.domain.ShoppingCart;
import edu.wcsu.thestore.service.CartService;
import edu.wcsu.thestore.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

/**
 * @author Ray Chen
 * @version 1.0
 */
@Controller
public class CartController {
    @Autowired
    private CartService cartService;

    @Autowired
    ProductsService productsService;

    @RequestMapping("/ShoppingCart")
    public String getMyShoppingCart(Model model, HttpSession session) {
        List myShoppingCart = cartService.findShoppingCartByUserID((Long) session.getAttribute("userID"));
        model.addAttribute("myCart", myShoppingCart);
        return "cart";
    }

    @RequestMapping("/delCart")
    public String deleteShoppingCartItem(@RequestParam("id") Long cartID, Model model) {
        Optional<ShoppingCart> optional = cartService.findShoppingCartByID(cartID);
        if (optional.isPresent()) {
            ShoppingCart shoppingCart = optional.get();
            cartService.delShoppingCartByID(cartID);
            List myShoppingCart = cartService.findShoppingCartByUserID(shoppingCart.getUserID());
            model.addAttribute("myCart", myShoppingCart);
        }
        return "cart";
    }

    @RequestMapping("/updateCart")
    public String updateShoppingCart(@RequestParam(value = "cartID") Long[] idArr,
                                     @RequestParam("quantity") Integer[] quantityArr,
                                     Model model) {
        Long userID = null;
        for (int i = 0; i < idArr.length; i++) {
            Optional<ShoppingCart> optional = cartService.findShoppingCartByID(idArr[i]);
            if (optional.isPresent()) {
                ShoppingCart cart = optional.get();
                userID = cart.getUserID();
                cart.setQuantity(quantityArr[i]);
                cartService.updateShoppingCart(cart);
            }
        }
        if (userID != null) {
            List myShoppingCart = cartService.findShoppingCartByUserID(userID);
            model.addAttribute("myCart", myShoppingCart);
        }
        return "cart";
    }

    @RequestMapping("/addToCart")
    public String addToCart(@RequestParam(value = "productID") Long productID,
                            @RequestParam(value = "productQuantity") Integer productQuantity,
                            HttpSession session) {
        Optional<Product> optional = productsService.findProductByID(productID);
        if (optional.isPresent()) {
            Product product = optional.get();
            ShoppingCart cart = new ShoppingCart();
            cart.setUserID((Long) session.getAttribute("userID"));
            cart.setQuantity(productQuantity);
            cart.setCost(product.getCost());
            cart.setProduct(product);
            cartService.updateShoppingCart(cart);
        }
        return "redirect:/ShoppingCart";
    }
}
