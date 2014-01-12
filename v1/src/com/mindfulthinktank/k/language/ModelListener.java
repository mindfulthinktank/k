package com.mindfulthinktank.k.language;

import java.util.List;

import com.mindfulthinktank.k.language.v1.KlangParser.CompilationUnitContext;
import com.mindfulthinktank.k.language.v1.KlangParser.PrintStatementContext;
import com.mindfulthinktank.k.language.v1.KlangParser.StatementContext;
import com.mindfulthinktank.k.model.CompilationUnit;
import com.mindfulthinktank.k.model.expressions.Expression;
import com.mindfulthinktank.k.model.statements.PrintStatement;
import com.mindfulthinktank.k.model.statements.Statement;

public class ModelListener extends AnnotatedListener<Statement> {
    public ExpressionListListener expressionListListener;
    
    public CompilationUnit compilationUnit;
    
    @Override
    public void enterCompilationUnit(CompilationUnitContext ctx) {
        compilationUnit = new CompilationUnit();
    }
    
    @Override
    public void exitCompilationUnit(CompilationUnitContext ctx) {
        for (StatementContext statementContext : ctx.statement()) {
            Statement statement = get(statementContext);
            compilationUnit.statements.add(statement);
        }
    }
    
    @Override
    public void exitPrintStatement(PrintStatementContext ctx) {
        List<Expression> expressions = expressionListListener.get(ctx.expressionList());
        PrintStatement printStatement = new PrintStatement(expressions);
        set(ctx, printStatement);
    }    
}
