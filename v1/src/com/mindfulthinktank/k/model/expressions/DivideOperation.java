package com.mindfulthinktank.k.model.expressions;


public class DivideOperation extends BinaryOperation {
    public DivideOperation() {
        super(OperationKind.Divide);
    }
    
    public DivideOperation(Expression left, Expression right) {
        super(OperationKind.Divide, left, right);
    }
}