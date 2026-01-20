package io.github.henriquempereira.screenmatch.model;

public class Title implements Comparable<Title>{
    private String sName;
    private int iReleaseDate;
    private int iDurationTime;
    private double dRating;
    private int iNumberOfReviews;
    private int iNumberOfViews;

    public Title(String sName, int iReleaseDate) {
        this.sName = sName;
        this.iReleaseDate = iReleaseDate;
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

    public void setiDurationTime(int iDurationTime) {
        this.iDurationTime = iDurationTime;
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

    @Override
    public int compareTo(Title otherTitle) {
        return this.sName.compareTo(otherTitle.getsName());
    }
}
