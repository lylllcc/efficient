package cc.lylllcc.controller;

import cc.lylllcc.domain.GradeRecord;
import cc.lylllcc.domain.GradeRecordRepository;
import cc.lylllcc.domain.User;
import cc.lylllcc.domain.UserRepository;
import cc.lylllcc.dto.JsonMes;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lylllcc on 2017/3/20.
 */
@RestController
@RequestMapping("/grade")
public class GradeController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private GradeRecordRepository gradeRecordRepository;

    @PostMapping("/change")
    @JsonIgnore
    public Object changGrade(String username,double changes,String detail){
        User user = userRepository.findFirstByUsername(username);
        GradeRecord gradeRecord = new GradeRecord(username,detail,changes);
        try{
            user.setGrade(user.getGrade() + changes);
            userRepository.save(user);
            gradeRecordRepository.save(gradeRecord);
            return userRepository.save(user);
        }catch (Exception e){
            return new JsonMes(1,"未知错误");
        }
    }

    @GetMapping("/gettop30record")
    @JsonIgnore
    public Object getTop30(String username){
        return gradeRecordRepository.findTop30ByUsernameOrderByIdDesc(username);
    }

    @GetMapping("/gettop10record")
    @JsonIgnore
    public Object getTop10(String username){
        return gradeRecordRepository.findTop10ByUsernameOrderByIdDesc(username);
    }

    @RequestMapping("/getallrecord")
    public Object getAll(String username){
        return gradeRecordRepository.findByUsernameOrderByIdDesc(username);
    }


}
