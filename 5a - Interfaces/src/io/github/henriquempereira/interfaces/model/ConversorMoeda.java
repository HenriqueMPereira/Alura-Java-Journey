package io.github.henriquempereira.interfaces.model;

import io.github.henriquempereira.interfaces.service.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {

    private double dQuantidadeReal;

    public double getdQuantidadeReal() {
        return dQuantidadeReal;
    }

    public void setdQuantidadeReal(double dQuantidadeReal) {
        this.dQuantidadeReal = dQuantidadeReal;
    }

    @Override
    public double converterDolarParaReal() {
        return (this.dQuantidadeReal/5.37);
    }
}
