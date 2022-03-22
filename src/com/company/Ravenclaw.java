package com.company;

public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wise;
    private int witty;
    private int creation;

    public Ravenclaw(String name, int skillMagic, int transgression, int mind, int wise, int witty, int creation) {
        super(name, skillMagic, transgression);
        this.mind = mind;
        this.wise = wise;
        this.witty = witty;
        this.creation = creation;
    }
    public String toString() {
        return super.toString() + ", умен " + mind +
                ", мудр " + wise +
                ", остроумен " + witty +
                " и полон творчества " + creation;
    }

    public void compareStudent(Ravenclaw student) {
        if (this.getMind() > student.getMind()) {
            System.out.println(this.getName() + "умен, чем " + student.getName());
        } else if (this.getMind() < student.getMind()) {
            System.out.println(student.getName() + "умен, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " одинаково умны");
        }
        if (this.getWise() > student.getWise()) {
            System.out.println(this.getName() + "обладает большей мудростью, чем " + student.getName());
        } else if (this.getWise() < student.getWise()) {
            System.out.println(student.getName() + " обладает больше мудростью, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " обладают одинаковой мудростью");
        }
        if (this.getWitty() > student.getWitty()) {
            System.out.println(this.getName() + "обладает наибольшим остроумием, чем " + student.getName());
        } else if (this.getWitty() < student.getWitty()) {
            System.out.println(student.getName() + " обладает наибольшим остроумием, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " обладают одинаковым уровнем остроумия");
        }
        if (this.getCreation() > student.getCreation()) {
            System.out.println(this.getName() + "обладает большим уровнем творчества, чем " + student.getName());
        } else if (this.getCreation() < student.getCreation()) {
            System.out.println(student.getName() + " обладает большим уровнем творчества, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " обладают одинаковым уровнем творчества");
        }
    }
    public int getMind() {
        return mind;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreation() {
        return creation;
    }
}
