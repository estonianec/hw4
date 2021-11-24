package com.company;

public class Main {

    public static void main(String[] args) {

//	task1();
//    task2();
    task3();
//    task4();
//    task5();

    }
    public static void task1() {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int n = 10; n > 0; n--) {
            System.out.print(n + " ");
        }
    }
    public static void task2() {
        int friday = 5;
        for (int i = friday; i <= 31; i++) {
            if ((friday - i) % 7 == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
            }
        }
    }
    public static void task3() {
        int year = 2021;
        int startYear = year - 200;
        int finishYear = year + 100;
        while (startYear < finishYear) {
            if (startYear % 79 == 0) {
                System.out.println(startYear);
            }
            startYear++;
        }
    }
}
