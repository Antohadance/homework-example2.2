package com.company;

public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int skillMagic, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, skillMagic, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public String toString() {
        return super.toString() + ", трудолюбив " + industriousness +
                ", Верует " + loyalty +
                " и наиболее честный " + honesty;
    }

    public void compareStudent(Hufflepuff student) {
        if (this.getIndustriousness() > student.getIndustriousness()) {
            System.out.println(this.getName() + "трудолюбивие, чем " + student.getName());
        } else if (this.getIndustriousness() < student.getIndustriousness()) {
            System.out.println(student.getName() + "трудолюбивие, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " одинаково трудолюбивы");
        }
        if (this.getLoyalty() > student.getLoyalty()) {
            System.out.println(this.getName() + "обладает большей верой, чем " + student.getName());
        } else if (this.getLoyalty() < student.getLoyalty()) {
            System.out.println(student.getName() + " обладает больше верой, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " обладают одинаковым уровнем веры");
        }
        if (this.getHonesty() > student.getHonesty()) {
            System.out.println(this.getName() + "наиболее честный, чем " + student.getName());
        } else if (this.getHonesty() < student.getHonesty()) {
            System.out.println(student.getName() + " наиболее честный , чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " обладают одинаковым уровнем чести");
        }
    }
    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
}
