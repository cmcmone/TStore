package edu.wcsu.thestore.controller;

import edu.wcsu.thestore.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Ray Chen
 * @version 1.0
 */
@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public String login(@RequestParam("email") String email,
                        @RequestParam("password") String password,
                        Model model) {
        boolean isLogin = loginService.login(email, password);
        model.addAttribute("success", !isLogin);
        if (isLogin) {
            return "index";
        } else {
            return "login";
        }
    }

    @GetMapping("/login")
    public String toLoginPage() {
        return "login";
    }
}
