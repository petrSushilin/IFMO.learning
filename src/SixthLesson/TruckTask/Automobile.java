package SixthLesson.TruckTask;

public class Automobile {
    String brand = null;
    String model = null;
    int wight = 0;
    String classOfAutomobile = null;
    int maxSpeed = 0;

    public Automobile(String brand, String model, int wight, String classOfAutomobile, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.wight = wight;
        this.classOfAutomobile = classOfAutomobile;
        this.maxSpeed = maxSpeed;
    }

    public Automobile(String brand, String model, String classOfAutomobile) {
        this.brand = brand;
        this.model = model;
        this.classOfAutomobile = classOfAutomobile;
    }

    public Automobile() {
    }
}
