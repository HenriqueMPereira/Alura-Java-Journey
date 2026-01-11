package io.github.henriquempereira.audioplayer.model;

public class PodCast extends Audio{
    private String autor;
    private String description;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public double getRating() {
        if(this.getNumberOfPlays() > 50){
            return 10;
        } else {
            return 5;
        }
    }
}
