package io.github.henriquempereira.exexception.model;

public class DivisionOfNumbers {

    private double x;
    private double y;

    public DivisionOfNumbers(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculate() {
        if (y == 0) {
            throw new ArithmeticException("O valor do denominador não pode ser ZERO!!!");
        }
        return x / y;
    }
}
