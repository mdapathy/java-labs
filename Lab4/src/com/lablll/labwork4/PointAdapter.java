package com.lablll.labwork4;

/**
 * Point adapter's class is responsible for
 * conversion of the coordinate system.
 */
public class PointAdapter extends Point {
    /**
     * Represent half of the screen in int,
     * which is the (0,0) of the coordinate system
     * used for complex objects
     */
    static private int X = 320, Y = 240;
    /**
     * Inner point which values we use
     */
    private Point adaptee;

    /**
     * Basic constructor
     *
     * @param point point we will use as a reference
     */
    public PointAdapter(Point point) {
        adaptee = point;
    }

    /**
     * Constructor which is capable of changing
     * the default coordinate system
     *
     * @param point point we use as a reference
     * @param x     x value where 0 is the left part of the screen
     * @param y     y value where 0 is the upper part of the screen
     */
    public PointAdapter(Point point, int x, int y) {
        adaptee = point;
        X = x;
        Y = y;
    }

    /**
     * Converts the x value to the complex coordinate system
     *
     * @return converted value
     */
    @Override
    public int getX1() {
        return adaptee.getX1() - X;
    }

    /**
     * Converts the y value to the complex coordinate system
     *
     * @return converted value
     */
    @Override
    public int getY1() {
        return Y - adaptee.getY1();
    }

    /**
     * Describes the point using
     * converted values
     */
    @Override
    public void display() {
        System.out.println("Point with coordinates " + getX1() + " " + getY1());
    }
}
