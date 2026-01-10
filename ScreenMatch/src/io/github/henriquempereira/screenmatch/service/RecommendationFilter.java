package io.github.henriquempereira.screenmatch.service;

public class RecommendationFilter {

    public void filter(Classificable classificable) {
        if(classificable.ratingForThisTitle() >= 5) {
            System.out.println("Este filme é muito bom!");
        } else {
            System.out.println("Quem sabe você goste...");
        }
    }
}
