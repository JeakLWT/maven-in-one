package webmvc.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import webmvc.service.ShiroService;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ThymeleafController {

    @Autowired
    private ShiroService shiroService;

    @RequestMapping("/ShiroAnotation")
    public String  ShiroAnotation(){
        return shiroService.getShiro();
    }

    @RequestMapping("/getKey")
    public String getKey(@RequestParam String username,@RequestParam String password){

        Subject subject = SecurityUtils.getSubject();

        if(!subject.isAuthenticated()){
            UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username, password);
            usernamePasswordToken.setRememberMe(true);
            subject.login(usernamePasswordToken);

        }
        Map map=new HashMap();
        map.put("hello","ThymeleafController");

        return "/hello";
    }

    @RequestMapping("/login")
    public String login(){
        return "/login";
    }

}
