package com.mindfulthinktank.boilerplate.annotationprocessors;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;

import org.apache.velocity.VelocityContext;

import com.mindfulthinktank.boilerplate.Derivations;
import com.mindfulthinktank.boilerplate.utilities.UVelocity;

@SupportedAnnotationTypes("com.mindfulthinktank.boilerplate.Derivations")
@SupportedSourceVersion(SourceVersion.RELEASE_6)
public class ClassDerivationsProcessor extends TypeAnnotationProcessor {
  public ClassDerivationsProcessor() {
    super(Derivations.class);
  }

  @Override
  protected void process(TypeElement type, RoundEnvironment environment) {
    Derivations annotation = type.getAnnotation(Derivations.class);

    if (annotation.useTemplate()) {
      Properties properties = UVelocity.createVelocityProperties(getTypeSourcePath(type)
          .getParent().toString());
      List<VelocityContext> contexts = createDerivedContexts(type);
      String template = type.getSimpleName().toString() + ".derived";
      for (VelocityContext context : contexts) {
        String generatedDerivedClassCode = UVelocity.mergeAsString(template, context, properties);
        StringBuilder classSourceName = new StringBuilder();
        classSourceName.append(((PackageElement) type.getEnclosingElement()).getQualifiedName()
            .toString());
        classSourceName.append(".");
        classSourceName.append(context.get("value"));
        classSourceName.append(type.getSimpleName().toString());

        writeSource(classSourceName.toString(), generatedDerivedClassCode);
      }
    }
  }

  private List<VelocityContext> createDerivedContexts(TypeElement type) {
    String packageName = ((PackageElement) type.getEnclosingElement()).getQualifiedName()
        .toString();
    String base = type.getSimpleName().toString();
    String[] values = type.getAnnotation(Derivations.class).values();

    List<VelocityContext> contexts = new ArrayList<VelocityContext>();

    for (String value : values) {
      VelocityContext context = new VelocityContext();

      context.put("package", packageName);
      context.put("base", base);
      context.put("value", value);

      contexts.add(context);
    }

    return contexts;
  }
}
