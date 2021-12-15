package SeventhLesson.FourthTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class Game {
    private static Map<User, Integer> playerMap;

    public static void report(InputScanner inputScanner) {
        ArrayList<String> playerNames;

        if (inputScanner.isDefaultPlayerNames()) {
            playerNames = inputScanner.createPlayersList();
        } else {
            playerNames = getDefaultPlayerNames();
        }

        playerMap = MapCreator.createNewMap(playerNames);

        System.out.println(playerMap);
    }

    private static ArrayList<String> getDefaultPlayerNames() {
        ArrayList<String> defaultPlayerNames = new ArrayList<>();

        defaultPlayerNames.add("Mike");
        defaultPlayerNames.add("Thomas");
        defaultPlayerNames.add("Anna");
        defaultPlayerNames.add("John");

        return defaultPlayerNames;
    }

    public static void getPoint(InputScanner inputScanner) {
        System.out.println("Введите имя игрока: ");

        String name = inputScanner.readLine();

        for (Map.Entry<User, Integer> entry : playerMap.entrySet()) {
            if (entry.getKey().getName().equals(name)) {
                System.out.println(entry.getValue());
            }
        }
    }
}
