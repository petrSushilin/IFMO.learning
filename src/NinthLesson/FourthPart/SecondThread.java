package NinthLesson.FourthPart;
/*
Напишите программу, в которой создаются два потока, каждый из которых выводит
по очереди на консоль своё имя.
Начать можно с написания своего класс-потока, который выводит в бесконечном
цикле свое имя. Потом придется добавить синхронизацию с помощью wait() и
notify().
 */
public class SecondThread extends Thread {
    public Resource res;

    public SecondThread(Resource res) {
        this.res = res;
    }

    @Override
    public void run() {
        synchronized (res) {
            while (true) {
                res.decrement();
                System.out.println(getName());
            }
        }
    }
}
