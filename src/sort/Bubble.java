package sort;

import java.util.Arrays;

public class Bubble {

    public static int[] sort(int[] array) {
        int[] arr = Arrays.copyOf(array, array.length);

        boolean sort = false;
        int temp;
        while (!sort) {
            sort = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sort = false;
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] array) {
        int temp;
        int[] arr = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            int minValue = arr[i];
            int minIndex = i;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                temp = arr[minIndex];
                arr[i] = minValue;
                arr[minIndex] = temp;
            }
        }
        return arr;
    }

    public static int[] insertionSort(int[] array) {
        int[] arr = Arrays.copyOf(array, array.length);
        int current, j, temp;

        for (int i = 0; i < arr.length; i++) {
            current = arr[i];
            j = i - 1;
            while (j >= 0 && current > arr[j]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }
        }
        return arr;
    }

}
