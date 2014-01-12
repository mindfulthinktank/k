package com.mindfulthinktank.k.language;

import com.mindfulthinktank.k.language.v1.KlangParser.IntegerLiteralContext;
import com.mindfulthinktank.k.language.v1.KlangParser.PrimaryContext;
import com.mindfulthinktank.k.language.v1.KlangParser.PrimaryExpressionContext;
import com.mindfulthinktank.k.model.expressions.Expression;
import com.mindfulthinktank.k.model.literals.IntegerLiteral;

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
    public void exitIntegerLiteral(IntegerLiteralContext ctx) {
        set(ctx, new IntegerLiteral(Integer.parseInt(ctx.getText()), ctx.getText()));
    }
}
