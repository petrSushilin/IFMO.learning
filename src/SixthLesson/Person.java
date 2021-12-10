package SixthLesson;

public abstract class Person implements PersonInterface{

    private String name = null;
    private String surname = null;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
