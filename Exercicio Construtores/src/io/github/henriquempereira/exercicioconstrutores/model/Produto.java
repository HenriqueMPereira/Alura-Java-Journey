package io.github.henriquempereira.exercicioconstrutores.model;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmGramas;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmGramas = quantidade;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidadeEmGramas;
    }

    @Override
    public String toString() {
        return (this.nome + " custa " + this.preco + " em " + this.quantidadeEmGramas + " gramas");
    }
}
