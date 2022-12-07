package ru.skyeng;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {

        System.out.println("Задача 1");
        System.out.println();

        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println();
    }

    public static void task2() {

        System.out.println("Задача 2");
        System.out.println();

        for (int i = 10; i > 1; i--) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println();
    }

    public static void task3() {

        System.out.println("Задача 3");
        System.out.println();

        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println();
    }

    public static void task4() {

        System.out.println("Задача 4");
        System.out.println();

        for (int i = 10; i > -10; i--) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println();
    }

    public static void task5() {

        System.out.println("Задача 5");
        System.out.println();

        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println("Високосный год: " + i);
        }

        System.out.println();
        System.out.println();
    }

    public static void task6() {

        System.out.println("Задача 6");
        System.out.println();

        for (int i = 7; i < 100; i = i + 7) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println();
    }

    public static void task7() {

        System.out.println("Задача 7");
        System.out.println();

        for (int i = 1; i < 1000; i = i * 2) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println();
    }

    public static void task8() {

        System.out.println("Задача 8");
        System.out.println();

        int monthlyAccumulation = 29_000;
        int total = 0;

        for (int i = 1; i <= 12; i++) {
            total = total + monthlyAccumulation;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total +
                    " рублей");
        }

        System.out.println();
        System.out.println();
    }

    public static void task9() {

        System.out.println("Задача 9");
        System.out.println();
        int monthlyAccumulation = 29_000;
        int total = 0;

        for (int i = 1; i <= 12; i++) {
            total = total + total/100;
            total = total + monthlyAccumulation;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total +
                    " рублей");
        }

        System.out.println();
        System.out.println();
    }

    public static void task10() {

        System.out.println("Задача 10");
        System.out.println();

        System.out.println();
        System.out.println();
    }



}