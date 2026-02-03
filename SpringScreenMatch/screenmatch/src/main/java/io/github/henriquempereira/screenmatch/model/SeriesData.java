package io.github.henriquempereira.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SeriesData(@JsonAlias("Title") String title,
                         @JsonAlias("imdbRating") Double rating,
                         @JsonAlias("totalSeasons") Integer numberOfSeasons) {
}
