package com.beomble.nyang.records.mapper;

import com.beomble.nyang.records.vo.RecordsVo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface RecordsMapper {

    List<Map<String, Object>> viewRecords(String memberId);

    int createRecords(RecordsVo recordsVo);
}
