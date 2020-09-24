package com.itnoobking.controller;

import com.itnoobking.mapper.UserMapper;
import com.itnoobking.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {


    @Autowired
    private UserMapper usermapper;
    /**
     * 查询所有
     * @return
     */
    @RequestMapping("/findAll")
    public List<User> findAll(){
        System.out.println("test");
        return usermapper.findAll();
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping("/findById")
    public User findById(Integer id){
        System.out.println(id);
        return usermapper.findById(id);
    }

    /**
     * 更新
     * @param user
     */
    @RequestMapping("/updateUser")
    public void updateUser(@RequestBody User user){
        System.out.println(user);
        usermapper.updateUser(user);
    }

    /**
     * 新增用户信息
     * @param user
     */
    @RequestMapping("/insertUser")
    public void insertUser(@RequestBody User user){
        System.out.println(user);
        usermapper.insertUser(user);

    }

    /**
     * 删除用户信息
     * @param id
     */
    @RequestMapping("/deleteUsersById")
    public void deleteUserById(Integer id){
        System.out.println("delete");
        System.out.println(id);
        usermapper.deleteUsersById(id);
    }

}
