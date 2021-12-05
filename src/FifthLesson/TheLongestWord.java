package FifthLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1.	Написать метод для поиска самой длинной строки.
 */

public class TheLongestWord {

    // Поисковик самого длинного слова в массиве
    public static String theLongestWord(String[] arrayWords) {
        String longestWord = "";
        for (String nextWord: arrayWords) {
            if (longestWord.length() < nextWord.length()) {
                longestWord = nextWord;
            }
        }
        return longestWord;
    }

    // Метод создания массива слов из любого текста
    public static String[] createArrayOfWords(String inputString) {
        inputString = inputString.replaceAll("[^A-Za-zА-Яа-я 1-9]", "");
        String[] arrayWords = inputString.split(" ");
        return arrayWords;
    }

    // Ввод текста
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
