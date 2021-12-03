package SecondLesson;

public class Phone {
    private String brand;
    private String model;
    private Color color;
    private double diagonal;
    private int price;
    private int ROM;
    private int RAM;
    private int battery;
    private boolean isCharged;

    public Phone(String brand, Color color, double diagonal, boolean isCharged) {
        this.brand = brand;
        this.color = color;
        this.diagonal = diagonal;
        this.isCharged = isCharged;
    }

    public Phone(String brand, String model, Color color, int ROM, int RAM, int battery) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.ROM = ROM;
        this.RAM = RAM;
        this.battery = battery;
    }

    public Phone(String brand, String model, Color color, double diagonal, int price, int ROM, int RAM, int battery, boolean isCharged) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.diagonal = diagonal;
        this.price = price;
        this.ROM = ROM;
        this.RAM = RAM;
        this.battery = battery;
        this.isCharged = isCharged;
    }

    public Phone() {

    }

    @Override
    public String toString() {
        return "Your phone is " +
                "" + brand +
                " " + model +
                ", color is " + color +
                ", " + diagonal +
                "inch, price " + price +
                "$, ROM " + ROM +
                "GB, RAM " + RAM +
                "GB, battery " + battery +
                "mAh. Charged: " + isCharged;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public int getROM() {
        return ROM;
    }

    public void setROM(int ROM) {
        this.ROM = ROM;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public boolean isCharged() {
        return isCharged;
    }

    public void setCharged(boolean charged) {
        isCharged = charged;
    }
}

