package com.lablll.labwork3.gameWorld;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Represents a collection of Soldier entities
 */
public class Army extends GameWorldEntity {

    /**
     * ArrayList that holds the Soldier entities
     */
    ArrayList<Soldier> army;

    /**
     * Constructor that creates an ArrayList consisting of soldier instances created with a non-parametric constructor
     *
     * @param soldiersAmount amount of random soldiers to be created and stored in ArrayList
     */
    public Army(int soldiersAmount) {
        this.army = new ArrayList<>(soldiersAmount);
        for (int i = 0; i < soldiersAmount; i++) {
            army.add(new Soldier());
        }
    }

    /**
     * Creates an army from a given as a parameter collection
     *
     * @param army collection of soldier entities
     */
    public Army(Collection<Soldier> army) {
        this.army = new ArrayList<>(army);
    }


    /**
     * Calculates the area of the army by adding areas of individual soldiers from the ArrayList
     *
     * @return area taken up by army in square units
     */
    @Override
    public long area() {
        long sum = 0;
        System.out.println("Calculating area for an Army");
        for (Soldier s :
                army) {
            sum += s.area();
        }
        System.out.println("\n");

        return sum;
    }


}
