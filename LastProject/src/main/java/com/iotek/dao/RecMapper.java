package com.iotek.dao;

import com.iotek.model.Rec;

import java.util.List;

/**
 * Created by sakura¸¡³Á on 2018/7/26.
 */
public interface RecMapper {
    List<Rec> getRecByState(int state);
    List<Rec> getRecByPage(int state,int begin, int end);
}
