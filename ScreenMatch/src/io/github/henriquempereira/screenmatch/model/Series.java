package io.github.henriquempereira.screenmatch.model;

import io.github.henriquempereira.screenmatch.service.Classificable;

public class Series extends Title implements Classificable {
    private int iNumberOfSeasons;
    private int iNumberOfEpisodes;
    private int iDurationOfEpisode;

    public Series(String sName, int iReleaseDate) {
        super(sName, iReleaseDate);
    }

    public int getiNumberOfSeasons() {
        return iNumberOfSeasons;
    }

    public void setiNumberOfSeasons(int iNumberOfSeasons) {
        this.iNumberOfSeasons = iNumberOfSeasons;
    }

    public int getiNumberOfEpisodes() {
        return iNumberOfEpisodes;
    }

    public void setiNumberOfEpisodes(int iNumberOfEpisodes) {
        this.iNumberOfEpisodes = iNumberOfEpisodes;
    }

    public int getiDurationOfEpisode() {
        return iDurationOfEpisode;
    }

    public void setiDurationOfEpisode(int iDurationOfEpisode) {
        this.iDurationOfEpisode = iDurationOfEpisode;
    }

    @Override
    public int getiDurationTime() {
        return this.iDurationOfEpisode * this.iNumberOfEpisodes;
    }

    @Override
    public int ratingForThisTitle() {
        if(this.getiNumberOfViews() >= 100){
            return 10;
        }else {
            return 5;
        }
    }
}
