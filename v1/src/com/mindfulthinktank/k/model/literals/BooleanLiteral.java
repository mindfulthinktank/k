package com.mindfulthinktank.k.model.literals;


public class BooleanLiteral extends Literal<Boolean> {
    public BooleanLiteral() {
        super();
    }
    
    public BooleanLiteral(Boolean value, String text) {
        super(LiteralKind.Boolean, value, text);
    }
}