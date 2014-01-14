package com.mindfulthinktank.k.model.expressions.literals;

import com.mindfulthinktank.k.model.expressions.ExpressionKind;


public class FloatLiteral extends Literal<Float> {
    public FloatLiteral() {
        super(ExpressionKind.FloatLiteral);
    }
    
    public FloatLiteral(Float value, String text) {
        super(ExpressionKind.FloatLiteral, value, text);
    }
}