package edu.wcsu.thestore.controller;

import edu.wcsu.thestore.domain.User;
import edu.wcsu.thestore.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

//Jack Baxter

@Controller
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    @PostMapping("/register")
    public String register(@RequestParam("name") String name,
                        @RequestParam("email") String email,
                        @RequestParam("password") String password,
                        Model model, HttpSession session) {
        User user = new User();
        user.setUserName(name);
        user.setEmail(email);
        user.setPassword(password);

        boolean isRegister = registerService.register(user);
        model.addAttribute("success", !isRegister);
        if (isRegister) {
            session.setAttribute("loginUser", name);
            return "redirect:/main.html";
        } else {
            model.addAttribute("emailMsg", "Email is already in use. Please try again.");
            return "register";
        }
    }
}
