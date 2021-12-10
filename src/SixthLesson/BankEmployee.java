package SixthLesson;

public class BankEmployee extends Person  {

    String bankName;

    public BankEmployee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public void printInfo() {
        System.out.println("Hello, I am " + getClass().getSimpleName() + ". My name is " + getName() + " " + getSurname() + ", and I work in " + bankName + ".");
    }
}
