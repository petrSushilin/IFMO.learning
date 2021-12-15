package SeventhLesson.SecondTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CollectionScanner {
    public static ArrayList<String> createArrayList() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> createdArrayList = new ArrayList<>();

        System.out.println("Остановка считывания списка происходит вводом слова \"стоп\"");

        while (true) {
            String read = bufferedReader.readLine();

            if (!read.toLowerCase().equals("стоп")) {
                createdArrayList.add(read);
            } else break;
        }
        return createdArrayList;
    }
}
