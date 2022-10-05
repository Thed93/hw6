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
        int i = 0;
        while (total < 2_459_000) {
            total = total + total/100;
            total = total + salary;
            i++;
            System.out.println("Месяц: " + i + " , сумма накоплений равна " + total + " рублей.");

        }

        tuskNumber();
        int j = 0;
        while (j < 10) {
            j++;
            System.out.printf(j + " ");
        }
        System.out.println();
        while (j > 0) {
            System.out.printf(j + " ");
            j--;
        }

        tuskNumber();
        int population = 12_000_000;
        int year = 0;
        int calculatedPopulation = 1000;
        int fertility = 17;
        int mortality = 8;
        int populationChange;
        while (year < 10) {
            populationChange = population / calculatedPopulation * (fertility - mortality);
            population = population + populationChange;
            year++;
            System.out.println("Год " + year + " , численность населения составляет " + population);

        }

        tuskNumber();
        int deposit = 15000;
        int monthlyInterest = 7;
        int month = 0;
        int year1 = 0;
        while (year1 < 9) {
            month++;
            deposit = deposit + (deposit / 100 * monthlyInterest);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " , сумма накоплений " + deposit + " рублей.");
            }
            if (month % 12 == 0) {
                year1++;
            }
        }

        tuskNumber();
        int firsFriday = 3;
        int nextFriday = 0;
        int day = 0;
        while (day < 31) {
            day++;
            if (day == firsFriday) {
                System.out.println("Сегодня пятница " + firsFriday + "-е число. Необходимо подготовить отчет.");
            }
            if (day == firsFriday + nextFriday + 7) {
                firsFriday = 0;
                nextFriday = day;
                System.out.println("Сегодня пятница " + nextFriday + "-е число. Необходимо подготовить отчет.");
            }
        }

        tuskNumber();
        int year2 = 0;
        int thisYear = 2022;
        int trackingStartYear = thisYear - 200;
        int trackingEndYear = thisYear + 100;
        do {
            year2++;
            if (year2 % 79 == 0) {
                if (year2 > trackingStartYear) {
                    System.out.println(year2);
                }
            }
        } while (year2 < trackingEndYear);

        tuskNumber();
        int equal;
        for (int k = 1; k <= 10; k++) {
            equal = 2 * k;
            System.out.println(k + " * 2 = " + equal);

        }

    }
}
