package com.beomble.nyang.records.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
public class RecordsViewController {

    @RequestMapping("/records")
    public String records(){

        return "records/records.html";
    }
}
