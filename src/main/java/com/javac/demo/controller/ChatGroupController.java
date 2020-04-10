package com.javac.demo.controller;

import com.javac.demo.entity.dto.LoginDTO;
import com.javac.demo.entity.model.Login;
import com.javac.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 胡氏聊天群
 */

@Controller
@RequestMapping("/api")
public class ChatGroupController {

    @Autowired
    LoginService loginService;


    @GetMapping("")
    public  String index(){
        return "user/user";
    }

    @GetMapping("/login")
    @ResponseBody
    public  String login(LoginDTO loginDTO){
        Login user = loginService.getUser(loginDTO.getUsername(), loginDTO.getPassword());
        if(user!=null){
            return "欢迎"+user.getName();
        }
        return "用户名密码不匹配";
    }
}
