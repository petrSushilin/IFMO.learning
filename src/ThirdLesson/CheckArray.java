package ThirdLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckArray {
    public static boolean checkArray (int[] array) {
        boolean flag = array[0] == 3 || array[array.length - 1] == 3;
        return flag;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }
        System.out.println(checkArray(array));
    }
}
