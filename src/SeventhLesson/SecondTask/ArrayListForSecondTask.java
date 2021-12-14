package SeventhLesson.SecondTask;

import SeventhLesson.MyScanner;

import java.io.IOException;
import java.util.ArrayList;

public class ArrayListForSecondTask extends ArrayList<String> {
    private static ArrayList<String> arrayList = new ArrayList<>();

    public static ArrayList<String> giveBasicArrayList() {
        arrayList.add(0, "aaaaaaaaaaaa");

        for (int i = 0; i < 10; i++) {
            String element = "aaaaaaaaaaaa";
            int length = element.length();
            element = element.substring(length - i, length);
            if (i != 0) arrayList.add(i, element);
        }

        arrayList.add(10, "aaaaaaaaaaaa");

        return arrayList;
    }

    public static ArrayList<String> giveMyArrayList() throws IOException {
        ArrayList<String> arrayList = MyScanner.createArrayList();
        return arrayList;
    }
}
