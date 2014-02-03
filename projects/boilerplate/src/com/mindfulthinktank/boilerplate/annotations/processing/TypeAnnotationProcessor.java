package com.mindfulthinktank.boilerplate.annotations.processing;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.tools.FileObject;
import javax.tools.StandardLocation;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public abstract class TypeAnnotationProcessor extends AnnotationProcessor {
  @Getter private final Class<? extends Annotation> annotationClass;

  @Override
  public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment environment) {
    for (TypeElement type : getTypes(environment, annotationClass)) {
      process(type, environment);
    }

    return false;
  }

  protected abstract void process(TypeElement type, RoundEnvironment environment);

  protected Path getTypeSourcePath(TypeElement type) {
    PackageElement thePackage = (PackageElement) type.getEnclosingElement();
    String packageName = thePackage.getQualifiedName().toString();
    String fileName = type.getSimpleName() + ".class";

    FileObject file;
    try {
      file = filer.getResource(StandardLocation.CLASS_OUTPUT, packageName, fileName);
    } catch (IOException e) {
      return null;
    }
    String original = file.toUri().toString();
    String modified = original.replace("/bin/", "/src/").replace(".class", ".java");
    return Paths.get(URI.create(modified));
  }

  private List<TypeElement> getTypes(RoundEnvironment environment, Class<? extends Annotation> clazz) {
    List<TypeElement> result = new ArrayList<TypeElement>();

    for (Element element : environment.getElementsAnnotatedWith(clazz)) {
      if (element.getKind() != ElementKind.CLASS) continue;

      result.add((TypeElement) element);
    }

    return result;
  }

}
