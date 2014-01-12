package com.mindfulthinktank.k.model.literals;


public class StringLiteral extends Literal<String> {
    public StringLiteral() {
        super();
    }
    
    public StringLiteral(String value, String text) {
        super(LiteralKind.String, value, text);
    }
}