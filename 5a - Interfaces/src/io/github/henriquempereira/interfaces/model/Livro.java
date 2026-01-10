package io.github.henriquempereira.interfaces.model;

import io.github.henriquempereira.interfaces.service.Calculavel;

public class Livro implements Calculavel {

    private double precoLivro;

    public double getPrecoLivro() {
        return precoLivro;
    }

    public void setPrecoLivro(double precoLivro) {
        this.precoLivro = precoLivro;
    }

    @Override
    public double calcularPrecoFinal() {
        return this.precoLivro * 0.8;
    }
}
