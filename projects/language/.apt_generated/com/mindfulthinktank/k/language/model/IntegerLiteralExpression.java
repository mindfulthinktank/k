package com.mindfulthinktank.k.language.model;

import com.mindfulthinktank.boilerplate.utilities.UConvert;

public class IntegerLiteralExpression extends LiteralExpression<Integer> {
 public IntegerLiteralExpression(String text) {
   super(LiteralExpressionKind.Integer, text);
 }
 
 @Override
 protected Integer convert(String text) {
   return UConvert.toInteger(text);
 }
}