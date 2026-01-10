package io.github.henriquempereira.interfaces.model;

import io.github.henriquempereira.interfaces.service.Calculavel;

public class ProdutoFisico implements Calculavel {

    private double precoProdutoFisico;

    public double getPrecoProdutoFisico() {
        return precoProdutoFisico;
    }

    public void setPrecoProdutoFisico(double precoProdutoFisico) {
        this.precoProdutoFisico = precoProdutoFisico;
    }

    @Override
    public double calcularPrecoFinal() {
        return this.precoProdutoFisico * 1.1;
    }
}
