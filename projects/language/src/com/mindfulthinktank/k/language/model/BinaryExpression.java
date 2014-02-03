package com.mindfulthinktank.k.language.model;

import lombok.Getter;

import com.mindfulthinktank.boilerplate.annotations.VarietyShorthandEnumeration;

@VarietyShorthandEnumeration
public class BinaryExpression extends Expression {
  @Getter private final BinaryExpressionKind binaryKind;
  @Getter private final Expression           left;
  @Getter private final Expression           right;

  public BinaryExpression(BinaryExpressionKind binaryKind, Expression left, Expression right) {
    super(ExpressionKind.Binary);
    this.binaryKind = binaryKind;
    this.left = left;
    this.right = right;
  }
}
