package com.lablll.labwork4;

/**
 * Line adapter that is responsible for
 * delegation of the conversion process to the pointAdapter
 */
public class LineAdapter extends Line {

    /**
     * Line which values we use
     */
    private Line adaptee;

    /**
     * Constructor
     * @param l line that we use as a reference
     */
    public LineAdapter(Line l) {
        adaptee = l;
    }

    /**
     * Returns point adapter of first value
     * so that it will convert the values properly
     * @return pointAdapter of 1st value
     */
    @Override
    public PointAdapter getP1() {
        return new PointAdapter(adaptee.getP1());
    }

    /**
     * Returns point adapter of second value
     * so that it will convert the values properly
     * @return pointAdapter of 2nd value
     */
    @Override
    public PointAdapter getP2() {
        return new PointAdapter(adaptee.getP2());
    }

    /**
     * Describes the line using pointAdapters
     */
    @Override
    public void display() {
        System.out.println("Line");
        getP1().display();
        getP2().display();
    }
}
