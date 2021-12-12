package SixthLesson.SuperclassAndSubclass;

import java.io.IOException;

public class Main {
    /*2.	Создайте два класса: главный и класс-наследник.

В главном классе:
●	создайте поле для ввода целого числа;

В классе-наследнике:
●	метод для вывода переменной из главного класса.

Создайте объект на основе класса наследника и выведите через метод переменную с главного класса.
     */

    public static void main(String[] args) throws IOException {
        Subclass subclass = new Subclass(Superclass.scanner());

        subclass.printInteger();
    }
}
