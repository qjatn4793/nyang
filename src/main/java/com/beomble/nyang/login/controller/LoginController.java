package com.beomble.nyang.login.controller;

import com.beomble.nyang.login.service.LoginService;
import com.beomble.nyang.login.vo.LoginVo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@ResponseBody
@RestController
public class LoginController {
    LoginService loginService;

    public class SessionConst {
        public static final String LOGIN_MEMBER = "loginMember";
    }

    @PostMapping("/loginProc")
    public int loginProc(@RequestBody LoginVo loginVo, HttpServletRequest request){ // 로그인
        LoginVo loginCheck = loginService.loginMember(loginVo);

        if (loginCheck != null) {

            HttpSession session = request.getSession();
            session.setAttribute("loginMember", loginCheck); // 로그인 세션 생성

            //HashMap<String, String> checkCat = loginService.checkCat(loginCheck.getMemberId());

            return 1; // 로그인 성공
        }else {
            return 0; // 로그인 실패
        }
    }

    @PostMapping("/createUser")
    public int createMember(@RequestBody LoginVo loginVo){ // 회원가입

        return loginService.createMember(loginVo);
    }

    @PutMapping("/updateUser")
    public int updateMember(){ // 회원정보 수정

        return 0;
    }

    @DeleteMapping("/deleteUser")
    public int deleteMember(){ // 회원 탈퇴

        return 0;
    }

    @PostMapping("/logout")
    public String logout(HttpServletRequest request) {

        HttpSession session = request.getSession();
        session.invalidate();

        return "logout";
    }

    @GetMapping("/catCount")
    public int catCount(HttpServletRequest request) {

        LoginVo loginVo = (LoginVo) request.getSession().getAttribute("loginMember");
        String memberId = loginVo.getMemberId();

        return loginService.catCount(memberId);
    }
}
