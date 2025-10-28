package br.com.minhaempresa.model;

public class Product {
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

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount (double discount) {
        this.price = ((100-discount)*this.price)/100;
    }

    public void showProductInfos () {
        System.out.println("O produto " + this.name + " está por " + this.price);
    }
}
