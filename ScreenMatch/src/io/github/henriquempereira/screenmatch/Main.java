package io.github.henriquempereira.screenmatch;

import io.github.henriquempereira.screenmatch.model.Movie;
import io.github.henriquempereira.screenmatch.service.RecommendationFilter;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie filme1 = new Movie("O Sexto Sentido", 1999, 107);

        // Avaliando filme para ter uma média que será usada para testar o interface e classe filter
        filme1.setdRating(10);
        filme1.setdRating(8);
        System.out.println("A média do filme '" + filme1.getsName() + "' é : " + filme1.getdMedia());

        RecommendationFilter filter = new RecommendationFilter();
        filter.filter(filme1);

        Movie filme2 = new Movie("O Silêncio dos Inocentes", 1991, 118);

        var filme3 = new Movie("Clube da Luta", 1999, 139);

        ArrayList listFilmes = new ArrayList();
        // ou var listFilmes = new ArrayList();
        listFilmes.add(filme1);
        listFilmes.add(filme2);
        listFilmes.add(filme3);

        System.out.println(listFilmes); // Mudança do toString() como proposto pelo professor

        filme1.setiReleaseDate(1999);
        filme2.setiReleaseDate(1991);
        filme3.setiReleaseDate(1999);

        System.out.println(listFilmes);

    }
}