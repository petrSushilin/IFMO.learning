package SixthLesson.SuperclassAndSubclass;

import java.io.IOException;

public class Subclass extends Superclass {

    public Subclass(int anyInteger) throws IOException {
        super(anyInteger);
    }

    public Subclass() {
        super();
    }

    public void printInteger() {
        System.out.print(anyInteger);
    }
}
