package com.lablll.labwork3;

import com.lablll.labwork3.gameWorld.Army;
import com.lablll.labwork3.gameWorld.WorldRegion;

/**
 * Example of the usage of gameWorld package
 */
public class Main {

    public static void main(String[] args) {
        WorldRegion earth = new WorldRegion();
        WorldRegion[] continents = {
                new WorldRegion(),
                new WorldRegion(),
                new WorldRegion(),
        };

        for (WorldRegion w : continents) {
            w.add(new WorldRegion(new Army(2))); // adding peninsulas and or mainland with armies
            earth.add(w);
        }

        earth.area();

    }
}
