package ThirdLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class SortCheck {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }
        Arrays.sort(array);
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (array[i] == 1 || array[i] == 3) {
                flag = true;
                break;
            }
        }
        System.out.println(flag);
   }
}
