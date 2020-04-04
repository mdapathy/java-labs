package com.lablll.labwork8.CustomMath.Expression;

/**
 * Represents a constant or a variable
 */
public class SimpleExpression extends Expression {
    protected String value;

    /**
     * @return value
     */
    @Override
    final public String getValue() {
        return value;
    }
}
