package activities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static activities.SortUtilities.*;

class SortUtilitiesTest {
    @Test
    void sortedEmpty() {
        int[] array = {};

        boolean actual = sorted(array);

        assertTrue(actual);
    }

    @Test
    public void sortedOne() {
        int[] array = { 17 };

        boolean actual = sorted(array);

        assertTrue(actual);
    }

    @Test
    public void sortedSorted() {
        int[] array = { 2, 3, 5, 7, 11 };

        boolean actual = sorted(array);

        assertTrue(actual);
    }

    @Test
    public void sortedUnsorted() {
        int[] array = { 11, 2, 5, 3, 7 };

        boolean actual = sorted(array);

        assertFalse(actual);
    }

    @Test
    public void sortedSame() {
        int[] array = { 2, 2, 2, 2, 2 };

        boolean actual = sorted(array);

        assertTrue(actual);
    }

    @Test
    void swapSameIndex() {
        int[] array = { 3, 2, 1 };
        int[] expected = { 3, 2, 1 };

        swap(array, 1, 1);

        assertArrayEquals(expected, array);
    }

    @Test
    void swapLowToHigh() {
        int[] array = { 3, 2, 1 };
        int[] expected = { 1, 2, 3 };

        swap(array, 0, 2);

        assertArrayEquals(expected, array);
    }

    @Test
    void swapHighToLow() {
        int[] array = { 3, 2, 1 };
        int[] expected = { 2, 3, 1 };

        swap(array, 1, 0);

        assertArrayEquals(expected, array);
    }

    @Test
    void makeArray0() {

        int[] array = makeArray(0);

        assertEquals(0, array.length);
    }

    @Test
    void makeArray10() {
        int size = 10;

        int[] array = makeArray(size);

        assertEquals(size, array.length);
        for(int value : array) {
            assertTrue(0 <= value && value < size);
        }

    }

    @Test
    void divideEmpty() {
        int[] array = {};
        int[] evens = {};
        int[] odds = {};

        int[][] actual = divide(array);

        assertEquals(2, actual.length);
        assertArrayEquals(evens, actual[0]);
        assertArrayEquals(odds, actual[1]);
    }

    @Test
    void divideOne() {
        int[] array = { 5 };
        int[] evens = { 5 };
        int[] odds = {};

        int[][] actual = divide(array);

        assertEquals(2, actual.length);
        assertArrayEquals(evens, actual[0]);
        assertArrayEquals(odds, actual[1]);
    }

    @Test
    void divideTwo() {
        int[] array = { 7, 11 };
        int[] evens = { 7 };
        int[] odds = { 11 };

        int[][] actual = divide(array);

        assertEquals(2, actual.length);
        assertArrayEquals(evens, actual[0]);
        assertArrayEquals(odds, actual[1]);
    }

    @Test
    void divideFive() {
        int[] array = { 2, 3, 5, 7, 11 };
        int[] evens = { 2, 5, 11 };
        int[] odds = { 3, 7 };

        int[][] actual = divide(array);

        assertEquals(2, actual.length);
        assertArrayEquals(evens, actual[0]);
        assertArrayEquals(odds, actual[1]);
    }

    @Test
    void mergeEmpty() {
        int[] a = {};
        int[] b = {};
        int[] expected = {};

        int[] actual = SortUtilities.merge(a, b);

        assertArrayEquals(expected, actual);
    }

    @Test
    void mergeOneLeft() {
        int[] a = { 3 };
        int[] b = {};
        int[] expected = { 3 };

        int[] actual = SortUtilities.merge(a, b);

        assertArrayEquals(expected, actual);
    }

    @Test
    void mergeOneRight() {
        int[] a = {};
        int[] b = { 5 };
        int[] expected = { 5 };

        int[] actual = SortUtilities.merge(a, b);

        assertArrayEquals(expected, actual);
    }

    @Test
    void mergeLeftOneRightOne() {
        int[] a = { 7 };
        int[] b = { 11 };
        int[] expected = { 7, 11 };

        int[] actual = SortUtilities.merge(a, b);

        assertArrayEquals(expected, actual);
    }

    @Test
    void mergeRightOneLeftOne() {
        int[] a = { 5 };
        int[] b = { 3 };
        int[] expected = { 3, 5 };

        int[] actual = SortUtilities.merge(a, b);

        assertArrayEquals(expected, actual);
    }

    @Test
    void mergeEven() {
        int[] a = { 1, 3, 5, 7 };
        int[] b = { 2, 4, 6, 8 };
        int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8 };

        int[] actual = SortUtilities.merge(a, b);

        assertArrayEquals(expected, actual);
    }

    @Test
    void mergeOdd() {
        int[] a = { 1, 3, 5, 7, 9 };
        int[] b = { 2, 4, 6, 8 };
        int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int[] actual = SortUtilities.merge(a, b);

        assertArrayEquals(expected, actual);
    }
}