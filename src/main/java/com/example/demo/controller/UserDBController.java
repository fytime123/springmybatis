package com.example.demo.controller;

import com.example.demo.entity.user;
import com.example.demo.redis.RedisUtil;
import com.example.demo.service.demoControllerService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDBController {

    @Autowired
    private demoControllerService service;

    @Autowired
    RedisUtil redisUtil;

    ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping("/getAge")
    public String getAge(@RequestParam("name") String name, @RequestParam("password") String password) {

        Object result = redisUtil.get("user");
        user resultUser = null;
        boolean isRedis = false;
        if(result==null){
            resultUser = service.userLogin(name, password);


            try {
                String content = objectMapper.writeValueAsString(resultUser);
                redisUtil.set("user",content);
                isRedis = false;
            }catch (Exception e){
                e.printStackTrace();
            }

        }else{
            String value = (String)result;
            try {
                resultUser = objectMapper.readValue(value, user.class);
            }catch (Exception e){
                e.printStackTrace();
            }
            isRedis = true;
        }

        if (resultUser != null) {
            return "该用户的年龄是：" + resultUser.getAge() + " isRedis="+isRedis;
        } else {
            return "用户名密码错误！";
        }
    }



}
