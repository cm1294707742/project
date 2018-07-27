package com.iotek.service;

import com.iotek.model.User;

/**
 * Created by sakura¸¡³Á on 2018/7/26.
 */
public interface UserService {
    User getUserByNamePass(User user);
    User getUserByName(User user);
    void addNewUser(User user);
}
