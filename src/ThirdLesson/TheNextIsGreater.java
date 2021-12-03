package ThirdLesson;

public class TheNextIsGreater {
    public static boolean checkRow(int a, int b, int c){
        boolean flag = false;
        if (b > a) {
            if (c > b) {
                flag = true;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        System.out.println(checkRow(5, 10, 15));
    }
}
