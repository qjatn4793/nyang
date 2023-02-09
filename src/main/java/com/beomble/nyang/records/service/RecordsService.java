package com.beomble.nyang.records.service;

import com.beomble.nyang.records.mapper.RecordsMapper;
import com.beomble.nyang.records.vo.RecordsVo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service("RecordsService")
public class RecordsService {

    RecordsMapper recordsMapper;

    public int createRecords(RecordsVo recordsVo) {
        return recordsMapper.createRecords(recordsVo);
    }
}
