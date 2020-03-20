package com.lablll.labwork6;

/**
 * Sorting Strategy that uses selection sort
 * in reverse order
 * @param <T> array parameter
 */
public class ReverseSort<T extends Comparable<T>> implements Strategy<T> {

    /**
     * @param array array to sort
     * @return sorted array
     */
    @Override
    public T[] sort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min_id = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j].compareTo(array[min_id]) > 0) {
                    min_id = j;
                }

            T tmp = array[min_id];
            array[min_id] = array[i];
            array[i] = tmp;
        }

        return array;
    }
}
