package com.lablll.labwork4;

/**
 * Line that is represented as two points
 */
public class Line extends Shape {
    /**
     * Points that the line consists of
     */
    private Point p1, p2;

    /**
     * Constructor that creates a random line
     */
    public Line() {
        p1 = new Point();
        p2 = new Point();
    }

    /**
     * @param x1 first x parameter
     * @param y1 first y parameter
     * @param x2 second x parameter
     * @param y2 second y parameter
     */
    public Line(int x1, int y1, int x2, int y2) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
    }

    /**
     * Getter for first point
     *
     * @return first point
     */
    public Point getP1() {
        return p1;
    }

    /**
     * Getter for second point
     *
     * @return second point
     */
    public Point getP2() {
        return p2;
    }

    /**
     * Displays the points
     * line consists of
     */
    @Override
    public void display() {
        System.out.println("Line");
        p1.display();
        p2.display();
    }
}
