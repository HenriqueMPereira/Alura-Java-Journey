package io.github.henriquempereira.exercicio3b.model;

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    public void abanarORabo() {
        System.out.println("Abanando o rabo");
    }
}
