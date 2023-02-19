package com.beomble.nyang.login.service;

import com.beomble.nyang.login.mapper.LoginMapper;
import com.beomble.nyang.login.vo.LoginVo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Transactional
@Service("LoginService")
public class LoginService {

    LoginMapper loginMapper;

    public LoginVo loginMember(LoginVo loginVo) {

        //TODO loginVo 입력값 검증 필요

        return loginMapper.loginMember(loginVo);
    }

    public int createMember(LoginVo loginVo) {

        //TODO loginVo 입력값 검증 필요

        return loginMapper.createMember(loginVo);
    }

    public HashMap<String, String> checkCat (String memberId) {

        return loginMapper.checkCat(memberId);
    }

    public int catCount (String memberId) {

        return loginMapper.catCount(memberId);
    }
}
