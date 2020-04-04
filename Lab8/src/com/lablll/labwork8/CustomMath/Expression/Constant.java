package com.lablll.labwork8.CustomMath.Expression;

/**
 * Class that represents a constant
 */
public class Constant extends SimpleExpression {
    public Constant(Number n) {
        value = n.toString();
    }
}
