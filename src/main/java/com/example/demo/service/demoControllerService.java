package com.example.demo.service;

import com.example.demo.dao.userMapper;
import com.example.demo.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class demoControllerService {

    @Autowired
    private userMapper usermapper;

    public user userLogin(String PK, String password){
        user u = usermapper.selectByPrimaryKey(PK);
        return u;
    }

}
