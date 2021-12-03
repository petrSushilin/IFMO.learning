package FourthLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 1.	Напишите программу, которая проверяет отсортирован ли массив по возрастанию.
Если он отсортирован по возрастанию то выводится “OK”,
если нет, то будет выводиться текст “Please, try again”
 */

public class ArraySortedYet {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] array = new int[n];
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }
        if (array.length > 1) {
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    System.out.println("Please, try again");
                    flag = false;
                    break;
                }
            }
        }
        System.out.print(flag ? "OK\n" : "");
    }
}
