package SeventhLesson.FourthTask;

/*
Опишите класс User в одним полем name. Добавьте конструктор, сеттер и геттер.
Создайте Map, в котором для каждого пользователя хранится количество очков,
заработанных в какой-то игре (Map <User, Integer>).
Напишите программу, которая считывает с консоли имя и показывает, сколько очков у какого пользователя.
Сами данные можно добавить в Map при создании или сгенерировать случайно.
 */

import SeventhLesson.MyScanner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isOrigin = isOrigin();

        if (isOrigin == true) {
            ArrayList<String> names = new ArrayList<>();

            try {
                names = MyScanner.createPlayersList();
            } catch (IOException e) {
                e.printStackTrace();
            }

            HashMap<String, Integer> playersOriginMap =
                    (HashMap<String, Integer>) MapCreator.createNewMap(names);

            System.out.println(playersOriginMap);
        }

        if (isOrigin == false) {
            User player1 = new User("Anna");
            User player2 = new User("John");
            User player3 = new User("Mike");
            User player4 = new User("Thomas");

            ArrayList<String> basicPlayersNames = new ArrayList<>();

            basicPlayersNames.add(player1.getName());
            basicPlayersNames.add(player2.getName());
            basicPlayersNames.add(player3.getName());
            basicPlayersNames.add(player4.getName());

            HashMap<String, Integer> playersBasicMap =
                    (HashMap<String, Integer>) MapCreator.createNewMap(basicPlayersNames);
            System.out.println(playersBasicMap);
        }
    }

    public static boolean isOrigin() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вы хотите создать свой набор игроков?");

        String readString = scanner.nextLine();

        if (readString.equalsIgnoreCase("да")) {
            return true;
        } else if (readString.equalsIgnoreCase("нет")) {
            return false;
        } else System.err.println("Неверный ввод!");

        return false;
    }




}
