package com.iotek.service.impl;

import com.iotek.dao.WaitInterMapper;
import com.iotek.service.WaitInterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by sakura¸¡³Á on 2018/8/1.
 */
@Service
public class WaitInterServiceImpl implements WaitInterService {
    @Resource
    private WaitInterMapper waitInterMapper;
}
