package io.github.henriquempereira.audioplayer.model;

public class Audio {
    private String title;
    private int numberOfPlays;
    private int numberOfLikes;
    private double rating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPlays() {
        return numberOfPlays;
    }

    public void playAnAudio() {
        this.numberOfPlays++;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public void likeAnAudio() {
        this.numberOfLikes++;
    }

    public double getRating() {
        return rating;
    }
}
