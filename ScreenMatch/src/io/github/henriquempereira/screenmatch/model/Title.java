package io.github.henriquempereira.screenmatch.model;

public class Title {
    private String sName;
    private int iReleaseDate;
    private int iDurationTime;
    private double dRating;
    private int iNumberOfReviews;
    private int iNumberOfViews;

    public Title(String sName, int iReleaseDate, int iDurationTime) {
        this.sName = sName;
        this.iReleaseDate = iReleaseDate;
        this.iDurationTime = iDurationTime;
    }

    public String getsName() {
        return sName;
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

    public double getdRating() {
        return dRating;
    }

    public int getiNumberOfViews() {
        return iNumberOfViews;
    }

    public void setdRating(double dRating) {
        this.dRating += dRating;
        this.iNumberOfReviews++;
    }

    public double getdMedia(){
        return (getdRating()/this.iNumberOfReviews);
    }
}
