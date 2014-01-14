package com.mindfulthinktank.k.model.expressions.arithmetic;

import com.mindfulthinktank.k.model.expressions.BinaryExpression;
import com.mindfulthinktank.k.model.expressions.Expression;
import com.mindfulthinktank.k.model.expressions.ExpressionKind;


public class AdditionExpression extends BinaryExpression {
    public AdditionExpression() {
        super(ExpressionKind.Addition);
    }
    
    public AdditionExpression(Expression left, Expression right) {
        super(ExpressionKind.Addition, left, right);
    }
}