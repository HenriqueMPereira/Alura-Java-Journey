package io.github.henriquempereira.exlistcastinginstanceof.model;

import io.github.henriquempereira.exlistcastinginstanceof.service.Forma;

public class Quadrado implements Forma {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double calcularArea() {
        return (Math.pow(lado, 2));
    }
}
