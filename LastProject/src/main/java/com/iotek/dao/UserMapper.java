package com.iotek.dao;

import com.iotek.model.User;

/**
 * Created by sakura¸¡³Á on 2018/7/26.
 */
public interface UserMapper {
    User getUserByNamePass(User user);
    User getUserByName(User user);
    void addNewUser(User user);


}
