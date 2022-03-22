package com.company;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int skillMagic, int transgression, int cunning, int determination, int ambition,
                     int resourcefulness, int lustForPower) {
        super(name, skillMagic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }
    public String toString() {
        return super.toString() + ", хитер " + cunning+
                ", решителен " + determination +
                ", амбициозен " + ambition+
                ", находчив " + resourcefulness +
                " и жаждет власти " + lustForPower;
    }
    public void compareStudent(Slytherin student) {
        if (this.getCunning() > student.getCunning()) {
            System.out.println(this.getName() + "хитрее, чем " + student.getName());
        } else if (this.getCunning() < student.getCunning()) {
            System.out.println(student.getName() + "хитрее, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " одинаково хитры");
        }
        if (this.getDetermination() > student.getDetermination()) {
            System.out.println(this.getName() + "обладает большей решительностью, чем " + student.getName());
        } else if (this.getDetermination() < student.getDetermination()) {
            System.out.println(student.getName() + " обладает большей решительностью, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " обладают одинаковой решительностью");
        }
        if (this.getAmbition() > student.getAmbition()) {
            System.out.println(this.getName() + " наиболее амбициозен, чем " + student.getName());
        } else if (this.getAmbition() < student.getAmbition()) {
            System.out.println(student.getName() + " наиболее амбициозен, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " обладают одинаковыми амбициями");
        }
        if (this.getResourcefulness() > student.getResourcefulness()) {
            System.out.println(this.getName() + "обладает наибольшей находчивостью, чем " + student.getName());
        } else if (this.getResourcefulness() < student.getResourcefulness()) {
            System.out.println(student.getName() + " обладает наибольшей находчивостью, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " обладают одинаковой находчивостью");
        }
        if (this.getLustForPower() > student.getLustForPower()) {
            System.out.println(this.getName() + " наиболее жаждет власти, чем " + student.getName());
        } else if (this.getLustForPower() < student.getLustForPower()) {
            System.out.println(student.getName() + " наиболее жаждет власти, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " обладают одинаковой жаждой власти");
        }
    }
    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }
}
