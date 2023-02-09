package com.beomble.nyang.choice.mapper;

import com.beomble.nyang.choice.vo.ChoiceVo;
import org.springframework.stereotype.Repository;

@Repository
public interface ChoiceMapper {

    int createCat(ChoiceVo choiceVo);
}
