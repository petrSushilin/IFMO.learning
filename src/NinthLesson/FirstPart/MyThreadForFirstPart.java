package NinthLesson.FirstPart;
/*
Напишите программу, в которой запускается 10 потоков и каждый из них выводит
числа от 0 до 100.
 */
public class MyThreadForFirstPart extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
