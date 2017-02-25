package cc.lylllcc.controller;

import cc.lylllcc.domain.Record;
import cc.lylllcc.domain.RecordRepository;
import cc.lylllcc.dot.JsonMes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lylllcc on 2017/2/25.
 */
@RestController
@RequestMapping("/record")
public class RecordController {

    @Autowired
    private RecordRepository recordRepository;

    @PostMapping("/dorecord")
    public Object record(String startTime, String lastTime, String title, String detail, String species){
        Record record = new Record(startTime,lastTime,title,detail,species);

        try {
            recordRepository.save(record);
            return new JsonMes(0,"保存成功");
        }catch (Exception ex){
            return new JsonMes(1,"保存失败，未知错误");
        }
    }
}
