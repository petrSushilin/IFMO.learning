package EighthLesson;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ScanTextFormat {
    public static List<String> process (File inputFile) throws IOException {
        List<String> listFromTxt = new ArrayList<>();

        String text;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            while ((text = reader.readLine()) != null) {
                listFromTxt.add(text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listFromTxt;
    }
}
