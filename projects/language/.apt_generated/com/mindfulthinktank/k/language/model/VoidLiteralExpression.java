package com.mindfulthinktank.k.language.model;

import com.mindfulthinktank.boilerplate.utilities.UConvert;

public class VoidLiteralExpression extends LiteralExpression<Void> {
 public VoidLiteralExpression(String text) {
   super(LiteralExpressionKind.Void, text);
 }
 
 @Override
 protected Void convert(String text) {
   return UConvert.toVoid(text);
 }
}