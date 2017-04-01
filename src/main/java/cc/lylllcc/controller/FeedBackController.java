package cc.lylllcc.controller;

import cc.lylllcc.domain.FeedBack;
import cc.lylllcc.domain.FeedBackRepository;
import cc.lylllcc.dto.JsonMes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lylllcc on 2017/4/1.
 */
@RestController
@RequestMapping("/feedback")
public class FeedBackController {

    @Autowired
    private FeedBackRepository feedBackRepository;

    @PostMapping("/dofeedback")
    public Object dofeedBack(String username,String type,String detail,String contact){
        FeedBack feedBack = new FeedBack(username,type,detail,contact);
        try {
            feedBackRepository.save(feedBack);
            return new JsonMes(0,"保存成功");

        }catch (Exception e){
            return new JsonMes(1,"提交失败");
        }

    }
}
