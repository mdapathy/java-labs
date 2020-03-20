package com.lablll.labwork5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Interface to use iterator
 */
public interface List {
    /**
     * @return size of the inner structure
     */
    int size();

    /**
     * Adds elements to the inner structure
     *
     * @param objects elements to add
     * @return true if the list changed
     */
    boolean add(ArrayList<String> objects);

    /**
     * @return iterator over the inner structure
     */
    Iterator<String> iterator();

    /**
     * @return filteringIterator over the inner structure
     */
    Iterator<String> filterIterator(int length);

}
