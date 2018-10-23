package com.example.demo.service;


import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author Administrator
 * @Date 2018/10/22 9:42
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectByPrimaryKey(int id){
        return userMapper.selectByPrimaryKey(id);
    }
}

