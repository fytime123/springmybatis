package com.example.demo.dao;

import com.example.demo.entity.user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface UserLoginMapper {

    @Select("SELECT * FROM tb_user where username=#{name} and password=#{password}")
    List<user> find(String name,String password);
}
