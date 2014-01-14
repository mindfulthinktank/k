package com.mindfulthinktank.k.model.expressions;

public enum ExpressionKind {
    // Arithmetic
    Addition,
    Division,
    Multiplication,
    Subtraction,

    // Literals
    BooleanLiteral,
    CharacterLiteral,
    FloatLiteral,
    IntegerLiteral,
    NullLiteral,
    StringLiteral;
    
    public boolean isAddition() { return this.equals(Addition); }
    public boolean isDivision() { return this.equals(Division); }
    public boolean isMultiplication() { return this.equals(Multiplication); }
    public boolean isSubtraction() { return this.equals(Subtraction); }

    public boolean isBooleanLiteral() { return this.equals(BooleanLiteral); }
    public boolean isCharacterLiteral() { return this.equals(CharacterLiteral); }
    public boolean isFloatLiteral() { return this.equals(FloatLiteral); }
    public boolean isIntegerLiteral() { return this.equals(IntegerLiteral); }
    public boolean isNullLiteral() { return this.equals(NullLiteral); }
    public boolean isStringLiteral() { return this.equals(StringLiteral); }
}