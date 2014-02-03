package com.mindfulthinktank.boilerplate.annotations.processing;

import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;

import org.apache.velocity.VelocityContext;

import com.mindfulthinktank.boilerplate.annotations.Variety;
import com.mindfulthinktank.boilerplate.annotations.VarietyEnumeration;
import com.mindfulthinktank.boilerplate.utilities.UTypeElement;
import com.mindfulthinktank.boilerplate.utilities.UVelocity;

@SupportedAnnotationTypes("com.mindfulthinktank.boilerplate.annotations.VarietyEnumeration")
@SupportedSourceVersion(SourceVersion.RELEASE_6)
public class VarietyEnumerationTypeAnnotationProcessor extends TypeAnnotationProcessor {

  public VarietyEnumerationTypeAnnotationProcessor() {
    super(VarietyEnumeration.class);
  }

  @Override
  protected void process(TypeElement type, RoundEnvironment environment) {
    VarietyEnumeration varietyEnumeration = type.getAnnotation(VarietyEnumeration.class);
    Variety variety = type.getAnnotation(Variety.class);

    String name = getEnumerationName(type, varietyEnumeration);
    String[] values = getEnumerationValues(variety, varietyEnumeration);
    String code = getEnumerationCode(type, varietyEnumeration, name, values);
    String sourceName = getSourceName(type, name);
    
    writeSource(sourceName, code);
  }

  private String getEnumerationName(TypeElement type, VarietyEnumeration varietyEnumeration) {
    String templateName = "/templates/strings/VarietyEnumeration/" + type.getSimpleName();
    UVelocity.register(templateName, varietyEnumeration.name());
    VelocityContext context = new VelocityContext();
    context.put("target", type);

    return UVelocity.mergeAsString(templateName, context);
  }

  private String[] getEnumerationValues(Variety variety, VarietyEnumeration varietyEnumeration) {
    String[] enumerationValues;

    if (variety == null) {
      enumerationValues = varietyEnumeration.varieties();
    } else {
      enumerationValues = variety.values();
    }

    return enumerationValues;
  }

  private String getEnumerationCode(TypeElement type,
                                    VarietyEnumeration varietyEnumeration,
                                    String enumerationName,
                                    String[] enumerationValues) {
    String templateName = varietyEnumeration.template();
    VelocityContext context = new VelocityContext();
    context.put("package", UTypeElement.getPackageQualifiedName(type));
    context.put("enum", enumerationName);
    context.put("values", enumerationValues);
    context.put("target", type);
    
    return UVelocity.mergeAsString(templateName, context);
  }

  private String getSourceName(TypeElement type, String enumerationName) {
    return UTypeElement.getPackageQualifiedName(type) + "." + enumerationName;
  }
}
