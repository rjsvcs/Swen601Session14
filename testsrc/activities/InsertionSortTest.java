package activities;

import static activities.Sorts.insertionSort;

/**
 * Inherits the test methods from the parent class. Implements the sort
 * method to call insertion sort.
 */
public class InsertionSortTest extends AbstractSortTest {
    @Override
    public int[] sort(int[] array) {
        // insertion sort is an in-place sort, so...
        insertionSort(array);
        // just return the array after it is sorted
        return array;
    }
}
