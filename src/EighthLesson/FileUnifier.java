package EighthLesson;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileUnifier {
    public static void process(String inputFile1Path, String inputFile2Path, String outputFilePath) {
        File inputFile1 = new File(inputFile1Path);
        File inputFile2 = new File(inputFile2Path);

        try {
            List<String> strings1 = TextFormatScanner.process(inputFile1);
            List<String> strings2 = TextFormatScanner.process(inputFile2);

            AppendList.process(strings1, outputFilePath);
            AppendList.process(strings2, outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
