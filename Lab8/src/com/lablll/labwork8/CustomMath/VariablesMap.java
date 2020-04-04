package com.lablll.labwork8.CustomMath;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Represents a map of character - number values that are used
 * to calculate the expression
 */
public class VariablesMap {

    private final long ID;
    /**
     * Instance of singleton object
     */
    private static VariablesMap instance = null;

    /**
     * Map of values
     */
    private static Map<String, Number> map = new HashMap<>();

    /**
     * Default constructor
     */
    private VariablesMap(Map<String, Number> values) {
        map = values;
        ID = new Random().nextLong();
    }

    /**
     * @return instance of singleton
     */
    public static synchronized VariablesMap getInstance(Map<String, Number> values) {
        if (instance == null) {
            instance = new VariablesMap(values);
        }

        return instance;
    }


    /**
     * @param s character used in expression
     * @return numeric value of the character
     */
    public static Number getValue(String s) {
        return map.get(s);
    }

    /**
     * @return map representing string - value
     */
    public Map<String, Number> getMap() {
        return map;
    }

    public long getID() {
        return ID;
    }
}
