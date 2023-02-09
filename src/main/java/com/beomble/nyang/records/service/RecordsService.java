package com.beomble.nyang.records.service;

import com.beomble.nyang.records.mapper.RecordsMapper;
import com.beomble.nyang.records.vo.RecordsVo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Service("RecordsService")
public class RecordsService {

    RecordsMapper recordsMapper;

    public List<Map<String, Object>> viewRecords(String memberId) {

        List<Map<String, Object>> recordsList = recordsMapper.viewRecords(memberId);

        return recordsList;
    }

    public int createRecords(RecordsVo recordsVo) {
        return recordsMapper.createRecords(recordsVo);
    }
}
