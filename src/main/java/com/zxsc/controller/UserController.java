package com.zxsc.controller;

import com.zxsc.pojo.User;
import com.zxsc.pojo.UserLogin;
import com.zxsc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@Validated UserLogin userLogin, Model model, HttpSession session) {
        System.out.println(userLogin);
        if(session.getAttribute("user") == null){
            User user = userService.login(userLogin);
            if(user == null){
                return "error";
            }
        }
        return "user/welcome";
    }
}
