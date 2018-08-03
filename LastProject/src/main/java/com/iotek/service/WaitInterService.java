package com.iotek.service;

import com.iotek.model.User;
import com.iotek.model.WaitInter;

import java.util.List;

/**
 * Created by sakura¸¡³Á on 2018/8/1.
 */
public interface WaitInterService {
    void addNewWaitInterMapper(WaitInter waitInter);
    List<WaitInter> getWaitInterByUser(User user);
    List<WaitInter> getWaitInterByPage(int uid, int begin, int end );
    List<WaitInter> getWaitInter();
    List<WaitInter> getWaitInterByPageManager( int begin, int end );
    WaitInter getWaitInterById(WaitInter waitInter);
    void updateWaitInterWistate(WaitInter waitInter);
}
