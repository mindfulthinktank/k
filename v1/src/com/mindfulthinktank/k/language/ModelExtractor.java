package com.mindfulthinktank.k.language;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.mindfulthinktank.k.model.CompilationUnit;

public class ModelExtractor {

    public static CompilationUnit buildFromTree(ParseTree tree) {
        ParseTreeWalker walker = new ParseTreeWalker();
        
        ExpressionListener expressionListener = new ExpressionListener();
        walker.walk(expressionListener, tree);
        
        ExpressionListListener expressionListListener = new ExpressionListListener();
        expressionListListener.expressionListener = expressionListener;
        walker.walk(expressionListListener, tree);
        
        ModelListener modelListener = new ModelListener();
        modelListener.expressionListListener = expressionListListener;
        walker.walk(modelListener, tree);
        
        return modelListener.compilationUnit;
    }

}
