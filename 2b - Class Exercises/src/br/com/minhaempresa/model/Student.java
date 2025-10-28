package br.com.minhaempresa.model;

public class Student {
    private String name;
    private double score1;
    private double score2;
    private double score3;

    public Student(String name, double score1, double score2, double score3) {
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore1() {
        return score1;
    }

    public void setScore1(double score1) {
        this.score1 = score1;
    }

    public double getScore2() {
        return score2;
    }

    public void setScore2(double score2) {
        this.score2 = score2;
    }

    public double getScore3() {
        return score3;
    }

    public void setScore3(double score3) {
        this.score3 = score3;
    }

    public double getMedia(){
        double media = (this.score1 + this.score2 + this.score3)/3;
        return media;
    }
}