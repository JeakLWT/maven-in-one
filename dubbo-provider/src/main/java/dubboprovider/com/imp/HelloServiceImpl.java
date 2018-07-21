package dubboprovider.com.imp;

import com.alibaba.dubbo.config.annotation.Service;
import dubboapi.com.api.HelloService;

@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "hello world";
    }
}
