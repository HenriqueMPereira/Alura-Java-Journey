import br.com.minhaempresa.model.Movie;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie();

        movie1.setName("Os Piratas do Caribe");
        movie1.setYearReleased(2005);
        movie1.setIncluded(true);
        movie1.setMovieLength(150);

        movie1.showMovieInformations();

        movie1.rateMovie(9.5);
        movie1.rateMovie(8.5);
        movie1.rateMovie(9);

        double mediaMovie1 = movie1.getMedia();
        System.out.println("A média de avaliação do filme1 é: " + mediaMovie1);

    }
}