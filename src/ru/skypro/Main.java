package ru.skypro;

public class Main {


    public static void main(String[] args) {
        System.out.println("\n" + "Задание №1.1");
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " , ");
        }

        System.out.println("\n" + "Задание №1.2");
        for (int i = 10; i > 0 ; i--) {
            System.out.print(i + " , ");
        }

        System.out.println("\n" + "Задание №1.3");
        for (int i = 0; i < 17; i++) {
            if ( i % 2 == 0) {
                System.out.print(i + " , ");
            }
        }

        System.out.println("\n" + "Задание №1.4");
        for (int i = 10; i >= -10 ; i--) {
            System.out.print(i + " , ");
        }

        System.out.println("\n" + "Задание №2.1");
        int startOfYears = 1904;
        int endOfYears = 2096;
        for (; startOfYears < endOfYears; startOfYears++) {
            if (startOfYears % 4 == 0) {
                System.out.println(startOfYears + " год является високосным.");
            }
        }
        System.out.println("\n" + "Задание №2.2");
        int endOfCountdown = 98;
        for (int i = 0; i <= endOfCountdown; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " , ");
            }
        }

        System.out.println("\n" + "Задание №2.3");
        endOfCountdown = 512;
        for (int i = 1; i <= endOfCountdown ; i = i * 2) {
            System.out.print(i + " , ");
        }

        System.out.println("\n" + "Задание №3.1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        int monthlyInterest;
        while (total < 2_459_000) {
            total = total + salary;
            monthlyInterest = total/100;
            total = total + monthlyInterest;
            i++;
            System.out.println("Месяц: " + i + " , сумма накоплений равна " + total + " рублей.");

        }

        System.out.println("\n" + "Задание №3.2");
        int j = 0;
        while (j < 10) {
            j++;
            System.out.print(j + " ");
        }
        System.out.println();
        while (j > 0) {
            System.out.print(j + " ");
            j--;
        }

        System.out.println("\n" + "Задание №3.3");
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

        System.out.println("\n" + "Задание №4.1");
        int deposit = 15000;
        int monthlyInterest1 = 7;
        int month = 0;
        int numberOfYearsOnDeposit = 9;
        int monthsOfYear = 12;
        int endOfCountdown1 = numberOfYearsOnDeposit * monthsOfYear;
        while (month < endOfCountdown1) {
            month++;
            deposit = deposit + (deposit / 100 * monthlyInterest1);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " , сумма накоплений " + deposit + " рублей.");
            }
        }


        System.out.println("\n" + "Задание №4.2");
        int firsFriday = 3;
        int nextFriday = firsFriday + 7;
        int day = 0;
        System.out.println("Сегодня пятница " + firsFriday + "-е число. Необходимо подготовить отчет.");
        while (day < 31) {
            day++;
            if (day == nextFriday) {
                System.out.println("Сегодня пятница " + nextFriday + "-е число. Необходимо подготовить отчет.");
                nextFriday = nextFriday + 7;
            }
        }

        System.out.println("\n" + "Задание №5.1");
        int thisYear = 2022;
        int trackingStartYear = thisYear - 200;
        int trackingEndYear = thisYear + 100;
        for (; trackingStartYear <= trackingEndYear; trackingStartYear++) {
            if (trackingStartYear % 79 == 0) {
                System.out.println(trackingStartYear);
            }
        }

        System.out.println("\n" + "Задание №5.2");
        int equal;
        for (int k = 1; k <= 10; k++) {
            equal = 2 * k;
            System.out.println(k + " * 2 = " + equal);

        }

    }
}
