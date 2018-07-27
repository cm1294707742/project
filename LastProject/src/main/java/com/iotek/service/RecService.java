package com.iotek.service;

import com.iotek.model.Rec;

import java.util.List;

/**
 * Created by sakura¸¡³Á on 2018/7/26.
 */
public interface RecService {
    List<Rec> getRecByState(int state);
    List<Rec> getRecByPage(int state,int begin, int end);
}
