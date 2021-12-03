package FourthLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
3.	Напишите метод, который меняет местами первый и последний элемент массива.
Пример вывода:
Array 1: [5, 6, 7, 2]
Array 2: [2, 6, 7, 5]

 */

public class NumbersChanger {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Пожалуйста, введите длину массива: ");
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] array = new int[n];
        System.out.println("Пожалуйста, введите массив в формате \"1, 2, 3..., n\"");
        String bufString = bufferedReader.readLine();
        bufString = bufString.replaceAll(" ", "");
        String[] bufArray = bufString.split(",");
        System.out.println(Arrays.toString(bufArray));
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(bufArray[i]);
        }
        int bufferOne = array[0];
        int bufferTwo = array[n-1];
        array[n-1] = bufferOne;
        array[0] = bufferTwo;
        System.out.println(Arrays.toString(array));
    }
}
