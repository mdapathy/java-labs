package com.lablll.labwork4;

import java.util.Random;

/**
 * Simple shape representing a point
 */
public class Point extends Shape {
    /**
     * x and y values that represent the shape
     */
    private int x1, y1;

    /**
     * Constructor that creates a random point
     */
    public Point() {
        Random random = new Random();
        x1 = random.nextInt(640);
        y1 = random.nextInt(480);
    }

    /**
     * Constructor that creates a point with defined values
     *
     * @param x x coordinate
     * @param y y coordinate
     */
    public Point(int x, int y) {
        this.x1 = x;
        this.y1 = y;
    }

    /**
     * Getter for x
     *
     * @return x value
     */
    public int getX1() {
        return x1;
    }

    /**
     * Getter for y
     *
     * @return y value
     */
    public int getY1() {
        return y1;
    }

    /**
     * Describes the point
     */
    @Override
    public void display() {
        System.out.println("Point with coordinates " + x1 + " " + y1);
    }
}
