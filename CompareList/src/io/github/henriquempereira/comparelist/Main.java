package io.github.henriquempereira.comparelist;

import io.github.henriquempereira.comparelist.model.Titulo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Exercício 1 - ordenar lista de int usando Collections
        List<Integer> listaDeInt = new ArrayList<>();
        listaDeInt.add(13);
        listaDeInt.add(1);
        listaDeInt.add(5);
        listaDeInt.add(3);
        listaDeInt.add(1);
        System.out.println("Antes de ordenar: " + listaDeInt);
        Collections.sort(listaDeInt);
        System.out.println("Depois de ordenar:" + listaDeInt);

        // Exercício 2 e 3 - override compareTo da interface Comparable
        // e usando Collections.sort para ordenar a lista
        Titulo titulo1 = new Titulo("Piratas do Caribe");
        Titulo titulo2 = new Titulo("Harry Potter");
        Titulo titulo3 = new Titulo("Percy Jackson");
        List<Titulo> listaDeTitulo = new ArrayList<>();
        listaDeTitulo.add(titulo1);
        listaDeTitulo.add(titulo2);
        listaDeTitulo.add(titulo3);
        System.out.println(listaDeTitulo);
        Collections.sort(listaDeTitulo);
        System.out.println(listaDeTitulo);

        // Exercicio 4 - Criar ArrayList e LinkedList
        List<String> listaDeArray = new ArrayList<>();
        List<String> listaDeLinked = new LinkedList<>();

        listaDeArray.add("StringA");
        listaDeArray.add("StringB");
        listaDeLinked.add("String1");
        listaDeLinked.add("String2");

        System.out.println("ArrayList: " + listaDeArray);
        System.out.println("LinkedList: " + listaDeLinked);

        // Exercicio 5 - Polimorfismo de List
        List<String> listaTeste;
        listaTeste = new ArrayList<>();
        listaTeste.add("Teste1");
        listaTeste.add("Teste2");
        System.out.println("ArrayList: " + listaTeste);

        listaTeste = new LinkedList<>();
        listaTeste.add("TesteA");
        listaTeste.add("TesteB");
        System.out.println("ArrayList: " + listaTeste);
    }
}