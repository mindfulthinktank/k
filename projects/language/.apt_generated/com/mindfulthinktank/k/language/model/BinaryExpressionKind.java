package com.mindfulthinktank.k.language.model;

import java.util.Hashtable;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum BinaryExpressionKind {
  BITWISE_AND ( "&" ),
  BITWISE_EXCLUSIVE_OR ( "^" ),
  BITWISE_INCLUSIVE_OR ( "|" ),
  BITWISE_LEFT_SHIFT ( "<<" ),
  BITWISE_RIGHT_SHIFT ( ">>" ),
  BITWISE_UNSIGNED_RIGHT_SHIFT ( ">>>" ),
  BOOLEAN_AND ( "&&" ),
  BOOLEAN_OR ( "||" ),
  COMPARISON_EQUAL ( "==" ),
  COMPARISON_GREATER_THAN ( ">" ),
  COMPARISON_GREATER_THAN_OR_EQUAL ( ">=" ),
  COMPARISON_LESS_THAN ( "<" ),
  COMPARISON_LESS_THAN_OR_EQUAL ( "<=" ),
  COMPARISON_NOT_EQUAL ( "!=" ),
  NUMERIC_ADDITION ( "+" ),
  NUMERIC_DIVISION ( "/" ),
  NUMERIC_MULTIPLICATION ( "*" ),
  NUMERIC_SUBTRATION ( "-" ),
  ;

  @Getter private final String shortHand;

  static private final Map<String, BinaryExpressionKind> map = new Hashtable<String, BinaryExpressionKind>();

  static {
    for (BinaryExpressionKind kind : BinaryExpressionKind.values()) {
      map.put(kind.shortHand, kind);
    }
  }

  static public BinaryExpressionKind forShortHand(String shortHand) {
    return map.get(shortHand);
  }
}