package com.mindfulthinktank.k.model.literals;


public class CharacterLiteral extends Literal<Character> {
    public CharacterLiteral() {
        super();
    }
    
    public CharacterLiteral(Character value, String text) {
        super(LiteralKind.Character, value, text);
    }
}