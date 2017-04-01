package cc.lylllcc.controller;

import cc.lylllcc.config.AdminConfig;
import cc.lylllcc.domain.FeedBack;
import cc.lylllcc.domain.FeedBackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by lylllcc on 2017/4/1.
 */
@Controller
public class AdminController {

    @Autowired
    private HttpSession httpSession;

    @Autowired
    private AdminConfig adminConfig;

    @Autowired
    private FeedBackRepository feedBackRepository;

    @RequestMapping("/getallfeedback")
    public String getAllfeedback(Model model){
        if(httpSession.getAttribute("admin") == null)
            return "redirect:/login";
        Iterable<FeedBack> feedBacks = feedBackRepository.findByOrderByIdDesc();
        model.addAttribute("feedbacks",feedBacks);
        return "feedback";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String username,String password){
        if(username.equals(adminConfig.adminname) && password.equals(adminConfig.adminpassword)){
            httpSession.setAttribute("admin",true);
            return "redirect:/getallfeedback";
        }
        return "redirect:/login";

    }
}
