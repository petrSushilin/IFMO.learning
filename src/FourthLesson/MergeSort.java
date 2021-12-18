package FourthLesson;

import java.util.Arrays;

/*5.	Заполните массив случайным числами и отсортируйте его.
Используйте сортировку слиянием.*/

public class MergeSort {

    public static int[] mergeSort(int[] array) {
        if (array.length < 2) {
            return array;
        }

        int middle = array.length / 2;
        int[] left = new int[middle];
        int[] right;
        if (array.length % 2 == 0) {
            right = new int[middle];
        } else {
            right = new int[middle + 1];
        }

        for (int i = 0; i < left.length; i++) {
            left[i] = array[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = array[middle + i];
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    public static int[] merge (int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;
        while (leftIndex < left.length || rightIndex < right.length) {
            if (leftIndex < left.length && rightIndex < right.length) {
                if (left[leftIndex] < right[rightIndex]) {
                    result[resultIndex++] = left[leftIndex++];
                } else {
                    result[resultIndex++] = right[rightIndex++];
                }
            } else if (leftIndex < left.length) {
                result[resultIndex++] = left[leftIndex++];
            } else if (rightIndex < right.length) {
                result[resultIndex++] = right[rightIndex++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {58, 23, 76, 14, 24, 78, 19, 45, 85, 15};
        System.out.println(Arrays.toString(mergeSort(array)));
    }
}