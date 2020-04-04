package com.lablll.labwork3.gameWorld;

import java.util.ArrayList;

/**
 * Represents a collection of all entities in the game world
 */
public class WorldRegion implements GameWorldEntity {
    /**
     * An ArrayList that holds all the objects
     */
    ArrayList<GameWorldEntity> gameWorldEntities
            = new ArrayList<>(10);


    public WorldRegion() {
    }

    /**
     * Adds an object to an ArrayList
     *
     * @param entity object to be in stored in arrayList
     */
    public WorldRegion(GameWorldEntity entity) {
        gameWorldEntities.add(entity);
    }

    public void add(GameWorldEntity entity) {
        gameWorldEntities.add(entity);
    }

    @Override
    public long area() {
        long sum = 0;
        System.out.println("Calculating area for WorldRegion ...");
        for (GameWorldEntity s :
                gameWorldEntities) {
            sum += s.area();
        }
        System.out.println("...Finished calculating area for WorldRegion");

        return sum;

    }
}
