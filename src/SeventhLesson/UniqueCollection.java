package SeventhLesson;

import java.io.IOException;
import java.util.*;

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
            type = "да";
        } else if (userAnswer.equalsIgnoreCase("нет")) {
            type = "нет";
        } else System.err.println("ERROR! Некорректный ввод!");
        return type;
    }

    public static ArrayList<String> createList(String type) throws IOException {
        ArrayListForSecondTask bufferedObject = new ArrayListForSecondTask();

        ArrayList<String> createdArrayList = new ArrayList<>();

        if (type.equals("да")) {
            createdArrayList = bufferedObject.giveMyArrayList();
        } else createdArrayList = bufferedObject.giveBasicArrayList();

        return createdArrayList;
    }
}
