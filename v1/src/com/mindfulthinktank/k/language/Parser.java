package com.mindfulthinktank.k.language;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.mindfulthinktank.k.language.v1.KlangLexer;
import com.mindfulthinktank.k.language.v1.KlangParser;

public class Parser {
    public static ParseTree parseFile(String filePath) throws IOException {
        InputStream stream = new FileInputStream(filePath);
        ANTLRInputStream input = new ANTLRInputStream(stream); 
        KlangLexer lexer = new KlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        KlangParser parser = new KlangParser(tokens);
        return parser.compilationUnit();
    }
}
