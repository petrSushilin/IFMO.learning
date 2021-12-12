package SixthLesson.SuperclassAndSubclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Superclass {

    static int anyInteger;

    public Superclass() {
    }

    public static int scanner() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите число: ");

        anyInteger = Integer.parseInt(bufferedReader.readLine());

        return anyInteger;
    }
}
