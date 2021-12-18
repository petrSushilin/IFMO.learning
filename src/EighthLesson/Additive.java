package EighthLesson;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Additive {
    public static void process (String thisString, String outputFilePath) {
        File outputFile = new File(outputFilePath);

        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile,true))) {
            writer.write(thisString + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
