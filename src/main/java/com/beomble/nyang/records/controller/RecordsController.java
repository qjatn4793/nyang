package com.beomble.nyang.records.controller;

import com.beomble.nyang.login.vo.LoginVo;
import com.beomble.nyang.records.service.RecordsService;
import com.beomble.nyang.records.vo.RecordsVo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@ResponseBody
@RestController
public class RecordsController {
    RecordsService recordsService;

    @GetMapping("/Records")
    public List<Map<String, Object>> viewRecords(HttpServletRequest request){

        LoginVo loginVo = (LoginVo) request.getSession().getAttribute("loginMember");
        String memberId = loginVo.getMemberId();

        return recordsService.viewRecords(memberId);
    }

    @PostMapping("/Records")
    public int createRecords(@RequestBody RecordsVo recordsVo, HttpServletRequest request){

        LoginVo loginVo = (LoginVo) request.getSession().getAttribute("loginMember");
        recordsVo.setMemberId(loginVo.getMemberId());

        return recordsService.createRecords(recordsVo);
    }

    /*@GetMapping("/Records")
    public int viewRecords(
            @RequestParam String userId,
            @RequestParam String catName,
            @RequestParam String choiceDate,
            @RequestParam String purpose,
            @RequestParam String records,
            @RequestParam String visitDate,
            @RequestParam Integer catImg){

            System.out.println("getstart");
            System.out.println(userId);
            System.out.println(catName);
            System.out.println(choiceDate);
            System.out.println(purpose);
            System.out.println(records);
            System.out.println(visitDate);
            System.out.println(catImg);
            System.out.println("getstart");

        return 0;
    }

    @PostMapping("/Records")
    public int createRecords(@RequestBody RecordsVo recordsVo){

        System.out.println("poststart");
        System.out.println(recordsVo);
        System.out.println("poststart");

        return 0;
    }

    @PutMapping("/Records")
    public int updateRecords(@RequestBody RecordsVo recordsVo){

        System.out.println("putstart");
        System.out.println(recordsVo);
        System.out.println("putstart");

        return 0;
    }

    @DeleteMapping("/Records")
    public int deleteRecords(
            @RequestParam String userId,
            @RequestParam String catName,
            @RequestParam String choiceDate,
            @RequestParam String purpose,
            @RequestParam String records,
            @RequestParam String visitDate,
            @RequestParam Integer catImg){

        System.out.println("deletestart");
        System.out.println(userId);
        System.out.println(catName);
        System.out.println(choiceDate);
        System.out.println(purpose);
        System.out.println(records);
        System.out.println(visitDate);
        System.out.println(catImg);
        System.out.println("deletestart");

        return 0;
    }*/
}
