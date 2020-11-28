package edu.wcsu.thestore.controller;

import edu.wcsu.thestore.domain.User;
import edu.wcsu.thestore.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Optional;

/**
 * @author Ray Chen
 * @version 1.0
 */
@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public String login(@RequestParam("email") String email,
                        @RequestParam("password") String password,
                        Model model,
                        HttpSession session) {
        boolean isLogin = loginService.login(email, password);
        if (isLogin) {
            Optional optional = loginService.getUserName(email);
            if (optional.isPresent()) {
                User user = (User) optional.get();
                session.setAttribute("loginUser", user.getUserName());
            }
            return "redirect:/main.html";
        } else {
            model.addAttribute("msg", "Invalid login information. Please try again.");
            return "login";
        }
    }

    @RequestMapping("/signup")
    public String signup(HttpSession session) {
        Object isLogin = session.getAttribute("loginUser");
        if (isLogin != null) {
            session.removeAttribute("loginUser");
            return "redirect:/main.html";
        }
        return "index";
    }
}
