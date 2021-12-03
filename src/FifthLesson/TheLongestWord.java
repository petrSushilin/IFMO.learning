package FifthLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1.	Написать метод для поиска самой длинной строки.
 */

public class TheLongestWord {
    public static String theLongestWord(String[] arrayWords) {
        String longestWord = "";
        for (String i: arrayWords) {
            if (longestWord.length() < i.length()) {
                longestWord = i;
            }
        }
        return longestWord;
    }

    public static String[] createArrayOfWords(String inputString) {
        inputString = inputString.replaceAll("[^A-Za-zА-Яа-я 1-9]", "");
        String[] arrayWords = inputString.split(" ");
        return arrayWords;
    }

    public static String inputWordsScanner() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = bufferedReader.readLine();
        bufferedReader.close();
        return inputString;
    }

    public static void main(String[] args) throws IOException {
        String inputString = inputWordsScanner();
        String[] arrayWords = createArrayOfWords(inputString);
        String theLongestWord = theLongestWord(arrayWords);
        System.out.println(theLongestWord);
    }
}
