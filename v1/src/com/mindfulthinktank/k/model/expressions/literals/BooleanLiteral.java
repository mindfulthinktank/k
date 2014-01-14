package com.mindfulthinktank.k.model.expressions.literals;

import com.mindfulthinktank.k.model.expressions.ExpressionKind;


public class BooleanLiteral extends Literal<Boolean> {
    public BooleanLiteral() {
        super(ExpressionKind.BooleanLiteral);
    }
    
    public BooleanLiteral(Boolean value, String text) {
        super(ExpressionKind.BooleanLiteral, value, text);
    }
}