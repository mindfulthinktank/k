package com.mindfulthinktank.k.model.statements;

public enum StatementKind {
    Print;        
    
    public boolean isPrint() { return this.equals(Print); }
}