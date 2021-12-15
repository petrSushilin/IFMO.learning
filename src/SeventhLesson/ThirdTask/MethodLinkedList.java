package SeventhLesson.ThirdTask;

import java.util.LinkedList;

public class MethodLinkedList {
    public static LinkedList<Integer> createLinkedList(int length) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            linkedList.add(i+1);
        }
        return linkedList;
    }
}
