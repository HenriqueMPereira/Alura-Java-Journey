package io.github.henriquempereira.screematch.model;

public class Series extends Titulo{
    private int numberOfSeason;
    private int numberOfEp;
    private int timeOfEp;
    private int durationInMinutes;
    private boolean isItActive;

    public int getNumberOfSeason() {
        return this.numberOfSeason;
    }

    public void setNumberOfSeason(int numberOfSeason) {
        this.numberOfSeason = numberOfSeason;
    }

    public int getNumberOfEp() {
        return this.numberOfEp;
    }

    public void setNumberOfEp(int numberOfEp) {
        this.numberOfEp = numberOfEp;
    }

    public int getTimeOfEp() {
        return this.timeOfEp;
    }

    public void setTimeOfEp(int timeOfEp) {
        this.timeOfEp = timeOfEp;
    }

    public boolean isItActive() {
        return this.isItActive;
    }

    public void setItActive(boolean isItActive) {
        this.isItActive = isItActive;
    }

    @Override
    public int getDurationInMinutes() {
        return this.numberOfSeason * this.numberOfEp * this.timeOfEp;
    }
}
