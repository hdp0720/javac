package com.javac.demo.service.impl;

import com.google.common.collect.Maps;
import com.javac.demo.entity.model.Login;
import com.javac.demo.repository.LoginDao;
import com.javac.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginDao loginDao;

    @Override
    public Login getUser(String name, String pwd) {
        Map<String,Long> map= Maps.newHashMap();
        map.put("",1l);

        Login login = loginDao.findAllByNameAndPwd(name, pwd);
        if(login!=null){
            return login;
        }
        return null;
    }
}
