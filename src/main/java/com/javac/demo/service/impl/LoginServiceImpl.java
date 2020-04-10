package com.javac.demo.service.impl;

import com.javac.demo.entity.model.Login;
import com.javac.demo.repository.LoginDao;
import com.javac.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginDao loginDao;

    @Override
    public Login getUser(String name, String pwd) {
        Login login = loginDao.findAllByNameAndPwd(name, pwd);
        if(login!=null){
            return login;
        }
        return null;
    }
}
