package ThirdLesson;
import java.util.*;

public class TheNextIsBigger {
    public static boolean checkRow(int a, int b, int c){
        boolean flag;
        if (b > a) {
            if (c > b) {
                flag = true;
            } else flag = false;
        } else flag = false;
        return flag;
    }
    public static void main(String[] args) {
        System.out.println(checkRow(5, 10, 15));
    }
}
