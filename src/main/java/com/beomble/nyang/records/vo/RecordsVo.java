package com.beomble.nyang.records.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RecordsVo {
    private String memberId;
    private String records;
    private String startDate;
    private String endDate;
}
