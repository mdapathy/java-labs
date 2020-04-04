package com.lablll.labwork8.CustomMath.Expression;

/**
 * Class represents a complex expression consisting of
 * expressions and a math operation symbol
 */
public class ComplexExpression extends Expression {
    /**
     * Left and right parts of expression
     */
    private Expression leftOperand, rightOperand;
    /**
     * Operation symbol between operands
     */
    private MathOperationSymbol operation;

    /**
     * @param leftOperand  left expression
     * @param rightOperand right expression
     * @param operation    math operation symbol
     */
    public ComplexExpression(Expression leftOperand, MathOperationSymbol operation, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operation = operation;
    }

    @Override
    public String getValue() {
        return "(" + leftOperand.getValue() + " " + operation.getSymbol() + " " + rightOperand.getValue() + ")";
    }
}
