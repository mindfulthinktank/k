package com.mindfulthinktank.k.language.model;

import com.mindfulthinktank.boilerplate.utilities.UConvert;

public class BooleanLiteralExpression extends LiteralExpression<Boolean> {
 public BooleanLiteralExpression(String text) {
   super(LiteralExpressionKind.Boolean, text);
 }
 
 @Override
 protected Boolean convert(String text) {
   return UConvert.toBoolean(text);
 }
}