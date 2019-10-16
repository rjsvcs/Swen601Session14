package activities;

import org.junit.jupiter.api.Test;

import static activities.Sorts.insertionSort;
import static activities.Sorts.mergeSort;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {
    @Test
    void mergeSortEmpty() {
        int[] array = {};
        int[] expected = {};


        int[] actual = mergeSort(array);

        assertArrayEquals(expected, actual);
    }

    @Test
    void mergeSortOne() {
        int[] array = { 7 };
        int[] expected = { 7 };


        int[] actual = mergeSort(array);

        assertArrayEquals(expected, actual);
    }

    @Test
    void mergeSortSorted() {
        int[] array = { 2, 3, 5, 7, 11 };
        int[] expected = { 2, 3, 5, 7, 11 };


        int[] actual = mergeSort(array);

        assertArrayEquals(expected, actual);
    }

    @Test
    void mergeSortUnsorted() {
        int[] array = { 11, 2, 5, 3, 7 };
        int[] expected = { 2, 3, 5, 7, 11 };


        int[] actual = mergeSort(array);

        assertArrayEquals(expected, actual);
    }

    @Test
    void mergeSortSame() {
        int[] array = { 2, 2, 2, 2, 2 };
        int[] expected = { 2, 2, 2, 2, 2 };


        int[] actual = mergeSort(array);

        assertArrayEquals(expected, actual);
    }

    @Test
    void mergeSortInverse() {
        int[] array = { 11, 7, 5, 3, 2 };
        int[] expected = { 2, 3, 5, 7, 11 };


        int[] actual = mergeSort(array);

        assertArrayEquals(expected, actual);
    }
}
