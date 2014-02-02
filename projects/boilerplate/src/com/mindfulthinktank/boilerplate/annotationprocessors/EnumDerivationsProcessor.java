package com.mindfulthinktank.boilerplate.annotationprocessors;

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
public class EnumDerivationsProcessor extends TypeAnnotationProcessor {
  public EnumDerivationsProcessor() {
    super(Derivations.class);
  }

  @Override
  protected void process(TypeElement type, RoundEnvironment environment) {
    Derivations annotation = type.getAnnotation(Derivations.class);

    Properties properties = UVelocity.createVelocityProperties();
    if (annotation.generateEnumeration()) {
      VelocityContext context = createEnumContext(type);
      String generatedEnumCode = UVelocity.mergeAsString("Enumeration.template", context,
          properties);

      String enumSourceName = type.getQualifiedName().toString() + "Kind";
      writeSource(enumSourceName, generatedEnumCode);
    }
  }

  private VelocityContext createEnumContext(TypeElement type) {
    String packageName = ((PackageElement) type.getEnclosingElement()).getQualifiedName()
        .toString();
    String enumName = type.getSimpleName() + "Kind";
    String[] values = type.getAnnotation(Derivations.class).values();

    VelocityContext context = new VelocityContext();

    context.put("package", packageName);
    context.put("name", enumName);
    context.put("values", values);

    return context;
  }

}
