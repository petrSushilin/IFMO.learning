package FifthLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 4.	Имеются две строки.
Найти количество вхождений одной (являющейся подстрокой) в другую.*/

public class SubstringCounter {

    public static int substringCounter(String string, String substring) {
        int counter = 0;

        String[] bufferedArray = string.split(" ");

        for (int i = 0; i < bufferedArray.length; ++i) {
            if (bufferedArray[i].contains(substring)) ++counter;
        }

        return counter;
    }

    public static String inputSubstring() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите искомую строку: ");
        String inputSubstring = bufferedReader.readLine();
        bufferedReader.close();
        return inputSubstring.toLowerCase();
    }

    public static String inputString() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите исходную строку: ");
        String inputString = bufferedReader.readLine();
        return inputString.toLowerCase();
    }

    public static void main(String[] args) throws IOException {
        String string = inputString();
        String substring = inputSubstring();

        System.out.println(substringCounter(string, substring));
    }
}
