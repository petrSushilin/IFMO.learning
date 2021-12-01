package com.learning.ifmo;

import java.util.Scanner;

public class FirstLessonPart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Задание 5.
        for (int i = 0; i < 3; i++) {
            int a4 = sc.nextInt();
            System.out.println(a4);
        }
        // Задание 6.
        int a5 = sc.nextInt();
        if (a5 % 2 != 0) {
            System.out.println("Нечетное");
        } else {
            if (a5 / 100 != 0) {
                System.out.println("Выход за пределы диапазона");
            } else {
                System.out.println("Четное");
            }
        }
    }
}
