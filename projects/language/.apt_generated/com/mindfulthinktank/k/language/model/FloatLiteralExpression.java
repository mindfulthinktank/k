package com.mindfulthinktank.k.language.model;

import com.mindfulthinktank.boilerplate.utilities.UConvert;

public class FloatLiteralExpression extends LiteralExpression<Float> {
 public FloatLiteralExpression(String text) {
   super(LiteralExpressionKind.Float, text);
 }
 
 @Override
 protected Float convert(String text) {
   return UConvert.toFloat(text);
 }
}