package com.lablll.labwork5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Concrete Iterator that filters strings by their length
 */
public class FilteringIterator implements Iterator<String> {
    /**
     * ArrayList we work with
     */
    private ArrayList<String> list;
    /**
     * Current position
     */
    private int position = -1;
    /**
     * Length that the values might be less than or equal
     */
    private int lengthRequired;

    /**
     * Constructor
     *
     * @param arrayList inner value
     * @param length    max length to meet the requirements
     */
    public FilteringIterator(ArrayList<String> arrayList, int length) {
        list = arrayList;
        lengthRequired = length;
    }


    /**
     * Checks whether this value meets the requirements
     *
     * @param s string to be checked
     * @return true if its length is less than lengthRequired
     */
    private boolean accept(String s) {
        return s.length() <= lengthRequired;
    }


    /**
     * Goes through the list to find the next value to meet
     * the requirements, updates the value of position
     *
     * @return true if there is value after the initial
     * position that meets the requirements
     */
    @Override
    public boolean hasNext() {
        int tmp = position + 1;
        while (tmp < list.size()) {
            if (accept(list.get(tmp))) {
                position = tmp - 1; //jumping so that we dont have to go through all elements once again
                return true;
            }
            tmp++;
        }
        return false;
    }

    /**
     * Returns the value on the next position
     *
     * @return string
     */
    @Override
    public String next() {
        if (!hasNext()) {
            return null;
        }

        return list.get(++position);
    }
}
