package com.mindfulthinktank.k.testing;

import java.io.IOException;

import org.antlr.v4.runtime.tree.ParseTree;

import com.mindfulthinktank.k.language.ModelExtractor;
import com.mindfulthinktank.k.language.Parser;
import com.mindfulthinktank.k.model.CompilationUnit;

public class MainProgram {
    public static void main(String[] args) throws IOException {
        System.out.println("Bootstrap");

        ParseTree tree = Parser.parseFile("c:\\users\\ibrahim\\Desktop\\test.txt");
        CompilationUnit model = ModelExtractor.buildFromTree(tree);
        
        System.out.println(model.statements.size());
        System.out.println(tree.toStringTree());
        
        System.out.println("Done");
    }
}
