package io.github.henriquempereira.interfaces.model;

import io.github.henriquempereira.interfaces.service.Tabuada;

public class TabuadaMultiplicacao implements Tabuada {

    private int iNumero;

    public int getiNumero() {
        return iNumero;
    }

    public void setiNumero(int iNumero) {
        this.iNumero = iNumero;
    }

    @Override
    public void mostrarTabuada() {
        int contador;
        System.out.println("Abaixo está a tabuada do: " + this.iNumero);
        for(contador = 0; contador <= 9; contador++){
            System.out.println(this.iNumero + " * " + contador + " = " + this.iNumero * contador);
        }
    }
}
