package com.lablll.labwork6;

/**
 * Interface to use to define sorting function used in
 * IntArray
 *
 * @param <T> type of parameters in array
 */
public interface Strategy<T> {
    /**
     * Method that sorts the array
     *
     * @param array array to sort
     * @return sorted Array
     */
    T[] sort(T[] array);
}
