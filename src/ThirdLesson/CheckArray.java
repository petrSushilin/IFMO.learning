package ThirdLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CheckArray {
    public static boolean checkArray (int[] Array) {
        boolean flag = false;
        if (Array[0] == 3 || Array[Array.length - 1] == 3) {
            flag = true;
        }
        return flag;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] Array = new int[n];
        for (int i = 0; i < n; i++) {
            Array[i] = Integer.parseInt(bufferedReader.readLine());
        }
        System.out.println(checkArray(Array));
    }
}
