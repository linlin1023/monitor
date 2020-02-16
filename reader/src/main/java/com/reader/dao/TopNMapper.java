package com.reader.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.reader.entity.Vote;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TopNMapper extends BaseMapper<Vote> {

    List<Map<String, Object>> getDailyIncrRankingBoard(@Param("day") Integer day);
    List<Map<String, Object>> getScrollBoard(@Param("day") Integer day);
}
