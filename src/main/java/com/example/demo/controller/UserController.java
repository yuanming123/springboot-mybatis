package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author Administrator
 * @Date 2018/10/22 10:22
 **/
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("toIndex")
    public String selectByPrimaryKey(Model model){
        int id = 1;
        User user = userService.selectByPrimaryKey(id);
        model.addAttribute("user",user);
        return "index";
    }
}
