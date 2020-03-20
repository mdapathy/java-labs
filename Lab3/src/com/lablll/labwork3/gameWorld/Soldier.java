package com.lablll.labwork3.gameWorld;

import javafx.util.Pair;

import java.util.Random;

/**
 * Singular entity of the gaming world representing a soldier
 */
public class Soldier extends GameWorldEntity {
    /**
     * Left upper x and y coordinates  of the entity
     */
    private Pair<Integer, Integer> leftUpperCorner;
    /**
     * Right lower x and y coordinates of the entity
     */
    private Pair<Integer, Integer> rightLowerCorner;

    /**
     * Constructor that creates a soldier with random values as coordinates
     */
    public Soldier() {
        Random rand = new Random();
        leftUpperCorner = new Pair<>(rand.nextInt(100), rand.nextInt(150));
        rightLowerCorner = new Pair<>(rand.nextInt(100) + leftUpperCorner.getKey(), rand.nextInt(150) - leftUpperCorner.getValue());
    }

    /**
     * Constructor that takes left upper corner
     * and right lower corner coordinates
     * to create an entity
     *
     * @param x1 left upper x coordinate
     * @param y1 left upper y coordinate
     * @param x2 right lower x coordinate
     * @param y2 right lower y coordinate
     */
    public Soldier(int x1, int y1, int x2, int y2) {
        leftUpperCorner = new Pair<>(x1, y1);
        rightLowerCorner = new Pair<>(x2, y2);
    }

    /**
     * Method that returns the space that the object takes
     *
     * @return long as the area that the objects takes in square units
     */
    public long area() {
        System.out.println("Calculating area for a Soldier");
        return Math.abs((leftUpperCorner.getValue() - rightLowerCorner.getValue()) * (leftUpperCorner.getKey() - rightLowerCorner.getKey()));
    }


}
