package br.com.minhaempresa.model;

public class PersonsAge {
    private String name;
    private int age;

    public PersonsAge(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getName () {
        return this.name;
    }

    public int getAge () {
        return this.age;
    }

    public void verifyAge () {
        if (this.age >= 18) {
            System.out.println(this.name + " é MAIOR de idade!");
        } else {
            System.out.println(this.name + " é MENOR de idade!");
        }
    }
}
