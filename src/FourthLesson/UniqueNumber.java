package FourthLesson;

public class UniqueNumber {
    public static int searchFirstUniqueNumber (int[] array) {
        String bufException = "";
        for (int i = 0; i < array.length; i++) {
            if (bufException.contains(String.valueOf(array[i]))) {
                continue;
            }
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    bufException += array[i];
                    break;
                }
            }
            if (i == array.length - 1) {
                return array[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 1, 1, 2, 5};
        System.out.println(searchFirstUniqueNumber(array));
    }
}
