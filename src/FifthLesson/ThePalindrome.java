package FifthLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
2.	Написать метод, который проверяет является ли слово палиндромом.
 */

public class ThePalindrome {
    public static boolean isPalindrome(String inputString) {
        int mid = inputString.length() / 2;
        String substring1 = "";
        String substring2 = "";
        boolean flag = true;

        if (inputString.length() % 2 == 0) {
            substring1 = inputString.substring(0, mid);
            substring2 = inputString.substring(mid);

            substring2 = wordConverter(substring2);
            System.out.println(substring1 + " " + substring2);
            for (int i = 0; i < mid; i++) {
                if (substring1.charAt(i) != substring2.charAt(i)) {
                   return !flag;
                }
            }
        }

        if (inputString.length() % 2 != 0) {
            substring1 = inputString.substring(0, mid + 1);
            substring2 = inputString.substring(mid);

            substring2 = wordConverter(substring2);
            for (int i = 0; i < mid; i++) {
                if (substring1.charAt(i) != substring2.charAt(i)) {
                    return !flag;
                }
            }
        }
        return flag;
    }

    public static String wordConverter(String secondPart) {
        StringBuilder bufferString = new StringBuilder(secondPart);
        secondPart = bufferString.reverse().toString();
        return secondPart;
    }

    public static String inputWord() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = bufferedReader.readLine();
        return inputString.trim();
    }

    public static void main(String[] args) throws IOException {
        String inputWord = inputWord();
        System.out.println(isPalindrome(inputWord));
    }
}
