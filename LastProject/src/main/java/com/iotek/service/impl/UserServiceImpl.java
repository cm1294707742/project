package com.iotek.service.impl;

import com.iotek.dao.UserMapper;
import com.iotek.model.User;
import com.iotek.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by sakura¸¡³Á on 2018/7/26.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    public User getUserByNamePass(User user) {
        return userMapper.getUserByNamePass(user);
    }

    public User getUserByName(User user) {
        return userMapper.getUserByName(user);
    }

    public void addNewUser(User user) {
        userMapper.addNewUser(user);
    }
}
