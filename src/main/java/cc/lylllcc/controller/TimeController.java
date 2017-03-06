package cc.lylllcc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Created by lylllcc on 2017/3/6.
 */
@RestController
@RequestMapping("/time")
public class TimeController {

    @GetMapping("/now")
    public Object now(){
        LocalDateTime today = LocalDateTime.now();
        return today;
    }
}
