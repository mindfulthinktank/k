package com.mindfulthinktank.k.model.expressions.arithmetic;

import com.mindfulthinktank.k.model.expressions.BinaryExpression;
import com.mindfulthinktank.k.model.expressions.Expression;
import com.mindfulthinktank.k.model.expressions.ExpressionKind;


public class MultiplicationExpression extends BinaryExpression {
    public MultiplicationExpression() {
        super(ExpressionKind.Multiplication);
    }
    
    public MultiplicationExpression(Expression left, Expression right) {
        super(ExpressionKind.Multiplication, left, right);
    }
}