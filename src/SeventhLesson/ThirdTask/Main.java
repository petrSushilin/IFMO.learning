package SeventhLesson.ThirdTask;

/*
Напишите метод, который добавляет 1 млн элементов в ArrayList и LinkedList.
Напишите метод, который выбирает из заполненного списка элемент наугад 100000 раз.
Замерьте время, которое потрачено на это.
Сравните результаты, предположите, почему они именно такие.
 */

import java.util.ArrayList;
import java.util.LinkedList;

import static SeventhLesson.ThirdTask.MethodArrayList.createArrayList;
import static SeventhLesson.ThirdTask.MethodLinkedList.createLinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = createArrayList(1000000);

        LinkedList<Integer> linkedList = createLinkedList(1000000);


        long timerArrayList = MyTimer.timerForArrayList(arrayList);

        System.out.println("Время на поиск 100000 значений в ArrayList " + timerArrayList  + " ms");

        long timerLinkedList = MyTimer.timerForLinkedList(linkedList);

        System.out.println("Время на поиск 100000 значений в LinkedList " + timerLinkedList  + " ms");

        /* Результат выполнения тестового прогона следующий:
        Время на поиск 100000 значений в ArrayList 21 ms
        Время на поиск 100000 значений в LinkedList 110895 ms
        Это связано с тем, что ArrayList владеет уникальными ссылками на каждый элемент списка,
        а LinkedList проходит, каждый раз при поиске элемента, весь список с начала.
         */
    }
}
