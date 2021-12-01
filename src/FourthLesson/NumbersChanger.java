package FourthLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumbersChanger {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] array = new int[n];
        String bufString = bufferedReader.readLine();
        String[] bufArray = bufString.split(", ");
        System.out.println(Arrays.toString(bufArray));
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(bufArray[i]);
        }
        int bufferOne = array[0];
        int bufferTwo = array[n-1];
        array[n-1] = bufferOne;
        array[0] = bufferTwo;
        System.out.println(Arrays.toString(array));
    }
}
