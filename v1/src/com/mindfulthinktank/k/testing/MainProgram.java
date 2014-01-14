package com.mindfulthinktank.k.testing;

import java.io.IOException;

import org.antlr.v4.runtime.tree.ParseTree;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import com.mindfulthinktank.k.language.ModelExtractor;
import com.mindfulthinktank.k.language.Parser;
import com.mindfulthinktank.k.model.CompilationUnit;

public class MainProgram {
    public static class Generator {
        public static String generateFromModel(CompilationUnit compilationUnit) {
            STGroup templateGroup = new STGroupFile(System.getProperty("user.dir") + "\\src\\com\\mindfulthinktank\\k\\testing\\java.stg");
            ST template = templateGroup.getInstanceOf("compilationUnit");
            template.add("u", compilationUnit);
            return template.render();
        }
    }
    
    public static void main(String[] args) throws IOException {
        System.out.println("Start");
        
        ParseTree tree = Parser.parseFile(System.getProperty("user.dir") + "\\src\\com\\mindfulthinktank\\k\\testing\\test.txt");
        CompilationUnit model = ModelExtractor.buildFromTree(tree);
     
        String java = Generator.generateFromModel(model);
        System.out.println(java);
                
        System.out.println(model.statements.size());
        System.out.println(tree.toStringTree());
        
        System.out.println("Done");
    }
}
