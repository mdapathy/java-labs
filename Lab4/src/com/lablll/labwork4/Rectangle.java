package com.lablll.labwork4;

/**
 * Class that represents rectangle
 * that consists of 2 lines
 */
public class Rectangle extends Shape {
    /**
     * Rectangle is presented as a collection of 4 lines;
     */
    private Line l1, l2;

    /**
     * Basic constructor
     *
     * @param line1 one of the lines
     * @param line2 one of the lines
     */
    public Rectangle(Line line1, Line line2) {
        l1 = line1;
        l2 = line2;

    }

    /**
     * Describes the two lines that
     * the rectangle consists of.
     */
    @Override
    public void display() {
        System.out.println("\nRectangle");
        l1.display();
        l2.display();

    }
}
