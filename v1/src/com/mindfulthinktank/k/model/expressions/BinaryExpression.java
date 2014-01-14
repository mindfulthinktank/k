package com.mindfulthinktank.k.model.expressions;


public class BinaryExpression extends Expression {
    public Expression left;
    public Expression right;
    
    public BinaryExpression(ExpressionKind kind) {
        super(kind);
    }

    public BinaryExpression(ExpressionKind kind, Expression left, Expression right) {
        super(kind);
        this.left = left;
        this.right = right;
    }
}