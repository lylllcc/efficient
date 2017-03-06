package cc.lylllcc.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lylllcc on 2017/3/6.
 */
@RestController
@RequestMapping("/time")
public class TimeController {

    @GetMapping("/now")
    public Object now(){
        LocalDateTime today = LocalDateTime.now();
        Map<String,String> to = new HashMap<>();
        to.put("monthValue",String.valueOf(today.getMonthValue()));
        to.put("year",String.valueOf(today.getYear()));
        to.put("dayOfMonth",String.valueOf(today.getDayOfMonth()));
        to.put("hour",String.valueOf(today.getHour()));
        to.put("minute",String.valueOf(today.getMinute()));
        to.put("second",String.valueOf(today.getSecond()));
        return to;
    }
}
