package com.lablll.labwork8.CustomMath.Expression;

public class Variable extends SimpleExpression {
    /**
     * @param s string that represents an expression
     */

    public Variable(String s) {
        if (!s.matches("^([a-z]+)$")) {
            throw new IllegalArgumentException("Cannot represent a constant");
        }
        value = s;
    }

}
