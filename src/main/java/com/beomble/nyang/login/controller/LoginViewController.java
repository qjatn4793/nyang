package com.beomble.nyang.login.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
public class LoginViewController {

    @RequestMapping("/login")
    public String login(){

        return "login/login.html";
    }

    @RequestMapping("/register")
    public String register(){

        return "login/register.html";
    }
}
