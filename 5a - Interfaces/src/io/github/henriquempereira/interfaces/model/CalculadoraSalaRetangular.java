package io.github.henriquempereira.interfaces.model;

import io.github.henriquempereira.interfaces.service.CalculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    private double dladoMaior;
    private double dladoMenor;

    public double getDLadoMaior() {
        return dladoMaior;
    }

    public void setDLadoMaior(double dladoMaior) {
        this.dladoMaior = dladoMaior;
    }

    public double getDLadoMenor() {
        return dladoMenor;
    }

    public void setDLadoMenor(double dladoMenor) {
        this.dladoMenor = dladoMenor;
    }

    @Override
    public double calcularArea() {
        return (this.dladoMaior * this.dladoMenor);
    }

    @Override
    public double calcularPerimetro() {
        return (2*(this.dladoMaior + this.dladoMenor));
    }
}
