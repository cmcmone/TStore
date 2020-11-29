package edu.wcsu.thestore.controller;

import edu.wcsu.thestore.domain.OrderLine;
import edu.wcsu.thestore.service.OrderLineService;
import edu.wcsu.thestore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderLineService orderLineService;

    @RequestMapping("/myaccount")
    public String getMyOrder(HttpSession session, Model model) {
        List myOrder = orderService.findMyOrder((Long) session.getAttribute("userID"));
        model.addAttribute("myOrder", myOrder);
        return "account";
    }

    @RequestMapping("/history")
    public String getMyOrderHistory(@RequestParam("id") Long orderID,
                                    Model model, HttpSession session) {
        List allOrderLine = orderLineService.findOrderLineByOrderID(orderID);
        model.addAttribute("myOrderLine", allOrderLine);
        return "history";
    }
}
