package SecondLesson;

public class Main {
    public static void main(String[] args) {
        Phone iPhone = new Phone("iPhone", "13 PRO", Color.BLACK, 6.2, 1000, 1024, 6, 5000, true);
        Phone Xiaomi = new Phone("Xiaomi", "Redmi note 10 PRO", Color.WHITE, 6.0, 250, 128, 6, 4000, true);
        Phone Huawei = new Phone("Huawei", Color.RED, 5.2, true);
        Phone Samsung = new Phone("Samsung", "Galaxy Note 10", Color.GREEN, 256, 8, 4300);
        System.out.println(iPhone);
        Xiaomi.setCharged(false);
        System.out.println(Xiaomi);
        Huawei.setPrice(100);
        Huawei.setBattery(3200);
        System.out.println(Huawei);
        Samsung.setColor(Color.BLUE);
        System.out.println("Samsung price is " + Samsung.getPrice() + "$");
        Samsung.setPrice(800);
        System.out.println(Samsung);
    }
}