package com.lablll.labwork5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Sequential iterator over the list
 */
public class UsualIterator implements Iterator<String> {

    /**
     * Inner structure to work with
     */
    private ArrayList<String> list;
    /**
     * Position in the list;
     */
    private int position = -1;

    /**
     * Constructor
     *
     * @param stringArrayList arrayList of strings
     */
    UsualIterator(ArrayList<String> stringArrayList) {
        this.list = stringArrayList;
    }


    /**
     * @return true if the element on the next position exists
     */
    @Override
    public boolean hasNext() {
        return (position + 1) < list.size();
    }

    /**
     * @return next element
     */
    @Override
    public String next() {
        if (!hasNext()) {
            return null;
        }

        return list.get(++position);
    }


}
