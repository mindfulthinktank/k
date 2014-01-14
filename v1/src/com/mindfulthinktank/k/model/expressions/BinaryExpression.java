package com.mindfulthinktank.k.model.expressions;


public class BinaryExpression extends Expression {
    protected Expression left;
    protected Expression right;
    
    public BinaryExpression(ExpressionKind kind) {
        super(kind);
    }

    public BinaryExpression(ExpressionKind kind, Expression left, Expression right) {
        super(kind);
        this.left = left;
        this.right = right;
    }
}