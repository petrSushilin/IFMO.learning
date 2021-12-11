package SixthLesson.UserSupAndSub;

import java.io.IOException;

/*
3.	Создайте главный класс. Добавьте в него:
●	метод для получения возраста пользователя;

Создайте класс-наследник. Добавьте в него:
●	переопределенный метод для получения имени пользователя;

Создайте объект на основе класса-наследника и используйте для него метод из класса.

Подсказка: подумайте над переменными, так как объект класса Scanner удобнее создать лишь один раз в главном классе.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        UserSubclass userSubclass = new UserSubclass();

        userSubclass.name = Scanner.setName();

        userSubclass.age = Scanner.setAge();
        System.out.println(userSubclass);

        System.out.println(userSubclass.getName());

        System.out.println(userSubclass.getAge());
    }

}
