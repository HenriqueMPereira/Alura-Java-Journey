package io.github.henriquempereira.exlistcastinginstanceof;

import io.github.henriquempereira.exlistcastinginstanceof.model.*;
import io.github.henriquempereira.exlistcastinginstanceof.service.Forma;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Primeiro Exercício - percorrer ArrayList de String
        List<String> listaString = new ArrayList<>();
        listaString.add("Hello World!");
        listaString.add("Estou aprendendo Java");
        listaString.add("Vou conseguir um bom emprego");

        listaString.forEach(System.out::println);

        // Casting de Objetos
        // Upcasting => "subindo" hierarquia, no caso, está tratando c1 como um animal (a1)
        Cachorro c1 = new Cachorro("Maju", "preto");
        Animal a1 = c1;
        a1.fazerBarulho();
        // a1.abanarRabo(); -> não é possível porque o upcasting faz com que o específico seja tratado como genéricp

        // Downcasting => "descendo" hierarquia
        Animal a2 = new Cachorro("Bella", "caramelo");
        if(a2 instanceof Cachorro){
            Cachorro c2 = (Cachorro) a2;
            a2.fazerBarulho();
            // a2.abanarRabo(); -> não é possível porque a2 só tem os métodos de Animal
            c2.abanarRabo(); // depois que eu garanti que a2 é um cachorro, fazendo o downcasting, consigo acessar
        } else {
            System.out.println("Class Cast Exception!!!");
        }

        List<Produto> listaDeProdutos = new ArrayList<>(3);
        Produto produto1 = new Produto("bola", 10, 3);
        Produto produto2 = new Produto("carrinho", 8, 3);
        Produto produto3 = new Produto("Barbie", 50, 5);
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        double soma = 0;
        for(Produto p : listaDeProdutos){
            soma += p.getQuantidade() * p.getPreco();
        }
        System.out.println("O total deu: " + soma);

        // Listas e Interface
        List<Forma> listaDeArea = new ArrayList<>();
        Circulo circulo1 = new Circulo(1);
        Circulo circulo2 = new Circulo(2);
        Quadrado quadrado1 = new Quadrado(2);
        Quadrado quadrado2 = new Quadrado(4);
        listaDeArea.add(circulo1);
        listaDeArea.add(circulo2);
        listaDeArea.add(quadrado1);
        listaDeArea.add(quadrado2);
        listaDeArea.forEach(item -> System.out.println(item.calcularArea()));

        List<ContaBancaria> listaDeConta = new ArrayList<>();
        ContaBancaria conta1 = new ContaBancaria(105, "Henrique");
        ContaBancaria conta2 = new ContaBancaria(2394, "Marcela");
        ContaBancaria conta3 = new ContaBancaria(129, "Herika");
        listaDeConta.add(conta1);
        listaDeConta.add(conta2);
        listaDeConta.add(conta3);
        // Sem alterar a lista
        int index = 0;
        for(int i = 1; i < listaDeConta.size(); i++){
            if(listaDeConta.get(index).getSaldo() < listaDeConta.get(i).getSaldo()){
                index = i;
            }
        }
        System.out.println("A maior conta é: " + listaDeConta.get(index).getNome());
        // Alterando a lista
        listaDeConta.sort(Comparator.comparingDouble(ContaBancaria::getSaldo).reversed());
        System.out.println("A maior conta é: " + listaDeConta.getFirst().getNome());
    }
}