package io.github.henriquempereira.screenmatch.model;

import io.github.henriquempereira.screenmatch.service.Classificable;

public class Movie extends Title implements Classificable {
    private String sDirector;

    public Movie(String sName, int iReleaseDate, int iDurationTime) {
        super(sName, iReleaseDate, iDurationTime);
    }

    public String getsDirector() {
        return sDirector;
    }

    public void setsDirector(String sDirector) {
        this.sDirector = sDirector;
    }

    @Override
    public int ratingForThisTitle() {
        if(this.getdMedia() >= 9){
            return 10;
        } else if (this.getdMedia() >= 5) {
            return 5;
        }else {
            return 3;
        }
    }

    @Override
    public String toString() {
        return "Filme: " + this.getsName() + " tem " + this.getiDurationTime() + " minutos e é de " + this.getiReleaseDate() + ".";
    }
}
