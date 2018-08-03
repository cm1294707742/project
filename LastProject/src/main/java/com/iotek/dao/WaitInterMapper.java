package com.iotek.dao;

import com.iotek.model.User;
import com.iotek.model.WaitInter;

import java.util.List;

/**
 * Created by sakura¸¡³Á on 2018/8/1.
 */
public interface WaitInterMapper {
    void updateWaitInterWistate(WaitInter waitInter);
    WaitInter getWaitInterById(WaitInter waitInter);
    void addNewWaitInterMapper(WaitInter waitInter);
    List<WaitInter> getWaitInterByUser(User user);
    List<WaitInter> getWaitInterByPage(int uid, int begin, int end );
    List<WaitInter> getWaitInter();
    List<WaitInter> getWaitInterByPageManager( int begin, int end );
}
