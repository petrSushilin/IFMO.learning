package EighthLesson;

public class CopingMachine {
    public static void mergeFiles(String inputFile1Path, String inputFile2Path, String outputFilePath) {
        FileUnifier.process(inputFile1Path, inputFile2Path,outputFilePath);
    }

    public static void copyFile(String inputFilePath, String outputFilePath) {
        Copier.process(inputFilePath, outputFilePath);
    }

    public static void appendString (String thisString, String outputFilePath) {
        Additive.process(thisString, outputFilePath);
    }
}
