package io.github.henriquempereira.screenmatch.model;

public class Title {
    private String sName;
    private int iReleaseDate;
    private int iDurationTime;
    private double dRating;
    private int iNumberOfReviews;
    private int iNumberOfViews;

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getiReleaseDate() {
        return iReleaseDate;
    }

    public void setiReleaseDate(int iReleaseDate) {
        this.iReleaseDate = iReleaseDate;
    }

    public int getiDurationTime() {
        return iDurationTime;
    }

    public void setiDurationTime(int iDurationTime) {
        this.iDurationTime = iDurationTime;
    }

    public double getdRating() {
        return dRating;
    }

    public int getiNumberOfViews() {
        return iNumberOfViews;
    }

    public void setiNumberOfViews(int iNumberOfViews) {
        this.iNumberOfViews = iNumberOfViews;
    }

    public void setdRating(double dRating) {
        this.dRating += dRating;
        this.iNumberOfReviews++;
    }

    public double getdMedia(){
        return (getdRating()/this.iNumberOfReviews);
    }

    @Override
    public String toString() {
        return "Filme: " + this.sName + " tem " + this.iDurationTime + " minutos e é de " + this.iReleaseDate + ".";
    }
}
