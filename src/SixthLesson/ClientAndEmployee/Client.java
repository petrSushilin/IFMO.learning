package SixthLesson.ClientAndEmployee;

public class Client extends Person {

    String bankName;

    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public void printInfo() {
        System.out.println("Hello, I am " + getClass().getSimpleName() + ". My name is " + getName() + " " + getSurname() + ", and I am a client of " + bankName + ".");
    }
}
