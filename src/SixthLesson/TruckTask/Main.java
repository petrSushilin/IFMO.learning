package SixthLesson.TruckTask;

/*
1.	Есть класс автомобиль. Добавьте класс Грузовик, который будет наследовать все от класса Автомобиль.

В классе Грузовик создайте поля:
●	количество колес;
●	максимальный вес.

Также создайте метод newWheels, который устанавливает новое значение в поле «количество колес» и выводит его в консоль.

В класс Грузовик сделайте конструктор, устанавливающий все значения в конструктор главного класса и все значения в класс Грузовик.
 */

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("MAN", "TGX", 5000, "C", 120, 4, 12000);
        System.out.println(truck);

        truck.newWheels(6);

        System.out.println(truck);
    }
}