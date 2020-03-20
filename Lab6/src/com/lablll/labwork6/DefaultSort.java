package com.lablll.labwork6;

import java.util.Arrays;

/**
 * Sorting Strategy that uses a built-in function
 * to sort the array
 *
 * @param <T> array type
 */
public class DefaultSort<T> implements Strategy<T> {

    /**
     * Sorts thee array using
     * an Arrays.sort function
     *
     * @param array array to sort
     * @return sorted array
     */
    @Override
    public T[] sort(T[] array) {
        Arrays.sort(array);
        return array;
    }
}
