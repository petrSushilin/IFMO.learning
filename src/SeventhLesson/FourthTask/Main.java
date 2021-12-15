package SeventhLesson.FourthTask;

/*
Опишите класс User одним полем name. Добавьте конструктор, сеттер и геттер.
Создайте Map, в котором для каждого пользователя хранится количество очков,
заработанных в какой-то игре (Map <User, Integer>).
Напишите программу, которая считывает с консоли имя и показывает, сколько очков у какого пользователя.
Сами данные можно добавить в Map при создании или сгенерировать случайно.
 */

public class Main {
    public static void main(String[] args) {
        Game.report(new InputScanner());
        Game.getPoint(new InputScanner());
    }
}
