package com.javac.demo.service;

import com.javac.demo.entity.model.Login;

public interface LoginService {

    Login  getUser(String name,String pwd);
}
