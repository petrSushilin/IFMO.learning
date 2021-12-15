package SeventhLesson.ThirdTask;

import java.util.ArrayList;

public class MethodArrayList {
    public static ArrayList<Integer> createArrayList(int length) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            arrayList.add(i+1);
        }
        return arrayList;
    }
}
