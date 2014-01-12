package com.mindfulthinktank.k.model.literals;

import com.mindfulthinktank.k.model.expressions.Expression;

public class Literal<T> extends Expression {
    LiteralKind kind;
    T value;
    String text;

    public Literal() {
    }
    
    public Literal(LiteralKind kind, T value, String text) {
        this.kind = kind;
        this.value = value;
        this.text = text;
    }
}