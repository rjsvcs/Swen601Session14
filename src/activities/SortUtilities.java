package activities;

import java.util.Random;

public class SortUtilities {
    private static final Random RNG = new Random(1);

    public static boolean sorted(int[] array) {
        for(int i=1; i<array.length; i++) {
            if(array[i] < array[i-1]) {
                return false;
            }
        }
        return true;
    }

    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    public static int[] makeArray(int size) {
        int[] array = new int[size];
        for(int i=0; i<array.length; i++) {
            array[i] = RNG.nextInt(size);
        }
        return array;
    }

    public static int[][] divide(int[] array) {
        int[] odds = new int[array.length/2];
        int[] evens = new int[array.length - odds.length];

        int evensIndex = 0;
        int oddsIndex = 0;

        for(int i=0; i<array.length; i++) {
            if(i % 2 == 0) {
                evens[evensIndex] = array[i];
                evensIndex++;
            } else {
                odds[oddsIndex] = array[i];
                oddsIndex++;
            }
        }

        return new int[][] { evens, odds };
    }

    public static int[] merge(int[] a, int[] b) {
        if(a.length == 0) {
            return b;
        } else if(b.length == 0) {
            return a;
        } else {
            int[] merged = new int[a.length + b.length];

            int i = 0;
            int j = 0;

            while (i < a.length && j < b.length) {
                if (a[i] < b[j]) {
                    merged[i + j] = a[i];
                    i++;
                } else {
                    merged[i + j] = b[j];
                    j++;
                }
            }


            if(i < a.length) {
                // some values remaining in a...copy them
                System.arraycopy(a, i, merged, i + j, a.length - i);
            } else if(j < b.length) {
                // some values remaining in b...copy them
                System.arraycopy(b, j, merged, i + j, b.length - j);
            }

            return merged;
        }
    }
}
