package com.lablll.labwork3;

import com.lablll.labwork3.gameWorld.Army;
import com.lablll.labwork3.gameWorld.Soldier;
import com.lablll.labwork3.gameWorld.World;

/**
 * Example of the usage of gameWorld package
 */
public class Main {

    public static void main(String[] args) {
        World world = new World();
        Army ourArmy = new Army(2);
        Army enemiesArmy = new Army(3);

        world.add(ourArmy);
        world.add(enemiesArmy);
        world.add(new Soldier());

        world.area();

    }
}
