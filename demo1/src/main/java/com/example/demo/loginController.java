package com.example.demo;

import jakarta.servlet.http.HttpSession;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class loginController {
    /**
     * 登录的主逻辑
     * @param userName
     * @param password
     * @param session
     * @return
     */
    @RequestMapping("/login")   //
    public boolean login(String userName, String password, HttpSession session){
        //账号或密码不能为空
        //StringUtils.hasLength() 是Spring提供的⼀个⼯具⽅法, 判断字符串是否有值
        if(!StringUtils.hasLength(userName) ||!StringUtils.hasLength(password)){
            return false;
        }
        if(!"zhangsan".equals(userName) || !"123456".equals(password)){
            return false;
        }
        //密码验证成功, 把⽤⼾名存储在Session中
        session.setAttribute("userName",userName);
        return true;
    }

    @RequestMapping("/getLoginUser")
    public String getLoginUser(HttpSession session){
        String userName = (String)session.getAttribute("userName");
        if(StringUtils.hasLength(userName)){
            return userName;
        }
        return "";
    }
}
