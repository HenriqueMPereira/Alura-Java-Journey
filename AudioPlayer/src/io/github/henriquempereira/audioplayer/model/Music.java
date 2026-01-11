package io.github.henriquempereira.audioplayer.model;

public class Music extends Audio{
    private String musicalGenre;
    private String nameOfSinger;
    private String musicAlbum;

    public String getMusicalGenre() {
        return musicalGenre;
    }

    public void setMusicalGenre(String musicalGenre) {
        this.musicalGenre = musicalGenre;
    }

    public String getNameOfSinger() {
        return nameOfSinger;
    }

    public void setNameOfSinger(String nameOfSinger) {
        this.nameOfSinger = nameOfSinger;
    }

    public String getMusicAlbum() {
        return musicAlbum;
    }

    public void setMusicAlbum(String musicAlbum) {
        this.musicAlbum = musicAlbum;
    }

    @Override
    public double getRating() {
        if(this.getNumberOfLikes() >= 100){
            return 10;
        } else if (this.getNumberOfLikes() >= 50) {
            return 7;
        } else {
            return 5;
        }
    }
}
