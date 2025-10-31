package io.github.henriquempereira.exercicio3b.model;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    public void arranharMoveis() {
        System.out.println("Arranhando moveis");
    }
}
