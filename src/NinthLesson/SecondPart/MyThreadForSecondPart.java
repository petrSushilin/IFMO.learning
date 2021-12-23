package NinthLesson.SecondPart;
/*
Выведете состояние потока перед его запуском, после запуска и во время
выполнения.
 */
public class MyThreadForSecondPart extends Thread {
    @Override
    public void run() {
        int any = 1;
        for (int i = 0; i < 1000; i++) {
            any += any;
        }
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
