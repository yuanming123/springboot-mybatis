package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author Administrator
 * @Date 2018/10/22 10:22
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("toIndex")
    public String selectByPrimaryKey(){
        int id = 1;
        User user = userService.selectByPrimaryKey(id);
        return "index";
    }
}
