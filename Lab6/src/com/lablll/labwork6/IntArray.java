package com.lablll.labwork6;

/**
 * Class that holds an array of ints
 */
public class IntArray {
    /**
     * Array of integers
     */
    private Integer[] array;
    /**
     * Represents a sorting function used in sort() method
     */
    private Strategy<Integer> sortingStrategy = new DefaultSort<Integer>();

    /**
     * Constructor that does not
     * specify the sorting function
     *
     * @param array array of integers
     */
    public IntArray(Integer[] array) {
        this.array = array;
    }

    /**
     * Constructor
     *
     * @param array    array of integers
     * @param strategy sorting function to be used
     */
    public IntArray(Integer[] array, Strategy<Integer> strategy) {
        this.array = array;
        this.sortingStrategy = strategy;
    }

    /**
     * Changes the current sorting function
     *
     * @param sortingStrategy sorting function
     */
    public void setSortingStrategy(Strategy<Integer> sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    /**
     * Displays the array
     */
    public void show() {
        for (Integer integer : array) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    /**
     * Sort the array using sortingStrategy
     */
    public void sort() {
        sortingStrategy.sort(array);
    }

}
