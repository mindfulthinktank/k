package com.mindfulthinktank.k.model.expressions.literals;

import com.mindfulthinktank.k.model.expressions.ExpressionKind;


public class NullLiteral extends Literal<Void> {
    public NullLiteral() {
        super(ExpressionKind.NullLiteral);
    }
}
