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

    public static ArrayList<String> createPlayersList() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> playersNames = new ArrayList<>();

        System.out.print("Введите количество, не более 5 игроков: ");

        int number = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < number; i++) {
            System.out.print("Введите имя игрока: ");

            String name = bufferedReader.readLine();

            playersNames.add(name);
        }

        return playersNames;
    }
}
