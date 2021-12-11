package SixthLesson.SuperclassAndSubclass;

public class Subclass extends Superclass {
    public Subclass(int anyInteger) {
        super(anyInteger);
    }

    public void printInteger() {
        System.out.println(anyInteger);
    }
}
