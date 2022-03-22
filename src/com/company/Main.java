package com.company;

public class Main {

    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 75, 78, 56, 75, 77);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейджер", 90,86,60,30,70);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 50, 45, 70, 60, 70);

        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг", 65, 56, 60, 45, 35, 60);
        Ravenclaw parvatiPatil = new Ravenclaw("Парвати Патил", 60, 58, 45, 50, 60, 45);
        Ravenclaw marcusBelbi = new Ravenclaw("Маркус Белби", 45, 30, 40, 25, 70, 75);

        Hufflepuff zachariahSmith = new Hufflepuff("Захария Смит", 70, 77, 69, 60, 33);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 65, 50, 58, 70, 80);
        Hufflepuff justinFletchley = new Hufflepuff("Джастин Фин-Флетчли", 77,75,80,30,20);

        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 78, 85, 70, 45, 70, 52, 85);
        Slytherin grahamMontagu = new Slytherin("Грехэм Монтегю", 45, 48, 50, 67, 25, 45, 50);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 42, 35, 45, 66, 45, 56, 20);

        System.out.println("harryPotter = " + harryPotter);
        System.out.println();

        System.out.println("sedricDiggory = " + cedricDiggory);
        System.out.println();

        dracoMalfoy.compareStudents(ronWeasley);
        System.out.println();

        zhouChang.compareStudent(parvatiPatil);
    }
}
