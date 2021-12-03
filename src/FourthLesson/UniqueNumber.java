package FourthLesson;

/*4.	Дан массив чисел.
Найдите первое уникальное в этом массиве число.
Например, для массива [1, 2, 3, 1, 2, 4] это число 3.
*/

public class UniqueNumber {
    public static int searchFirstUniqueNumber (int[] array) {
        String bufException = "";
        for (int i = 0; i < array.length; i++) {
            // Проверим содержится ли число с индексом i в исключениях
            if (isContains(bufException, array[i])) continue;
            // ищем "клонов" в массиве и записываем в список "клонов"
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    bufException += array[i];
                    break;
                }
            }
            // если не нашли выводим на печать
            if (!isContains(bufException, array[i])) {
                return array[i];
            }
        }
        return -1; // на всякий случай оставим тут -1
    }

    // Добавим метод, повышающий читаемость кода

    public static boolean isContains(String exceptions, int ai) {
        return exceptions.contains(String.valueOf(ai));
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 2, 1, 2, 2, 5}; // при выводе получим 3.
        System.out.println(searchFirstUniqueNumber(array));
    }
}
