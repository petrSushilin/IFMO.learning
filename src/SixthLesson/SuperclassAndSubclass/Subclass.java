package SixthLesson.SuperclassAndSubclass;

import java.io.IOException;

public class Subclass extends Superclass {

    public Subclass(int anyInteger) {
        super(anyInteger);
    }

    public void printInteger() {
        System.out.print(anyInteger);
    }
}
