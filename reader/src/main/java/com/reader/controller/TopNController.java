package  com.reader.controller;

import com.reader.service.TopNService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Controller
public class TopNController {
    @Autowired
    private TopNService topNService;

    @GetMapping("index")
    public String index(){
        return "/index";
    }

    @PostMapping("getRankingBoard")
    @ResponseBody
    public List<Map<String, Object>> getDailyIncrRankingBoard() throws Exception {
        return topNService.getDailyIncrRankingBoard();
    }

    @PostMapping("getScrollBoard")
    @ResponseBody
    public List<Collection<Object>> getScrollBoard() throws Exception {
        return topNService.getScrollBoard();
    }

    //整体情况
    @PostMapping("digitalFlop")
    @ResponseBody
    public Map<String ,Object> DigitalFlop() throws Exception{
        return topNService.DigitalFlop();
    }

    //增量
    @PostMapping("doPostTopNIncrement")
    @ResponseBody
    public Object doPostCsdnTopNIncrement() throws Exception{
        return topNService.doPostTopNIncrement();
    }

    //趋势
    @PostMapping("doPostTop20")
    @ResponseBody
    public Object doPostCsdnTop20() throws Exception{
        return topNService.doPostTop20();
    }

}
