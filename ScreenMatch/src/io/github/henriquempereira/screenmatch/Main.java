package io.github.henriquempereira.screenmatch;

import io.github.henriquempereira.screenmatch.model.Movie;
import io.github.henriquempereira.screenmatch.model.Series;
import io.github.henriquempereira.screenmatch.service.RecommendationFilter;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("O Sexto Sentido", 1999);
        Movie movie2 = new Movie("O Silêncio dos Inocentes", 1991);
        var movie3 = new Movie("Clube da Luta", 1999);

        /*
         * Avaliando filme para ter uma média que será usada para testar a interface e classe filter
         */
        movie1.setdRating(10);
        movie1.setdRating(8);
        RecommendationFilter filter = new RecommendationFilter();
        filter.filter(movie1);


        /*
         * Criando ArrasList e inserindo os filmes na lista
         */
        ArrayList watchedList = new ArrayList();
        // ou var watchedList = new ArrayList();
        watchedList.add(movie1);
        watchedList.add(movie2);
        watchedList.add(movie3);

        System.out.println(watchedList); // Mudança do toString() como proposto pelo professor
    }
}