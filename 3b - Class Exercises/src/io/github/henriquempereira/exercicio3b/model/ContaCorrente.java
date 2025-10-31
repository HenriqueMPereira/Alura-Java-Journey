package io.github.henriquempereira.exercicio3b.model;

public class ContaCorrente extends ContaBancaria {
    public void cobrarTarifaMensal(double tarifa) {
        this.sacar(tarifa);
    }
}
