package com.company;

public abstract class Hogwarts {
    private int magicPower;
    private int transgression;
    private String name;

    public Hogwarts(String name, int magicPower, int transgression) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    public String toString() {
        return "Студент " + name +
                " Обладает силой магии " + magicPower +
                " и может трансгрессировать на расстояние " + transgression;
    }

    public void compareStudents(Hogwarts student) {
        if (this.getMagicPower() > student.getMagicPower()) {
            System.out.println(this.getName() + " обладает большей силой магии, чем " + student.getName());
        }else if (this.getMagicPower() == student.getMagicPower()){
            System.out.println(" Сила магии студента " + this.getName() + " равна силе магии студента " + student.getName());
        }else {
            System.out.println(student.getName() + " обладает большей силой магии, чем" + this.getName());
        }
        if (this.getTransgression() > student.getTransgression()) {
            System.out.println(this.getName() + " трансгрессируеют на большее расстояние, чем " + student.getName());
        }else if (this.getTransgression() == student.getTransgression()){
            System.out.println(this.getName() + " и " + student.getName() +
                    " могут трансгрессирировать на одинаковое расстояние");
        }else{
            System.out.println(student.getName() + " трансгрессируеют на большее расстояние, чем" + this.getName());
        }
    }
    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getMagicPower() {return magicPower;}

    public void setMagicPower(int magicPower) {this.magicPower = magicPower;}

    public int getTransgression() {return transgression;}

    public void setTransgression(int transgression) {this.transgression = transgression;}
}
