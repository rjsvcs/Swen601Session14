package activities;

import static activities.Sorts.mergeSort;

/**
 * Inherits the test methods from the parent class. Implements the sort
 * method to call insertion sort.
 */
public class MergeSortTest extends AbstractSortTest {
    @Override
    public int[] sort(int[] array) {
        // calls merge sort, and returns the sorted copy
        return mergeSort(array);
    }
}
