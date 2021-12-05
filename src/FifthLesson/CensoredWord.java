package FifthLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* 3.	Напишите метод, заменяющий в тексте все вхождения слова «бяка»
 на «[вырезано цензурой]».  */

public class CensoredWord {
    public static String censor(String primaryString) {
        if (primaryString.length() == 0) System.out.println("Вы ввели пустую строку, повторите попытку.");
        String censoredString = primaryString.replaceAll("бяка", "[вырезано цензурой]");
        return censoredString;
    }

    public static String inputString() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите ваш текст ");
        String inputString = bufferedReader.readLine();
        bufferedReader.close();
        return inputString;
    }

    public static void main(String[] args) throws IOException {
        String string = inputString();
        System.out.println(censor(string));
    }
}
