package homework.week01.quicksort;

public class QuickSort {
    private static void swapValues(int[] array, int i, int j) {
        int tempValue = array[i];
        array[i] = array[j];
        array[j] = tempValue;
    }

    private static int partition(int[] array, int less, int greater) {
        int pivot = array[greater];
        int i = less - 1;

        for (int j = less; j <= greater - 1; j++) {
            if (array[j] < pivot) {
                i++;
                swapValues(array, i, j);
            }
        }
        swapValues(array, i + 1, greater);
        return i + 1;
    }

    public static void quickSort(int[] array, int less, int greater) {
        if (less < greater) {
            int partitioningIndex = partition(array, less, greater);
            quickSort(array, less, partitioningIndex - 1);
            quickSort(array, partitioningIndex + 1, greater);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
