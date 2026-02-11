package io.github.henriquempereira.fipe.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Brand(@JsonAlias("nome" ) String brandName,
                    @JsonAlias("codigo") String brandCode) {
}
