package webmvc.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import dubboapi.com.api.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCotroller {
    //****************************服务必须启动，否则会抱空指针异常********************************
    @Reference(version = "1.0.0")
    private HelloService helloService;
    @RequestMapping("/getHello")
    public String getHello(){
        return helloService.sayHello();
    }

}
