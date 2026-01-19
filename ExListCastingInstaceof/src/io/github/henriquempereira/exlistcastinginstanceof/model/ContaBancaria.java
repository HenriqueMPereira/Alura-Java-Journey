package io.github.henriquempereira.exlistcastinginstanceof.model;

public class ContaBancaria {
    private double saldo;
    private String nome;

    public ContaBancaria(double saldo, String nome) {
        this.saldo = saldo;
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }
}
