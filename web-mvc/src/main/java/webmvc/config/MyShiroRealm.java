package webmvc.config;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.util.StringUtils;
import java.util.ArrayList;


public class MyShiroRealm extends AuthorizingRealm {
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("+++++++++++++++++++++++");


        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();

        ArrayList<String> roles = new ArrayList<>();
        roles.add("qqq");
        roles.add("aaa");

        // simpleAuthorizationInfo.addRole("aaa");
        simpleAuthorizationInfo.addRoles(roles);
        return simpleAuthorizationInfo;
    }



    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {


        System.out.println("*****************");
        //加这一步的目的是在Post请求的时候会先进认证，然后在到请求

        UsernamePasswordToken usernamePasswordToken= (UsernamePasswordToken) authenticationToken;

        String username = usernamePasswordToken.getUsername();

        if (authenticationToken.getPrincipal() == null) {
            return null;
        }
        //获取用户信息
        String name = authenticationToken.getPrincipal().toString();
        //用户获取的信息，因为realm中设置了md5加密，所以需要从数据库中获取的信息加密
        String pass="123456";
        String hashAlgorithmName="MD5";
        String salt=getName();

        ByteSource source = ByteSource.Util.bytes(salt);
        int hashIterations=5;

        SimpleHash simpleHash = new SimpleHash(hashAlgorithmName, pass, salt, hashIterations);

        if (StringUtils.isEmpty(name)) {
            //这里返回后会报出对应异常
            return null;
        } else {
            //这里验证authenticationToken和simpleAuthenticationInfo的信息

            SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(name, simpleHash, source, getName());

            //SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(name,simpleHash, getName());
           // return simpleAuthenticationInfo;
            return info;
        }
    }

}
