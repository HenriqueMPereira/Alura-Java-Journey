package io.github.henriquempereira.screenmatch.model;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Episode {
    private String title;
    private int season;
    private Double rating;
    private LocalDate released;

    public Episode(String season, EpisodeData episodeData) {
        this.title = episodeData.title();
        this.season = Integer.parseInt(season);

        try {
            this.released = LocalDate.parse(episodeData.released());
        } catch (DateTimeParseException e) {
            this.released = null;
        }

        try {
            this.rating = Double.valueOf(episodeData.rating());
        } catch (NumberFormatException e){
            this.rating = 0.0;
        }
    }

    public String getTitle() {
        return title;
    }

    public int getSeason() {
        return season;
    }

    public LocalDate getReleased() {
        return released;
    }

    public Double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Title = " + title  +
                ", Season ='" + season +
                ", Released ='" + released +
                ", Rating ='" + rating + "\n";
    }
}
