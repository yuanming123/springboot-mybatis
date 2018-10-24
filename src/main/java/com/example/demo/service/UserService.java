package com.example.demo.service;


import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.util.SerializeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

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
        Jedis jedis = new Jedis();
        byte[] bytes = jedis.get("user".getBytes());
        User user = null;
        if(bytes != null && bytes.length > 0){
            user = (User)SerializeUtil.unserialize(bytes);
        }else{
            user = userMapper.selectByPrimaryKey(id);
            jedis.set("user".getBytes(),SerializeUtil.serialize(user));
        }
        return user;
    }
}

