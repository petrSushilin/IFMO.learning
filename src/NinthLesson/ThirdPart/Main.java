package NinthLesson.ThirdPart;
/*
Дан класс Counter.
Напишите программу, в которой запускается 100 потоков, каждый из которых
вызывает метод increment() 1000 раз.
После того, как потоки завершат работу, проверьте, чему равен count .
Если обнаружилась проблема, предложите ее решение.
 */
public class Main {
    public static void main(String[] args) {
        HundredThreads.createHundredThreads();
    }
}
