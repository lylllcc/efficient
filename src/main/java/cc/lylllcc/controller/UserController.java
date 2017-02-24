package cc.lylllcc.controller;

import cc.lylllcc.domain.User;
import cc.lylllcc.domain.UserRepository;
import cc.lylllcc.dot.ErrorJsonMes;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lylllcc on 2017/2/23.
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/hello")
    public Object hello() {

        class Test {
            public int code = 1;
            public String message = "hello";
        }

        return new Test();
    }

    @PostMapping("/regist")
    @JsonIgnore
    public Object regist(String username, String password, String email) {
        if (userRepository.findByUsername(username).isEmpty() != true) {
            return new ErrorJsonMes(1, "用户名已存在");
        }else if(userRepository.findByEmail(email).isEmpty() != true){
            return new ErrorJsonMes(2,"邮箱已经被注册");
        } else {
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            try {
                User user = new User(passwordEncoder.encode(password), username, email);
                return userRepository.save(user);
            } catch (Exception ex) {
                return new ErrorJsonMes(3, "未知错误");
            }
        }

    }
}

