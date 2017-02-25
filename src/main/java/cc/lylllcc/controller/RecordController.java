package cc.lylllcc.controller;

import cc.lylllcc.domain.Record;
import cc.lylllcc.domain.RecordRepository;
import cc.lylllcc.domain.User;
import cc.lylllcc.domain.UserRepository;
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

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/dorecord")
    public Object record(String startTime, String lastTime, String title, String detail, String species, String username) {
        Record record = new Record(startTime, lastTime, title, detail, species, username);

        if (userRepository.findByUsername(username).isEmpty() == true){
            return new JsonMes(1,"用户名不存在");
        }else {
            try {
                recordRepository.save(record);
                return new JsonMes(0, "保存成功");
            } catch (Exception ex) {
                return new JsonMes(2, "未知错误");
            }
        }
    }
}
