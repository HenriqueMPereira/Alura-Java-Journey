package io.github.henriquempereira.desafiocartaodecredito.model;

public class Product implements Comparable<Product>{
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product otherProduct) {
        return Double.valueOf(this.price).compareTo(Double.valueOf(otherProduct.getPrice()));
    }
}
