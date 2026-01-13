package io.github.henriquempereira.exercicioconstrutores;

import io.github.henriquempereira.exercicioconstrutores.model.Produto;
import io.github.henriquempereira.exercicioconstrutores.model.ProdutoPerecivel;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var produto1 = new Produto("Feijão", 8.99, 500);
        var produto2 = new Produto("Arroz", 30, 5000);
        var produto3 = new ProdutoPerecivel("Mussarela", 10.49, 1000, 15);
        List listaDeProduto = new ArrayList<>();

        listaDeProduto.add(produto1);
        listaDeProduto.add(produto2);
        listaDeProduto.add(produto3);

        System.out.println(listaDeProduto);

        System.out.println(produto3.getNome() + " custa " + produto3.getPreco() + " em gramas " + produto3.getQuantidade() +
                            " e validade é de " + produto3.getValidade() + " dias.");
    }
}