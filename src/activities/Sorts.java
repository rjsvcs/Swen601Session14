package activities;

import static activities.SortUtilities.*;

public class Sorts {
    public static void insertionSort(int[] array) {
        int partition = 0;
        while(partition < array.length) {
            int index = partition;
            while(index > 0 && array[index] < array[index-1]) {
                swap(array, index, index-1);
                index--;
            }
            partition++;
        }
    }

    public static int[] mergeSort(int[] array) {
        if(array.length < 2) {
            return array;
        } else {
            // divide
            int[][] divided = divide(array);
            // recursively sort
            int[] a = mergeSort(divided[0]);
            int[] b = mergeSort(divided[1]);
            // merge
            int[] merged = merge(a, b);
            return merged;
        }
    }
}
