package com.reader.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.reader.entity.Vote;

import java.util.Collection;
import java.util.List;
import java.util.Map;


public interface TopNService extends IService<Vote> {

    List<Map<String, Object>> getDailyIncrRankingBoard() throws Exception;

    List<Collection<Object>> getScrollBoard()throws Exception;

    Map<String, Object> DigitalFlop()throws Exception;

    Object doPostTopNIncrement()throws Exception;

    Object doPostTop20()throws Exception;


}
