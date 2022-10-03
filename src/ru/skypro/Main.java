package ru.skypro;

public class Main {
    static int tusk;
    public static void tuskNumber() {
        tusk++;
        System.out.println("\n" + "Задание № " + tusk);
    }

    public static void main(String[] args) {
        tuskNumber();
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        tuskNumber();
        for (int i = 10; i > 0 ; i--) {
            System.out.println(i);
        }

        tuskNumber();
        for (int i = 0; i < 17; i++) {
            if ( i % 2 == 0) {
                System.out.println(i);
            }
        }

        tuskNumber();
        for (int i = 10; i >= -10 ; i--) {
            System.out.println(i);
        }

        tuskNumber();
        for (int i = 1904; i <  2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        tuskNumber();
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        tuskNumber();
        for (int i = 1; i <= 512 ; i = i * 2) {
            System.out.println(i);
        }

        tuskNumber();
        int salary = 29000;
        int total = 0;
        for (int i = 0; i <= 12; i++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц: " + i + " , сумма накоплений равна " + total + " рублей.");

        }


    }
}
