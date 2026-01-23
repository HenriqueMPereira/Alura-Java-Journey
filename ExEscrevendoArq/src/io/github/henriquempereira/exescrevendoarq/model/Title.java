package io.github.henriquempereira.exescrevendoarq.model;

public class Title {
    private String name;
    private int duration;

    public Title(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Nome do título: " + this.name +
                "\nDuração em minutos: " + this.duration + "\n";
    }
}
