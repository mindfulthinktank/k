package com.mindfulthinktank.k.model.expressions.literals;

import com.mindfulthinktank.k.model.expressions.ExpressionKind;


public class StringLiteral extends Literal<String> {
    public StringLiteral() {
        super(ExpressionKind.StringLiteral);
    }
    
    public StringLiteral(String value, String text) {
        super(ExpressionKind.StringLiteral, value, text);
    }
}