package EighthLesson;

public class Main {
    public static void main(String[] args) {
        CopingMachine copingMachine = new CopingMachine();

        copingMachine.copyFile("C:\\Users\\peter\\Desktop\\Обучение ИТМО\\TestInput1.txt",
                        "C:\\Users\\peter\\Desktop\\Обучение ИТМО\\TestOutput1.txt");


        copingMachine.mergeFiles("C:\\Users\\peter\\Desktop\\Обучение ИТМО\\TestInput1.txt",
                        "C:\\Users\\peter\\Desktop\\Обучение ИТМО\\TestInput2.txt",
                    "C:\\Users\\peter\\Desktop\\Обучение ИТМО\\TestOutput2.txt");

        copingMachine.appendString("Красную шапочку съели, потому что она не знала Java",
                       "C:\\Users\\peter\\Desktop\\Обучение ИТМО\\TestOutput2.txt");
    }
}
