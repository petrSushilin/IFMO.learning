package NinthLesson.SecondPart;
/*
Выведете состояние потока перед его запуском, после запуска и во время
выполнения.
 */
public class LogOfStates {
    public static void recordingOfStates() throws InterruptedException {
        Thread thread = new MyThreadForSecondPart();

        System.out.println(thread.getState());

        thread.start();
        System.out.println(thread.getState());

        Thread.sleep(500);
        System.out.println(thread.getState());

        Thread.sleep(500);
        System.out.println(thread.getState());
    }
}
