package io.github.henriquempereira.screenmatch;

import io.github.henriquempereira.screenmatch.model.Movie;
import io.github.henriquempereira.screenmatch.model.Series;
import io.github.henriquempereira.screenmatch.model.Title;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.List;

public class MainSecundaria {
    public static void main(String[] args) {
        Movie movie1 = new Movie("O Sexto Sentido", 1999);
        Movie movie2 = new Movie("O Silêncio dos Inocentes", 1991);
        var movie3 = new Movie("Clube da Luta", 1999);
        var movie4 = new Movie("A Vila", 2004);
        var serie1 = new Series("Breaking Bad", 2008);

        movie1.setdRating(10);
        movie2.setdRating(10);
        movie3.setdRating(9);
        movie4.setdRating(6);

        List<Title> watchedList = new ArrayList<>();
        watchedList.add(movie1);
        watchedList.add(movie2);
        watchedList.add(movie3);
        watchedList.add(movie4);
        watchedList.add(serie1);

        watchedList.forEach(title -> {
            if(title instanceof Movie && ((Movie) title).ratingForThisTitle() > 7){
                System.out.println(title.toString());
            }
        }); // Note que a saída não tem nem séries e nem notas menores que 7
    }
}
