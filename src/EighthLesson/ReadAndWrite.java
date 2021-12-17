package EighthLesson;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ReadAndWrite {
    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\peter\\Desktop\\Обучение ИТМО\\TestInput1.txt");
        File file2 = new File("C:\\Users\\peter\\Desktop\\Обучение ИТМО\\TestInput2.txt");

        try {
            List<String> strings1 = fromTxtToList(file1);
            List<String> strings2 = fromTxtToList(file2);

            fileCreator(strings1);
            fileCreator(strings2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileCreator(List<String> listWithInfo) {
        for (int i = 0; i < listWithInfo.size(); i++) {
            String thisString = listWithInfo.get(i);

            writeThisString(thisString);
            }
    }

    public static List<String> fromTxtToList (File file) throws IOException {
        List<String> listFromTxt = new ArrayList<>();

        String text;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((text = reader.readLine()) != null) {
                listFromTxt.add(text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listFromTxt;
    }

    public static void writeThisString (String string) {
        File file = new File("C:\\Users\\peter\\Desktop\\Обучение ИТМО\\TestOutput.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
