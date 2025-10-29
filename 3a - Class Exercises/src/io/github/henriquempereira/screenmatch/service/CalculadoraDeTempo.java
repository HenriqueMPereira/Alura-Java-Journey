package io.github.henriquempereira.screenmatch.service;

import io.github.henriquempereira.screematch.model.Titulo;

public class CalculadoraDeTempo {
    private int durationTimeInMinutes;

    public void IncludeTitle(Titulo titulo) {
        durationTimeInMinutes += titulo.getDurationInMinutes();
    }

    public int getDurationTimeInMinutes() {
        return durationTimeInMinutes;
    }
}
