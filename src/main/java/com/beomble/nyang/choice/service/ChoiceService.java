package com.beomble.nyang.choice.service;

import com.beomble.nyang.choice.mapper.ChoiceMapper;
import com.beomble.nyang.choice.vo.ChoiceVo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service("ChoiceService")
public class ChoiceService {

    ChoiceMapper choiceMapper;

    public int createCat(ChoiceVo choiceVo) {

        //TODO choiceVo 입력값 검증 필요

        return choiceMapper.createCat(choiceVo);
    }
}
