package com.beomble.nyang.records.mapper;

import com.beomble.nyang.records.vo.RecordsVo;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordsMapper {

    int createRecords(RecordsVo recordsVo);
}
