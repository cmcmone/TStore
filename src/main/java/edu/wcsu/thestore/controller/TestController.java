package edu.wcsu.thestore.controller;

import edu.wcsu.thestore.domain.User;
import edu.wcsu.thestore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ray Chen
 * @version 1.0
 */

@Controller
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public String findAllTeamMember(Model model) {
        List<User> userList = userService.findAllUser();
        List<String> memberList = new ArrayList<>();
        for (User temp : userList) {
            String firstName = temp.getFirstName();
            String middleName = temp.getMiddleName();
            String lastName = temp.getLastName();
            String userName;
            if (StringUtils.hasLength(middleName)) {
                userName = firstName + ' ' + lastName;
            } else {
                userName = firstName + ' ' + middleName + ' ' + lastName;
            }
            memberList.add(userName);
        }
        model.addAttribute("teamMember", memberList);
        return "test";
    }

    @RequestMapping("/insert")
    public String insertUser() {
        User user = new User();
        user.setFirstName("first");
        user.setLastName("Last");
        userService.insertUser(user);
        return "insert";
    }
}
