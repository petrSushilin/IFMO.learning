package SeventhLesson.ThirdTask;

import java.util.List;

public class MyTimer {
    private static int a = 0;
    private static int b = 1000000;

    public static long timerForArrayList(List<Integer> arrayList) {
        int buffered = 0;
        long time = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            buffered = arrayList.get(a + (int) (Math.random() * b));
        }

        time = System.currentTimeMillis() - time;

        return time;
    }

    public static long timerForLinkedList(List<Integer> linkedList) {
        int buffered = 0;
        long time = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            buffered = linkedList.get(a + (int) (Math.random() * b));
        }

        time = System.currentTimeMillis() - time;

        return time;
    }
}
