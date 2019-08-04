package com.example.demo.service;

import com.example.demo.dao.UserLoginMapper;
import com.example.demo.dao.userMapper;
import com.example.demo.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class demoControllerService {

//    @Autowired
//    private userMapper usermapper;

    @Autowired
    private UserLoginMapper userLoginMapper;

    public user userLogin(String userName, String password) {
        List<user> list = userLoginMapper.find(userName, password);
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

}
