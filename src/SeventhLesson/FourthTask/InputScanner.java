package SeventhLesson.FourthTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class InputScanner {

    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public ArrayList<String> createPlayersList() {
        ArrayList<String> playerNames = new ArrayList<>();

        System.out.print("Введите количество, не более 5 игроков: ");

        int number = 0;

        while (true) {
            try {
                number = Integer.parseInt(readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число.");
            }
        }


        for (int i = 0; i < number; i++) {
            System.out.print("Введите имя игрока: ");

            String name = readLine();

            playerNames.add(name);
        }

        return playerNames;
    }

    public boolean isDefaultPlayerNames() {
        System.out.println("Вы хотите создать свой набор игроков?");

        do {
            String readString = readLine();

            if (readString.equalsIgnoreCase("да")) {
                return true;
            } else if (readString.equalsIgnoreCase("нет")) {
                return false;
            } else System.out.println("Неверный ввод, повторите попытку!");

        } while (true);
    }

    public String readLine() {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
