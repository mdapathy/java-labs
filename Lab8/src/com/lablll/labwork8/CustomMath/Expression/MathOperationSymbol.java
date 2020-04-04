package com.lablll.labwork8.CustomMath.Expression;

/**
 * Class that represents an operation symbol
 */
public class MathOperationSymbol {

    /**
     * Character that represents math operation symbol
     */
    private Character symbol;

    /**
     * @param character character to be stored as  math operation symbol
     */
    public MathOperationSymbol(Character character) {
        if (!character.toString().matches("[+\\-*/^]$")) {
            throw new IllegalArgumentException("Passed character cannot be used as MathOperationSymbol");
        }
        symbol = character;
    }

    /**
     * @return math operation symbol
     */
    public Character getSymbol() {
        return symbol;
    }
}
