package com.iotek.service.impl;

import com.iotek.dao.TrainMapper;
import com.iotek.model.Train;
import com.iotek.service.TrainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sakura¸¡³Á on 2018/8/3.
 */
@Service
public class TrainServiceImpl implements TrainService {
    @Resource
    private TrainMapper trainMapper;

    public void addNewTrain(Train train) {
        trainMapper.addNewTrain(train);
    }

    public void updateTrain(Train train) {
        trainMapper.updateTrain(train);
    }

    public void deleteTrain(Train train) {
        trainMapper.deleteTrain(train);
    }

    public List<Train> getTrain(int state) {
        return trainMapper.getTrain(state);
    }

    public List<Train> getTrainByPages(int state, int begin, int end) {
        return trainMapper.getTrainByPages(state,begin,end);
    }
}
