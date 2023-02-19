package com.beomble.nyang.login.mapper;

import com.beomble.nyang.login.vo.LoginVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
@Mapper
public interface LoginMapper {

    LoginVo loginMember(LoginVo loginVo);

    int createMember(LoginVo loginVo);

    HashMap<String, String> checkCat(String memberId);

    int catCount(String memberId);
}
