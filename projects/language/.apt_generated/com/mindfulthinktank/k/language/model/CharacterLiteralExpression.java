package com.mindfulthinktank.k.language.model;

import com.mindfulthinktank.boilerplate.utilities.UConvert;

public class CharacterLiteralExpression extends LiteralExpression<Character> {
 public CharacterLiteralExpression(String text) {
   super(LiteralExpressionKind.Character, text);
 }
 
 @Override
 protected Character convert(String text) {
   return UConvert.toCharacter(text);
 }
}