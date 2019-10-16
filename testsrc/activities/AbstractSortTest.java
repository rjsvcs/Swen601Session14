package activities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * All sort functions should be tested with the same tests. Rather than copy
 * and paste them, this class provides a common set of tests. If a new test is
 * needed, it should be added here.
 */
public abstract class AbstractSortTest {
    /**
     * Implemented by child classes; calls the actual sort and returns the
     * sorted array (in place sorts just return the array parameter after the
     * sort).
     *
     * @param array The array to be sorted.
     * @return The sorted array; may be a new array or the original array (if
     * sorted in place).
     */
    public abstract int[] sort(int[] array);

    @Test
    void sortEmpty() {
        int[] array = {};
        int[] expected = {};


        int[] actual = sort(array);

        assertArrayEquals(expected, actual);
    }

    @Test
    void sortOne() {
        int[] array = { 7 };
        int[] expected = { 7 };


        int[] actual = sort(array);

        assertArrayEquals(expected, actual);
    }

    @Test
    void sortSorted() {
        int[] array = { 2, 3, 5, 7, 11 };
        int[] expected = { 2, 3, 5, 7, 11 };


        int[] actual = sort(array);

        assertArrayEquals(expected, actual);
    }

    @Test
    void aortUnsorted() {
        int[] array = { 11, 2, 5, 3, 7 };
        int[] expected = { 2, 3, 5, 7, 11 };


        int[] actual = sort(array);

        assertArrayEquals(expected, actual);
    }

    @Test
    void sortSame() {
        int[] array = { 2, 2, 2, 2, 2 };
        int[] expected = { 2, 2, 2, 2, 2 };


        int[] actual = sort(array);

        assertArrayEquals(expected, actual);
    }

    @Test
    void sortInverse() {
        int[] array = { 11, 7, 5, 3, 2 };
        int[] expected = { 2, 3, 5, 7, 11 };


        int[] actual = sort(array);

        assertArrayEquals(expected, actual);
    }
}
