package com.beomble.nyang.choice.controller;

import com.beomble.nyang.choice.service.ChoiceService;
import com.beomble.nyang.choice.vo.ChoiceVo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@ResponseBody
@RestController
public class ChoiceController {
    ChoiceService choiceService;

    @PostMapping("/choice")
    public int createCat(@RequestBody ChoiceVo choiceVo){

        return choiceService.createCat(choiceVo);
    }

    /*@GetMapping("/choice")
    public int viewRecords(){

        return 0;
    }

    @PutMapping("/choice")
    public int updateRecords(){

        return 0;
    }

    @DeleteMapping("/choice")
    public int deleteRecords(){

        return 0;
    }*/
}
