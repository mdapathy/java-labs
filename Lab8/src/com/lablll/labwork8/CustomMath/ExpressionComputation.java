package com.lablll.labwork8.CustomMath;

import com.lablll.labwork8.CustomMath.Expression.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.util.Map;

/**
 * Class that is responsible for calculation of the expression
 * based on the variables map
 */
public class ExpressionComputation {
    /**
     * An instance of variables map
     */
    private VariablesMap variablesMap;

    /**
     * @param variablesMap variables map to be used
     */
    public ExpressionComputation(VariablesMap variablesMap) {
        this.variablesMap = variablesMap;
    }


    /**
     * @param expression expression to be calculated
     * @return calculated value
     */
    public double calculate(Expression expression) {
        String expressionString = expression.getValue();
        Map<String, Number> map = variablesMap.getMap();

        net.objecthunter.exp4j.Expression e = new ExpressionBuilder(expressionString).variables(map.keySet()).build();

        map.forEach((string, number) -> {
            e.setVariable(string, number.doubleValue());
        });

        return e.evaluate();

    }
}
