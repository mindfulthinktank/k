package com.mindfulthinktank.k.model.statements;

import java.util.ArrayList;
import java.util.List;

import com.mindfulthinktank.k.model.expressions.Expression;

public class PrintStatement extends Statement {
    public List<Expression> expressions = new ArrayList<Expression>();
    
    public PrintStatement() {
        this(new ArrayList<Expression>());
    }

    public PrintStatement(List<Expression> expressions) {
        super(StatementKind.Print);
        this.expressions = expressions;
    }
    
}
