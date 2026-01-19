package io.github.henriquempereira.exlistcastinginstanceof.model;

public class Animal {
    private String nome;
    private String cor;

    public Animal(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCor() {
        return this.cor;
    }

    public void fazerBarulho() {
        System.out.println("aaaaaaaaaaa");
    }

}