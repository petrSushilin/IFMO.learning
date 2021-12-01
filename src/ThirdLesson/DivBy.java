package ThirdLesson;

public class DivBy {
    public static void main(String[] args) {
        int counterForThree = 0;
        int counterForFive = 0;
        int counterForBoth = 0;
        for (int i = 1; i <= 100 ; i++) {
            if (i % 3 == 0) counterForThree++;
            if (i % 5 == 0) {
                if (i % 3 == 0) counterForBoth++;
                counterForFive++;
            }
        }
        System.out.println(counterForThree);
        System.out.println(counterForFive);
        System.out.println(counterForBoth);
    }
}
