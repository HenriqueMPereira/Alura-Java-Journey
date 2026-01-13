package io.github.henriquempereira.exercicioconstrutores.model;

public class ProdutoPerecivel extends Produto{
    private int validadeEmDias;

    public ProdutoPerecivel(String nome, double preco, int quantidade, int validade) {
        super(nome, preco, quantidade);
        this.validadeEmDias = validade;
    }

    public int getValidade() {
        return this.validadeEmDias;
    }

}
