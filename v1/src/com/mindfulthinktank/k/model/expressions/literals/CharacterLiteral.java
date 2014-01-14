package com.mindfulthinktank.k.model.expressions.literals;

import com.mindfulthinktank.k.model.expressions.ExpressionKind;


public class CharacterLiteral extends Literal<Character> {
    public CharacterLiteral() {
        super(ExpressionKind.CharacterLiteral);
    }
    
    public CharacterLiteral(Character value, String text) {
        super(ExpressionKind.CharacterLiteral, value, text);
    }
}