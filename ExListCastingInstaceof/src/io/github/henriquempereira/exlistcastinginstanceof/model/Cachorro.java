package io.github.henriquempereira.exlistcastinginstanceof.model;

public class Cachorro extends Animal{

    public Cachorro(String nome, String cor) {
        super(nome, cor);
    }

    public void abanarRabo() {
        System.out.println("Abanando o rabo...");
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Au Au!");
    }
}
