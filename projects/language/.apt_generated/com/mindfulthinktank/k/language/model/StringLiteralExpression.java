package com.mindfulthinktank.k.language.model;

import com.mindfulthinktank.boilerplate.utilities.UConvert;

public class StringLiteralExpression extends LiteralExpression<String> {
 public StringLiteralExpression(String text) {
   super(LiteralExpressionKind.String, text);
 }
 
 @Override
 protected String convert(String text) {
   return UConvert.toString(text);
 }
}