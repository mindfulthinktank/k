package com.mindfulthinktank.k.language.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public abstract class Expression extends Element{
  @Getter private final ExpressionKind kind;
}
