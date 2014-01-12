package com.mindfulthinktank.k.model.expressions;


public class MultiplyOperation extends BinaryOperation {
    public MultiplyOperation() {
        super(OperationKind.Multiply);
    }
    
    public MultiplyOperation(Expression left, Expression right) {
        super(OperationKind.Multiply, left, right);
    }
}