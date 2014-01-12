package com.mindfulthinktank.k.model.expressions;


public class AddOperation extends BinaryOperation {
    public AddOperation() {
        super(OperationKind.Add);
    }
    
    public AddOperation(Expression left, Expression right) {
        super(OperationKind.Add, left, right);
    }
}