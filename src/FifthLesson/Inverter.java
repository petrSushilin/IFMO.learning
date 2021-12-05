package FifthLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 5.	Напишите метод, который инвертирует слова в строке.
Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.
 */

public class Inverter {

    public static String reverse(String[] array) {
        String reversed = "";
        for(int i = 0; i < array.length; ++i) {
            StringBuilder stringBuilder = new StringBuilder(array[i]);
            reversed += String.valueOf(stringBuilder.reverse()) + " ";
        }
        return reversed.trim();
    }

    public static String[] stringSplitter(String string) {
        String[] array = string.split(" ");
        return array;
    }

    public static String inputString() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("The given string is: ");
        String inputString = bufferedReader.readLine();
        return inputString;
    }

    public static void main(String[] args) throws IOException {
        String inputString = inputString();
        String[] array = stringSplitter(inputString);
        System.out.println("The string reversed word by word is: " + reverse(array));
    }
}
