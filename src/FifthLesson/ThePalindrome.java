package FifthLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
2.	Написать метод, который проверяет является ли слово палиндромом.
 */

public class ThePalindrome {

    // Проверка полиндрома
    public static boolean isPalindrome(String inputString) {
        String reflectedWord = wordConverter(inputString);
        boolean flag = true;

        for (int i = 0; i < inputString.length(); ++i) {
            if (inputString.charAt(i) != reflectedWord.charAt(i)) {
                return !flag;
            }
        }

        return flag;
    }

    // Метод конвертации слова
    public static String wordConverter(String commonWord) {
        StringBuilder bufferString = new StringBuilder(commonWord);
        String convertedWord = bufferString.reverse().toString();
        return convertedWord;
    }

    public static String inputWord() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите, пожалуйста, слово: ");
        String inputString = bufferedReader.readLine().toLowerCase();
        bufferedReader.close();
        return inputString.trim();
    }

    public static void main(String[] args) throws IOException {
        String inputWord = inputWord();
        boolean isPalindrome = isPalindrome(inputWord);
        System.out.println(isPalindrome ? "Это слово палиндром" : "Это слово не палиндром");
    }
}
