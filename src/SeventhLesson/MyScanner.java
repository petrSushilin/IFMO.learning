package SeventhLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MyScanner {

    public static ArrayList<String> createArrayList() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> createdArrayList = new ArrayList<>();

        boolean ready = true;

        System.out.println("Остановка считывания списка происходит вводом слова \"стоп\"");

        while (ready) {
            String read = bufferedReader.readLine();

            if (!read.toLowerCase().equals("стоп")) {
                createdArrayList.add(read);
            } else if (read.toLowerCase().equals("стоп") || read != null) {
                ready = false;
                return createdArrayList;
            }
        }

        return createdArrayList;
    }
}
