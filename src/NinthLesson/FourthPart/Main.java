package NinthLesson.FourthPart;
/*
Напишите программу, в которой создаются два потока, каждый из которых выводит
по очереди на консоль своё имя.
Начать можно с написания своего класс-потока, который выводит в бесконечном
цикле свое имя. Потом придется добавить синхронизацию с помощью wait() и
notify().
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Resource res = new Resource();

        Thread thread1 = new FirstThread(res);
        Thread thread2 = new SecondThread(res);

        thread1.start();
        thread2.start();
    }
}
