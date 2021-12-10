package SixthLesson;


public class Main {
    public static void main(String[] args) {
        Client client = new Client("John", "Rangnick", "Bank of America");
        BankEmployee bankEmployee = new BankEmployee("Hanz", "Hilzer", "Deutsche Bank");

        client.printInfo();
        bankEmployee.printInfo();
    }
}
