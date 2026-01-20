package io.github.henriquempereira.desafiocartaodecredito.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreditCard {
    private String name;
    private double maxCredit;
    private double usedCredit;
    private List<Product> productsList = new ArrayList<>();

    public CreditCard(String name) {
        this.name = name;
    }

    public void setUsedCredit(double usedCredit) {
        if(this.usedCredit < this.maxCredit) {
            this.usedCredit = usedCredit;
        } else {
            System.out.println("Não há mais limite!!!");
        }
    }
    public void setMaxCredit(double maxCredit) {
        if(maxCredit >= 0 && maxCredit >= usedCredit) {
            this.maxCredit = maxCredit;
        } else if (maxCredit < 0) {
            throw new IllegalArgumentException("O valor não pode ser negativo");
        } else {
            throw new IllegalArgumentException("O crédito usado (" + this.usedCredit +") é maior que o valor digitado.");
        }
    }

    public String getName() {
        return name;
    }

    public double getMaxCredit() {
        return maxCredit;
    }

    public double getUsedCredit() {
        return usedCredit;
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    public void addProduct (Product newProduct) {
        if(this.maxCredit - this.usedCredit > newProduct.getPrice()){
            this.productsList.add(newProduct);
            this.usedCredit += newProduct.getPrice();
        } else {
            throw new IllegalArgumentException("O valor é maior que o seu saldo!");
        }
    }

    public void showProductsInTheList() {
        if (this.productsList.isEmpty()) {
            System.out.println("Não tem nenhum produto na lista!");
        } else {
            Collections.sort(this.productsList);
            this.productsList.forEach(product -> System.out.println(product.getName() + " : " + product.getPrice()));
        }
    }

    public void showInformations() {
        System.out.println("Titular: " + this.name);
        System.out.println("Saldo Total: " + this.maxCredit);
        System.out.println("Saldo Usado: " + this.usedCredit);
    }
}
