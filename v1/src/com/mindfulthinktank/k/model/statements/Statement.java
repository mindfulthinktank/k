package com.mindfulthinktank.k.model.statements;

public class Statement {
    public static enum StatementKind {
        Print,
    }
    
    StatementKind kind;
    
    public Statement(StatementKind kind) {
        this.kind = kind;
    }
}
