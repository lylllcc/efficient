package cc.lylllcc.controller;

import cc.lylllcc.domain.User;
import cc.lylllcc.domain.UserRepository;
import cc.lylllcc.dot.JsonMes;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping("/change")
    @JsonIgnore
    public Object changGrade(String username,double change){
        User user = userRepository.findFirstByUsername(username);

        try{
            user.setGrade(user.getGrade() + change);
            userRepository.save(user);
            return userRepository.save(user);
        }catch (Exception e){
            return new JsonMes(1,"未知错误");
        }
    }


}
