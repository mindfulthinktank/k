package com.mindfulthinktank.k.model.expressions.literals;

import com.mindfulthinktank.k.model.expressions.Expression;
import com.mindfulthinktank.k.model.expressions.ExpressionKind;
// TODO implement conversion logic inside of literal to simplify parser code.
public abstract class Literal<T> extends Expression {
    public T value;
    public String text;

    public Literal(ExpressionKind kind) {
        super(kind);
    }
    
    public Literal(ExpressionKind kind, T value, String text) {
        this(kind);
        this.value = value;
        this.text = text;
    }    
}