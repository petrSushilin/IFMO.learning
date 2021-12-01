package ThirdLesson;

public class CorrectSum {
    public static boolean checkSum (int a, int b, int c) {
        return a + b == c;
    }
    public static void main(String[] args) {
        System.out.println(checkSum(10, 5, 15));
    }
}
