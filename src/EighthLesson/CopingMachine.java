package EighthLesson;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CopingMachine {
    public static void mergeFiles(String inputFile1Path, String inputFile2Path, String outputFilePath) {
        File inputFile1 = new File(inputFile1Path);
        File inputFile2 = new File(inputFile2Path);

        try {
            List<String> strings1 = ScanTextFormat.process(inputFile1);
            List<String> strings2 = ScanTextFormat.process(inputFile2);

            AppendList.process(strings1, outputFilePath);
            AppendList.process(strings2, outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFile(String inputFilePath, String outputFilePath) {
        File inputFile = new File(inputFilePath);

        try {
            List<String> strings = ScanTextFormat.process(inputFile);

            AppendList.process(strings, outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void appendString (String thisString, String outputFilePath) {
        File outputFile = new File(outputFilePath);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile,true))) {
            writer.write(thisString + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
