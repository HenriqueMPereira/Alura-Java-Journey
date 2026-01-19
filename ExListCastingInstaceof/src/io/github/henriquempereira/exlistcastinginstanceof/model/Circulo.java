package io.github.henriquempereira.exlistcastinginstanceof.model;

import io.github.henriquempereira.exlistcastinginstanceof.service.Forma;

public class Circulo implements Forma {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double calcularArea() {
        return (Math.PI * Math.pow(this.raio,2));
    }
}
