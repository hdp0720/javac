package com.javac.demo.controller;

import com.javac.demo.entity.dto.LoginDTO;
import com.javac.demo.entity.model.Login;
import com.javac.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.mail.internet.MimeMessage;

/**
 * 胡氏聊天群
 */

@Controller
@RequestMapping("/api")
public class ChatGroupController {

    @Autowired
    LoginService loginService;

    //注入qq邮箱发送的bean
    @Autowired
    JavaMailSender mailSender;

    //定义发送的内容 我这里发送一张图片 需要html标签
    public static String body="<img src='' alt='测试测试'>";

    @GetMapping("")
    public  String index(){
        return "user/user";
    }


    @GetMapping("/qqMail")
    @ResponseBody
    public  Object qqMail(@RequestParam(value = "qq")String qq,@RequestParam(value = "title")String title){
        try {
            MimeMessage mimeMessage=this.mailSender.createMimeMessage();
            MimeMessageHelper messageHelper=new MimeMessageHelper(mimeMessage);
            messageHelper.setFrom("575020050@qq.com");
            qq+="@qq.com";
            messageHelper.setTo(qq);
            messageHelper.setSubject(title);
            //第二个参数true表示使用HTML语言来编写邮件
            messageHelper.setText(body,true);
            this.mailSender.send(mimeMessage);
            return "发送成功";
        } catch (Exception e) {
          e.printStackTrace();
          return "发送失败";
        }
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
