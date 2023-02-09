package com.beomble.nyang.menu.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuVo {
    private int catSeq;
    private String catImg;
    private String catName;
    private String memberId;
    private int catNum;
}
