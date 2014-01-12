package com.mindfulthinktank.k.model.literals;


public class FloatLiteral extends Literal<Float> {
    public FloatLiteral() {
        super();
    }
    
    public FloatLiteral(Float value, String text) {
        super(LiteralKind.Float, value, text);
    }
}