package io.github.henriquempereira.exercicio3b.model;

public class Veiculo {
    private String modelo;
    private double valorDoCarroAno1;
    private double valorDoCarroAno2;
    private double valorDoCarroAno3;

    public void mostraInformacao() {
        System.out.println("O modelo do carro eh: " + this.modelo);
        System.out.println("O valor do carro ano1: " + this.valorDoCarroAno1);
        System.out.println("O valor do carro ano2: " + this.valorDoCarroAno2);
        System.out.println("O valor do carro ano3: " + this.valorDoCarroAno3);
    }

    public void calculaExibeMaior() {
        double maiorValor = this.valorDoCarroAno1;
        if (maiorValor < this.valorDoCarroAno2) {
           maiorValor = this.valorDoCarroAno2;
        }
        if (maiorValor < this.valorDoCarroAno3) {
            maiorValor = this.valorDoCarroAno3;
        }
        System.out.println("O maior valor é: " + maiorValor);
    }

    public void calculaExibeMenor() {
        double menorValor = this.valorDoCarroAno1;
        if (menorValor > this.valorDoCarroAno2) {
            menorValor = this.valorDoCarroAno2;
        }
        if (menorValor > this.valorDoCarroAno3) {
            menorValor = this.valorDoCarroAno3;
        }
        System.out.println("O menor valor é: " + menorValor);
    }
    
    public double getvalorDoCarroAno1() {
        return valorDoCarroAno1;
    }

    public void setvalorDoCarroAno1(double valorDoCarroAno1) {
        this.valorDoCarroAno1 = valorDoCarroAno1;
    }

    public double getvalorDoCarroAno2() {
        return valorDoCarroAno2;
    }

    public void setvalorDoCarroAno2(double valorDoCarroAno2) {
        this.valorDoCarroAno2 = valorDoCarroAno2;
    }

    public double getvalorDoCarroAno3() {
        return valorDoCarroAno3;
    }

    public void setvalorDoCarroAno3(double valorDoCarroAno3) {
        this.valorDoCarroAno3 = valorDoCarroAno3;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
