package com.lablll.labwork8;

import com.lablll.labwork8.CustomMath.Expression.ComplexExpression;
import com.lablll.labwork8.CustomMath.Expression.Constant;
import com.lablll.labwork8.CustomMath.Expression.MathOperationSymbol;
import com.lablll.labwork8.CustomMath.Expression.Variable;
import com.lablll.labwork8.CustomMath.ExpressionComputation;
import com.lablll.labwork8.CustomMath.VariablesMap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        final Map<String, Number> variableValues = new HashMap<>();
        variableValues.put("x", 1);
        variableValues.put("y", 2.0);
        variableValues.put("z", 0);

        ExpressionComputation expressionComputation = new ExpressionComputation(
                VariablesMap.getInstance(variableValues));

        ComplexExpression expression = new ComplexExpression(
                new ComplexExpression(
                        new Constant(14),
                        new MathOperationSymbol('/'),
                        new Variable("y"))

                ,
                new MathOperationSymbol('+'),
                new Variable("x")
        );

        System.out.println(expression.getValue());
        System.out.println(expressionComputation.calculate(expression));


        final Map<String, Number> variableValues2 = new HashMap<>();
        variableValues.put("x", 1);
        System.out.println("\n" + VariablesMap.getInstance(variableValues).getID());
        System.out.println(VariablesMap.getInstance(variableValues2).getID());

    }
}
