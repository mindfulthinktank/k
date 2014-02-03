package com.mindfulthinktank.k.language.model;

import lombok.Getter;

import com.mindfulthinktank.boilerplate.annotations.Variety;
import com.mindfulthinktank.boilerplate.annotations.VarietyClass;
import com.mindfulthinktank.boilerplate.annotations.VarietyEnumeration;

@Variety(values = { "Boolean", "Character", "Float", "Integer", "String", "Void" })
@VarietyEnumeration
@VarietyClass
//@Derivations(values = { "Boolean", "Character", "Float", "Integer", "String", "Void" },
//             generateEnumeration = true)
public abstract class LiteralExpression<T> extends Expression {
  @Getter private final T                     value;
  @Getter private final String                text;
  @Getter private final LiteralExpressionKind literalKind;

  public LiteralExpression(LiteralExpressionKind literalKind, String text) {
    super(ExpressionKind.Literal);
    this.literalKind = literalKind;
    this.text = text;
    this.value = convert(text);
  }

  protected abstract T convert(String text);
}
