package br.com.minhaempresa.model;

public class Movie {
    private String name;
    private boolean includedInThePlan;
    private int yearReleased, numOfRating=0, movieLength;
    private double sumOfRating=0;

    public String getName() {
        return name;
    }

    public boolean isIncluded() {
        return includedInThePlan;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public int getMovieLength() {
        return movieLength;
    }

    public double getMedia () {
        return sumOfRating / numOfRating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncluded(boolean included) {
        includedInThePlan = included;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public void setMovieLength(int movieLength) {
        this.movieLength = movieLength;
    }

    public void showMovieInformations () {
        System.out.println("O nome do filme é: " + name);
        System.out.println("O ano de lançamento é: " + yearReleased);
        System.out.println("Duração em minutos: " + movieLength);
        System.out.println("Incluído no plano: " + includedInThePlan);
    }

    public void rateMovie (double dMovieRating ) {
        sumOfRating += dMovieRating;
        numOfRating++;
    }
}
