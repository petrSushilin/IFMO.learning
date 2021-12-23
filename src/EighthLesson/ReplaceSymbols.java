package EighthLesson;

public class ReplaceSymbols {
    public static String process(String string) {
        return string.replaceAll("[^A-Za-zА-Яа-я]", "\\$");
    }
}