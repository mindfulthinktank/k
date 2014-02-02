package com.mindfulthinktank.boilerplate.annotationprocessors;

import java.io.IOException;
import java.io.Writer;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.tools.Diagnostic.Kind;
import javax.tools.JavaFileObject;

public abstract class ConvenientProcessor extends AbstractProcessor {
  protected Filer  filer;
  private Messager messager;

  @Override
  public synchronized void init(ProcessingEnvironment processingEnv) {
    super.init(processingEnv);
    messager = processingEnv.getMessager();
    filer = processingEnv.getFiler();
  }

  protected void note(String format, Object... objects) {
    messager.printMessage(Kind.NOTE, String.format(format, objects));
  }

  protected void writeSource(String sourceName, String content) {
    try {
      JavaFileObject file = filer.createSourceFile(sourceName);
      Writer writer = file.openWriter();
      writer.write(content);
      writer.close();
    } catch (IOException e) {
      note(e.getMessage());
    }
  }
}
