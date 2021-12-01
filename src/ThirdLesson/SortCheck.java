package ThirdLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortCheck {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] Array = new int[n];
        for (int i = 0; i < n; i++) {
            Array[i] = Integer.parseInt(bufferedReader.readLine());
        }
        Arrays.sort(Array);
        String buf = "";
        for (int i = 0; i < n; i++) {
            if (Array[i] == 1 || Array[i] == 3) buf += "" + Array[i];
        }
        System.out.println(buf.contains("13"));
   }
}
