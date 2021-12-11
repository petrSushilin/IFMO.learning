package SixthLesson.UserSupAndSub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scanner {
    public static String setName() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = null;

        {
            try {
                System.out.print("Введите имя: ");
                name = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return name;
    }

    public static int setAge() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите возраст: ");

        int age = Integer.parseInt(bufferedReader.readLine());

        return age;
    }
}
