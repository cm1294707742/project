package com.iotek.service.impl;

import com.iotek.dao.TitleMapper;
import com.iotek.service.TitleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by sakura¸¡³Á on 2018/8/3.
 */
@Service
public class TitleServiceImpl implements TitleService {
    @Resource
    private TitleMapper titleMapper;
}
