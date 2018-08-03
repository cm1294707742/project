package com.iotek.service.impl;

import com.iotek.dao.RecMapper;
import com.iotek.model.Rec;
import com.iotek.service.RecService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sakura¸¡³Á on 2018/7/26.
 */
@Service
public class RecServiceImpl implements RecService {
    @Resource
    private RecMapper recMapper;
    public List<Rec> getRecByState(int state) {
        return recMapper.getRecByState(state);
    }

    public List<Rec> getRecByPage(int state, int begin, int end) {
        return recMapper.getRecByPage(state,begin,end);
    }

    public Rec getRecById(Rec rec) {
        return recMapper.getRecById(rec);
    }
}
