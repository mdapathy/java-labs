package com.lablll.labwork4;

/**
 * Alternative representation of rectangle so that
 * only pointAdapter is used and rectangle consists
 * of 4 points only.
 */
public class RectangleV2 extends Shape {
    /**
     * Four points that define the vertexes.
     */
    private Point x1, x2, x3, x4;

    /**
     * Constructor for the rectangleV2 class
     *
     * @param x one of the vertices
     * @param y one of the vertices
     * @param z one of the vertices
     * @param w one of the vertices
     */
    public RectangleV2(Point x, Point y, Point z, Point w) {
        x1 = x;
        x2 = y;
        x3 = z;
        x4 = w;
    }

    /**
     * Method that describes the rectangle's inner
     * structures ( points)
     */
    @Override
    public void display() {
        System.out.println("\nRectangle");
        x1.display();
        x2.display();
        x3.display();
        x4.display();
        System.out.println("\n");
    }

}
