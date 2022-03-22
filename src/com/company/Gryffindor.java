package com.company;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int skillMagic, int transgression, int nobility, int honor, int bravery) {
        super(name, skillMagic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public String toString() {
        return super.toString() + ", благороден " + nobility +
                ", Обладает честью " + honor +
                " и храбростью " + bravery;
    }

    public void compareStudent(Gryffindor student) {
        if (this.getNobiliti() > student.getNobiliti()) {
            System.out.println(this.getName() + "благороднее, чем " + student.getName());
        } else if (this.getNobiliti() < student.getNobiliti()) {
            System.out.println(student.getName() + "благороднее, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " одинаково благородны");
        }
        if (this.getHonor() > student.getHonor()) {
            System.out.println(this.getName() + "обладает большей честью, чем " + student.getName());
        } else if (this.getHonor() < student.getHonor()) {
            System.out.println(student.getName() + " обладает больше честью, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " обладают одинаковым уровнем чести");
        }
        if (this.getBravery() > student.getBravery()) {
            System.out.println(this.getName() + "обладает большей храбростью, чем " + student.getName());
        } else if (this.getBravery() < student.getBravery()) {
            System.out.println(student.getName() + " обладает большей храбростью, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " обладают одинаковым уровнем храбрости");
        }
    }

    public int getNobiliti() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
}
