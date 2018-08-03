package com.iotek.service;

import com.iotek.model.Train;

import java.util.List;

/**
 * Created by sakura¸¡³Á on 2018/8/3.
 */
public interface TrainService {
    void addNewTrain(Train train);
    void updateTrain(Train train);
    void deleteTrain(Train train);
    List<Train> getTrain(int state);
    List<Train> getTrainByPages(int state,int begin, int end);
}
