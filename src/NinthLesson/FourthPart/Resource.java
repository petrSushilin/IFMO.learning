package NinthLesson.FourthPart;
/*
Напишите программу, в которой создаются два потока, каждый из которых выводит
по очереди на консоль своё имя.
Начать можно с написания своего класс-потока, который выводит в бесконечном
цикле свое имя. Потом придется добавить синхронизацию с помощью wait() и
notify().
 */
public class Resource {
    public int counter = 0;

    public void increment() {
        while (counter == 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        counter++;
        notify();
    }

    public void decrement() {
        while (counter == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        counter--;
        notify();
    }

}
