package com.mindfulthinktank.k.language.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public abstract class Expression {
  @Getter private final ExpressionKind kind;
}
