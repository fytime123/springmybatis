package com.example.demo.controller;

import com.example.demo.entity.user;
import com.example.demo.service.demoControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

    @Autowired
    private demoControllerService service;

    @RequestMapping("/hello")
    public String getName(@RequestParam("PK") String PK,  @RequestParam("password") String password){

        user resultUser = service.userLogin(PK, password);
        if (resultUser != null){
            return resultUser.getUsername();

        }else {
            return "没找到！";
        }
    }
}
