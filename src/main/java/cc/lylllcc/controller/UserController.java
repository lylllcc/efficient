package cc.lylllcc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lylllcc on 2017/2/23.
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/hello")
    public Object hello(){

        class Test{
            public int code = 1;
            public String message = "hello";
        }

        return new Test();
    }
}
