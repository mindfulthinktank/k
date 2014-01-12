package com.mindfulthinktank.k.model.literals;


public class IntegerLiteral extends Literal<Integer> {
    public IntegerLiteral() {
        super();
    }
    
    public IntegerLiteral(Integer value, String text) {
        super(LiteralKind.Integer, value, text);
    }
}