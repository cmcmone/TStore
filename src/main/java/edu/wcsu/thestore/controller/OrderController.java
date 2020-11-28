package edu.wcsu.thestore.controller;

import edu.wcsu.thestore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Ray Chen
 * @version 1.0
 */
@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/myaccount")
    public String getMyOrder(@RequestParam("id") Long userID, Model model) {
        List myOrder = orderService.findMyOrder(userID);
        model.addAttribute("myOrder", myOrder);
        return "account";
    }
}
