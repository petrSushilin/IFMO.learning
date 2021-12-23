package NinthLesson.ThirdPart;
/*
Дан класс Counter.
Напишите программу, в которой запускается 100 потоков, каждый из которых
вызывает метод increment() 1000 раз.
После того, как потоки завершат работу, проверьте, чему равен count .
Если обнаружилась проблема, предложите ее решение.
 */
public class HundredThreads {
    public static void createHundredThreads() {
        Counter counter = new Counter();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread();
            thread.start();
            for (int j = 0; j < 1000; j++) {
                counter.increment();
            }
        }
        System.out.println(counter.getCount());
    }
}
