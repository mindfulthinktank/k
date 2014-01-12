package com.mindfulthinktank.k.model.expressions;


public class SubtractOperation extends BinaryOperation {
    public SubtractOperation() {
        super(OperationKind.Subtract);
    }
    
    public SubtractOperation(Expression left, Expression right) {
        super(OperationKind.Subtract, left, right);
    }
}