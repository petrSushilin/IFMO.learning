package SixthLesson.SuperclassAndSubclass;

import java.io.IOException;

public class Subclass extends Superclass {

    public Subclass() {
        super();
    }

    public void printInteger() throws IOException {
        System.out.print(Superclass.scanner());
    }
}
