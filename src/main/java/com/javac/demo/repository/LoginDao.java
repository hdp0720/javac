package com.javac.demo.repository;

import com.javac.demo.entity.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginDao extends JpaRepository<Login,Long> {

    Login findAllByNameAndPwd(String name,String pwd);
}
