package com.mindfulthinktank.k.model.expressions;


public class BinaryOperation extends Expression {
    Expression left;
    Expression right;
    OperationKind kind;
    
    public BinaryOperation(OperationKind kind) {
        this.kind = kind;
    }
    
    public BinaryOperation(OperationKind kind, Expression left, Expression right) {
        this(kind);
        this.left = left;
        this.right = right;
    }
}