package com.beomble.nyang.menu.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
public class MenuViewController {

    @RequestMapping("/menu")
    public String records(){

        return "menu/menu.html";
    }
}
