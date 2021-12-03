package FourthLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
2.	Напишите программу, которая считывает с клавиатуры длину массива
 (например, пользователь вводит цифру 4), затем пользователь вводит 4 числа
  и на новой строке выводится массив из 4 элементов.
 */

public class CreateNewArray {
    public static int[] createArray() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите длину массива: ");
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] array = new int[n];

        fillArray(array);

        return array;
    }

    public static int[] fillArray(int[] array) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите следующее число: ");
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }

        return array;
    }

    public static void main(String[] args) throws IOException {
        int[] array = createArray();
        System.out.println(Arrays.toString(array));
    }
}
