package com.iotek.dao;

import com.iotek.model.Manager;

/**
 * Created by sakura���� on 2018/7/30.
 */
public interface ManagerMapper {
    Manager getManagerByNamePass(Manager manager);
}
