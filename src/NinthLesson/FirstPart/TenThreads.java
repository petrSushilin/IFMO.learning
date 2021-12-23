package NinthLesson.FirstPart;
/*
Напишите программу, в которой запускается 10 потоков и каждый из них выводит
числа от 0 до 100.
 */
public class TenThreads {
    public static void startThreads() {
        for (int i = 0; i < 10; i++) {
            Thread thread = new MyThreadForFirstPart();
            thread.start();
        }
    }
}
