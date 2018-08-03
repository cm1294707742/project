package com.iotek.service.impl;

import com.iotek.dao.WaitInterMapper;
import com.iotek.model.User;
import com.iotek.model.WaitInter;
import com.iotek.service.WaitInterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sakura¸¡³Á on 2018/8/1.
 */
@Service
public class WaitInterServiceImpl implements WaitInterService {
    @Resource
    private WaitInterMapper waitInterMapper;

    public void addNewWaitInterMapper(WaitInter waitInter) {
        waitInterMapper.addNewWaitInterMapper(waitInter);
    }

    public List<WaitInter> getWaitInterByUser(User user) {
        return waitInterMapper.getWaitInterByUser(user);
    }

    public List<WaitInter> getWaitInterByPage(int uid, int begin, int end) {
        return waitInterMapper.getWaitInterByPage(uid,begin,end);
    }

    public List<WaitInter> getWaitInter() {
        return waitInterMapper.getWaitInter();
    }

    public List<WaitInter> getWaitInterByPageManager(int begin, int end) {
        return waitInterMapper.getWaitInterByPageManager(begin,end);
    }

    public WaitInter getWaitInterById(WaitInter waitInter) {
        return waitInterMapper.getWaitInterById(waitInter);
    }

    public void updateWaitInterWistate(WaitInter waitInter) {
        waitInterMapper.updateWaitInterWistate(waitInter);
    }
}
