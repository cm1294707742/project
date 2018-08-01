package com.iotek.service.impl;

import com.iotek.dao.ManagerMapper;
import com.iotek.model.Manager;
import com.iotek.service.ManagerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by sakura¸¡³Á on 2018/7/31.
 */
@Service
public class ManagerServiceImpl implements ManagerService {
    @Resource
    private ManagerMapper managerMapper;

    public Manager getManagerByNamePass(Manager manager) {
        return managerMapper.getManagerByNamePass(manager);
    }
}
