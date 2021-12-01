package com.learning.ifmo;

public class FirstLesson {

    public static void sout() {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");
    }

    public static int fun1(int a1, int a2, int a3, int a4) {
        int fun1out = (a1 + a2) * (a3 / a4);
        return fun1out;
    }

    public static int fun2(int a1, int a2, int a3) {
        return a1 * a2 * a3;
    }

    public static int result(int a1) {
        return ((a1 / 10) / 10);
    }

    public static double doubleFun(double a1, double a2, double a3) {
        return a1 * a2 * a3;
    }

    public static void main(String[] args) {

        // Задание 1.
        sout();

        // Задание 2. Часть 1
        int a = 46;
        int b = 10;
        int c = 10;
        int d = 3;
        int out = fun1(a, b, c, d);
        System.out.println(out);

        // Задание 2. Часть 2
        int a1 = 29;
        int b1 = 4;
        int c1 = -15;
        int out1 = fun2(a1, b1, c1);
        System.out.println(out1);

        // Задание 3.
        int a2 = 10500;
        System.out.println(result(a2));

        // Задание 4.
        double a3 = 3.6, b3 = 4.1, c3 = 5.9;
        System.out.println(doubleFun(a3, b3, c3));
    }
}
