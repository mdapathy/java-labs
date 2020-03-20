package com.lablll.labwork3.gameWorld;

import java.util.ArrayList;

/**
 * Represents a collection of all entities in the game world
 */
public class World extends GameWorldEntity {
    /**
     * An ArrayList that holds all the objects
     */
    ArrayList<GameWorldEntity> world = new ArrayList<>(10);

    /**
     * Adds an object to an ArrayList
     *
     * @param entity object to be in stored in arrayList
     */
    public void add(GameWorldEntity entity) {
        world.add(entity);
    }

    @Override
    public long area() {
        long sum = 0;
        System.out.println("Calculating area for World");
        for (GameWorldEntity s :
                world) {
            sum += s.area();
        }
        System.out.println("\n");

        return sum;

    }
}
