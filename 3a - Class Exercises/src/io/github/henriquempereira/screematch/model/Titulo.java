package io.github.henriquempereira.screematch.model;

public class Titulo {
    private String name;
    private int yearOfRelease;
    private int durationInMinutes;
    private boolean isIncludedInThePlan;
    private double sumOfRating;
    private double numberOfRating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public boolean isIncludedInThePlan() {
        return isIncludedInThePlan;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        isIncludedInThePlan = includedInThePlan;
    }

    public void rating (double score){
        this.sumOfRating += score;
        this.numberOfRating++;
    }

    public double getMedia (){
        return this.sumOfRating / this.numberOfRating;
    }
}
