package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by niuzl on 2019/10/23.
 */

@RestController
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserService userService;
    /**
     * 保存user信息
     * @param id
     * @param name
     * @param age
     */
    @RequestMapping("/set")
    public void set(String id,String name,int age){
        User user = new User(age,id,name);
        userService.save(user);
    }

    /**
     * 指定id的数据
     * @param id
     * @return
     */
    @RequestMapping("get/{id}")
    public User get(@PathVariable("id") String id){
        User user = userService.getUser(id);
        return user;
    }

    /**
     *
     * @param user
     */
    @RequestMapping("/updateUser")
    public void updateUser(User user){
        userService.updateByPrimaryKey(user);
    }

    /**
     *
     * @param id
     */
    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable("id") String id){
        userService.deleteByPrimaryKey(id);
    }
}