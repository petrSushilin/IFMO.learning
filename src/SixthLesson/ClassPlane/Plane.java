package SixthLesson.ClassPlane;

/*
4.	Создайте класс Самолет. В классе создайте вложенный класс крыло. Внутри класса Крыло реализуйте:
●	поле для хранения информации про вес крыла;
●	метод, что будет показывать вес крыла.

5.	Выполните предыдущее задание. В главном классе создайте объект и добавьте во вложенный класс данные про вес крыла,
 а также выведите информацию на экран. Создайте два объекта и добавьте разный вес для крыльев.
 */

public class Plane {

    public static void main(String[] args) {
        Wing wing1 = new Wing();

        wing1.setWeightWing(1400);

        System.out.println(wing1.getWeightWing());

        Wing wing2 = new Wing();

        wing2.setWeightWing(2000);

        System.out.println(wing2.getWeightWing());
    }

    static class Wing {
        int weightWing = 1000;

        public void setWeightWing(int weightWing) {
            this.weightWing = weightWing;
        }

        public int getWeightWing() {
            return weightWing;
        }
    }
}
