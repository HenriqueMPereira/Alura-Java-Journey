package io.github.henriquempereira.screenmatch.model;

import io.github.henriquempereira.screenmatch.exception.LengthYearException;

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

    public Title(TitleOmdb tituloOmdb) {
        this.sName = tituloOmdb.Title();
        if(tituloOmdb.Year().length() > 4){
            throw new LengthYearException("Erro ao converter ano, pois o tamanho do ano é maior que 4");
        }
        this.iReleaseDate = Integer.valueOf(tituloOmdb.Year());
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

    @Override
    public String toString() {
        return "Nome: " + this.sName +
                "\nAno de lançamento: " + this.iReleaseDate +
                "\n";
    }
}
