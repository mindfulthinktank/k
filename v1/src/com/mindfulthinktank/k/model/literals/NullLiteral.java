package com.mindfulthinktank.k.model.literals;


public class NullLiteral extends Literal<Void> {
    public NullLiteral() {
        super();
        this.kind = LiteralKind.Null;
    }
}