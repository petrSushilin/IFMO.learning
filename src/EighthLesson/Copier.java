package EighthLesson;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Copier {
    public static void process(String inputFilePath, String outputFilePath) {
        File inputFile = new File(inputFilePath);

        try {
            List<String> strings = TextFormatScanner.process(inputFile);

            AppendList.process(strings, outputFilePath);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
