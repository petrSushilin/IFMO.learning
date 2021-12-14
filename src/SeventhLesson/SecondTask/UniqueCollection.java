package SeventhLesson.SecondTask;

import java.io.IOException;
import java.util.*;

/*
Написать метод, который на входе получает коллекцию объектов,
а возвращает коллекцию уже без дубликатов.
 */

public class UniqueCollection {

    public static void main(String[] args) {
        String type = chooseType();
        ArrayList<String> arrayList = new ArrayList<>();

        try {
             arrayList = createList(type);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(onlyUnique(arrayList));
    }

    public static Set<String> onlyUnique(List<String> inputList) {
        Set returnSet = new HashSet();

        for (String string : inputList) returnSet.add(string);

        return returnSet;
    }

    public static String chooseType() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вы хотите ввести свой список?");

        String userAnswer = scanner.nextLine();

        String type = null;

        if (userAnswer.equalsIgnoreCase("да")) {
            type = "свой";
        } else if (userAnswer.equalsIgnoreCase("нет")) {
            type = "базовый";
        } else System.err.println("ERROR! Некорректный ввод!");
        return type;
    }

    public static ArrayList<String> createList(String type) throws IOException {
        ArrayListForSecondTask bufferedObject = new ArrayListForSecondTask();

        ArrayList<String> createdArrayList = new ArrayList<>();

        if (type.equals("свой")) {
            createdArrayList = bufferedObject.giveMyArrayList();
        } else if (type.equals("базовый")) {
            createdArrayList = bufferedObject.giveBasicArrayList();
        }

        return createdArrayList;
    }
}
