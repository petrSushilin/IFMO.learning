package SixthLesson.TruckTask;

public class Truck extends Automobile {

    int wheels = 0;
    int maxWight = 0;

    public Truck(String brand, String model, int wight, String classOfAutomobile, int maxSpeed, int wheels, int maxWight) {
        super(brand, model, wight, classOfAutomobile, maxSpeed);
        this.wheels = wheels;
        this.maxWight = maxWight;
    }

    @Override
    public String toString() {
        return "Автомобиль" +
                " " + brand + " модель " + model +
                ", его вес " + wight +
                ", количество колес - " + wheels +
                ". Автомиль относится к категории: " + classOfAutomobile +
                ", его максимальная скорость - " + maxSpeed +
                "км/ч, при максимальной загрузке " + maxWight +
                "кг.";
    }

    public void newWheels(int wheels) {
        this.wheels = wheels;
    }
}
