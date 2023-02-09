package com.beomble.nyang.choice.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChoiceVo {
    private String catSeq;
    private String catImg;
    private String catName;
    private String memberId;
}
