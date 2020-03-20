package com.lablll.labwork5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * ConcreteAggregate implementation
 */
public class ConcreteList implements List {

    /**
     * Inner data
     */
    private ArrayList<String> arrayList = new ArrayList<>();

    /**
     * Constructor we pass strings to
     *
     * @param strings strings to add to arrayList
     */
    public ConcreteList(String... strings) {
        arrayList.addAll(Arrays.asList(strings));
    }

    /**
     * Constructor with arrayList parameter
     *
     * @param list list we ll use as inner structure
     */
    public ConcreteList(ArrayList<String> list) {
        arrayList = list;
    }

    /**
     * @return size of the list
     */
    @Override
    public int size() {
        return arrayList.size();
    }

    /**
     * Add elements to the list
     *
     * @param objects arraylist of objects we want to ad
     * @return true if the list changed due to the function call
     */
    @Override
    public boolean add(ArrayList<String> objects) {
        return arrayList.addAll(objects);
    }


    /**
     * Returns sequential iterator
     *
     * @return iterator over the arrayList
     */
    @Override
    public Iterator<String> iterator() {
        return new UsualIterator(arrayList);
    }


    /**
     * Returns filtering iterator
     *
     * @return iterator over the arrayList
     */
    @Override
    public Iterator<String> filterIterator(int length) {
        return new FilteringIterator(arrayList, length);
    }


}
