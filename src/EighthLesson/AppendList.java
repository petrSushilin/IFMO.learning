package EighthLesson;

import java.util.List;

public class AppendList {
    public static void process(List<String> listWithInfo, String outputFilePath) {
        for (String string : listWithInfo) {
            CopingMachine.appendString(ReplaceSymbols.process(string), outputFilePath);
        }
    }
}
