package activities;

import org.junit.jupiter.api.Test;

import static activities.Sorts.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertionSortTest {
    @Test
    void insertionSortEmpty() {
        int[] array = {};
        int[] expected = {};


        insertionSort(array);

        assertArrayEquals(expected, array);
    }

    @Test
    void insertionSortOne() {
        int[] array = { 7 };
        int[] expected = { 7 };


        insertionSort(array);

        assertArrayEquals(expected, array);
    }

    @Test
    void insertionSortSorted() {
        int[] array = { 2, 3, 5, 7, 11 };
        int[] expected = { 2, 3, 5, 7, 11 };


        insertionSort(array);

        assertArrayEquals(expected, array);
    }

    @Test
    void insertionSortUnsorted() {
        int[] array = { 11, 2, 5, 3, 7 };
        int[] expected = { 2, 3, 5, 7, 11 };


        insertionSort(array);

        assertArrayEquals(expected, array);
    }

    @Test
    void insertionSortSame() {
        int[] array = { 2, 2, 2, 2, 2 };
        int[] expected = { 2, 2, 2, 2, 2 };


        insertionSort(array);

        assertArrayEquals(expected, array);
    }

    @Test
    void insertionSortInverse() {
        int[] array = { 11, 7, 5, 3, 2 };
        int[] expected = { 2, 3, 5, 7, 11 };


        insertionSort(array);

        assertArrayEquals(expected, array);
    }
}
