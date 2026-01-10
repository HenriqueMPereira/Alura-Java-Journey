package io.github.henriquempereira.screenmatch.service;

import io.github.henriquempereira.screenmatch.model.Title;

public class TimeCalculator {

    private int iSumOfDurationTime;

    public int iGetTotalOfDurationTime(){
        return iSumOfDurationTime;
    }

    public void SumOfDurationTime(Title title){
        this.iSumOfDurationTime += title.getiDurationTime();
    }
}
