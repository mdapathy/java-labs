package com.lablll.labwork7;

/**
 * Text handler that holds the size
 * of the text currently in use
 */
public class TextHandle {
    /**
     * Size of the font currently in use
     */
    private static int fontSize;
    /**
     * Max value fontSize can have
     */
    static final int maxFontSize = 100;
    /**
     * Min value fontSize can have
     */
    static final int minFontSize = 2;


    /**
     * Default constructor that sets
     * the fontsize to default value
     */
    public TextHandle() {
        fontSize = 24;
    }

    /**
     * Default constructor that sets
     * the fontsize to passed value
     *
     * @param f initial font size
     */
    public TextHandle(int f) {
        fontSize = f;

    }

    /**
     * Increases font size if it doesnt
     * exceed the max value
     *
     * @return true if the size changed
     */
    public boolean increaseFontSize() {
        if (fontSize == maxFontSize) {
            return false;
        }
        fontSize += 2;
        return true;

    }

    /**
     * Decreases font size if it doesnt
     * exceed the min value
     *
     * @return true if the size changed
     */
    public boolean decreaseFontSize() {
        if (fontSize == minFontSize) {
            return false;
        }

        fontSize -= 2;
        return true;
    }

    /**
     * Describes current text handler's features
     */
    public String describe() {
        return "TextHandler of size " + fontSize;
    }


}
