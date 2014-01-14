package com.mindfulthinktank.k.model.expressions.arithmetic;

import com.mindfulthinktank.k.model.expressions.BinaryExpression;
import com.mindfulthinktank.k.model.expressions.Expression;
import com.mindfulthinktank.k.model.expressions.ExpressionKind;


public class SubtractionExpression extends BinaryExpression {
    public SubtractionExpression() {
        super(ExpressionKind.Subtraction);
    }
    
    public SubtractionExpression(Expression left, Expression right) {
        super(ExpressionKind.Subtraction, left, right);
    }
}