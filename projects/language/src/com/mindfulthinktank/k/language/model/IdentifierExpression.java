package com.mindfulthinktank.k.language.model;

import lombok.Getter;

public class IdentifierExpression extends Expression {
  @Getter private final String identifier;

  public IdentifierExpression(String identifier) {
    super(ExpressionKind.Identifier);
    this.identifier = identifier;
  }
}
