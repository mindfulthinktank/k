package com.mindfulthinktank.k.language;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import com.mindfulthinktank.k.language.v1.KlangBaseListener;

public class AnnotatedListener<T> extends KlangBaseListener {
    ParseTreeProperty<T> values = new ParseTreeProperty<T>();

    void set(ParseTree node, T value) {
        values.put(node, value);
    }

    T get(ParseTree node) {
        return values.get(node);
    }
}
