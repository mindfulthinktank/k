package com.mindfulthinktank.k.language;

import java.util.ArrayList;
import java.util.List;

import com.mindfulthinktank.k.language.v1.KlangParser.ExpressionContext;
import com.mindfulthinktank.k.language.v1.KlangParser.ExpressionListContext;
import com.mindfulthinktank.k.model.expressions.Expression;

public class ExpressionListListener extends AnnotatedListener<List<Expression>>{
    public ExpressionListener expressionListener;
    
    @Override
    public void exitExpressionList(ExpressionListContext ctx) {
        List<Expression> expressions = new ArrayList<Expression>();
        
        for (ExpressionContext expressionContext : ctx.expression()) {
            expressions.add(expressionListener.get(expressionContext));
        }
        
        set(ctx, expressions);
    }
}
