package com.mindfulthinktank.k.model.expressions.arithmetic;

import com.mindfulthinktank.k.model.expressions.BinaryExpression;
import com.mindfulthinktank.k.model.expressions.Expression;
import com.mindfulthinktank.k.model.expressions.ExpressionKind;


public class DivisionExpression extends BinaryExpression {
    public DivisionExpression() {
        super(ExpressionKind.Division);
    }
    
    public DivisionExpression(Expression left, Expression right) {
        super(ExpressionKind.Division, left, right);
    }
}