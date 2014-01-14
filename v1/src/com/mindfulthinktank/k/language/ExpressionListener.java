package com.mindfulthinktank.k.language;

import com.mindfulthinktank.k.language.v1.KlangParser.BooleanLiteralContext;
import com.mindfulthinktank.k.language.v1.KlangParser.CharacterLiteralContext;
import com.mindfulthinktank.k.language.v1.KlangParser.FloatLiteralContext;
import com.mindfulthinktank.k.language.v1.KlangParser.IntegerLiteralContext;
import com.mindfulthinktank.k.language.v1.KlangParser.NullLiteralContext;
import com.mindfulthinktank.k.language.v1.KlangParser.PrimaryContext;
import com.mindfulthinktank.k.language.v1.KlangParser.PrimaryExpressionContext;
import com.mindfulthinktank.k.language.v1.KlangParser.StringLiteralContext;
import com.mindfulthinktank.k.model.expressions.Expression;
import com.mindfulthinktank.k.model.expressions.literals.BooleanLiteral;
import com.mindfulthinktank.k.model.expressions.literals.CharacterLiteral;
import com.mindfulthinktank.k.model.expressions.literals.FloatLiteral;
import com.mindfulthinktank.k.model.expressions.literals.IntegerLiteral;
import com.mindfulthinktank.k.model.expressions.literals.NullLiteral;
import com.mindfulthinktank.k.model.expressions.literals.StringLiteral;

public class ExpressionListener extends AnnotatedListener<Expression> {
    @Override
    public void exitPrimaryExpression(PrimaryExpressionContext ctx) {
        set(ctx, get(ctx.primary()));
    }
    
    @Override
    public void exitPrimary(PrimaryContext ctx) {
        set(ctx, get(ctx.literal()));
    }

    @Override
    public void exitBooleanLiteral(BooleanLiteralContext ctx) {
        set(ctx, new BooleanLiteral(Boolean.parseBoolean(ctx.getText()), ctx.getText()));
    }

    @Override
    public void exitCharacterLiteral(CharacterLiteralContext ctx) {
        set(ctx, new CharacterLiteral(ctx.getText().charAt(1), ctx.getText()));
    }

    @Override
    public void exitFloatLiteral(FloatLiteralContext ctx) {
        set(ctx, new FloatLiteral(Float.parseFloat(ctx.getText()), ctx.getText()));
    }

    @Override
    public void exitIntegerLiteral(IntegerLiteralContext ctx) {
        set(ctx, new IntegerLiteral(Integer.parseInt(ctx.getText()), ctx.getText()));
    }

    @Override
    public void exitNullLiteral(NullLiteralContext ctx) {
        set(ctx, new NullLiteral());
    }

    @Override
    public void exitStringLiteral(StringLiteralContext ctx) {
        set(ctx, new StringLiteral(ctx.getText(), ctx.getText()));
    }
}
