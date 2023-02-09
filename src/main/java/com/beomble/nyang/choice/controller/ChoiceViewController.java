package com.beomble.nyang.choice.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
public class ChoiceViewController {

    @RequestMapping("/choice")
    public String choice(){

        return "choice/choice.html";
    }
}
