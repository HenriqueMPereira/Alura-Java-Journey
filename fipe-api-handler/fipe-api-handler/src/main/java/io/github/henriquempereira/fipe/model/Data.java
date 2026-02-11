package io.github.henriquempereira.fipe.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Data(@JsonAlias("nome" ) String dataName,
                   @JsonAlias("codigo") String dataCode) {
}
