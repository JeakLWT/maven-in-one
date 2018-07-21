package webmvc.service;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Service;

@Service
public class ShiroService {
    @RequiresRoles({"aaa"})
    public String getShiro(){
        return "/index";
    }

}
