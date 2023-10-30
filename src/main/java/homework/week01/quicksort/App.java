package homework.week01.quicksort;

public class App {
    public static void main(String[] args) {
        int[] array = {8, 3, 2, 1, 5, 4, 0, 6, 9, 7};

        System.out.println("Unsorted array: ");
        QuickSort.printArray(array);

        QuickSort.quickSort(array, 0, array.length - 1);

        System.out.println("Sorted array: ");
        QuickSort.printArray(array);

    }
}
