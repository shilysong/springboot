package com.itnoobking.controller;

import com.itnoobking.mapper.UserMapper;
import com.itnoobking.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {


    @Autowired
    private UserMapper usermapper;
    @RequestMapping("/queryUser")
    @ResponseBody

    public List<User> queryUser(){

     List<User> users=usermapper.queryUserList();

     return users;
    }
}
