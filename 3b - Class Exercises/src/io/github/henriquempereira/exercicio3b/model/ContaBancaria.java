package io.github.henriquempereira.exercicio3b.model;

public class ContaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double saldo) {
        this.saldo += saldo;
        System.out.println(saldo + " adicionado à conta!");
    }

    public void sacar(double saldo) {
        if(this.saldo <= saldo) {
            System.out.println("Saldo insuficiente!");
        } else{
            this.saldo -= saldo;
            System.out.println(saldo + " retirado da conta!");
        }
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo é: " + this.saldo);
    }
}
