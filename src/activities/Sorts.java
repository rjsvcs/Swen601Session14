package activities;

import static activities.SortUtilities.swap;

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
}
