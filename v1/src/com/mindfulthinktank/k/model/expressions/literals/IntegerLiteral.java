package com.mindfulthinktank.k.model.expressions.literals;

import com.mindfulthinktank.k.model.expressions.ExpressionKind;


public class IntegerLiteral extends Literal<Integer> {
    public IntegerLiteral() {
        super(ExpressionKind.IntegerLiteral);
    }
    
    public IntegerLiteral(Integer value, String text) {
        super(ExpressionKind.IntegerLiteral, value, text);
    }
}