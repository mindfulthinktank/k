package com.mindfulthinktank.boilerplate.annotations.processing;

import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;

import org.apache.velocity.VelocityContext;

import com.mindfulthinktank.boilerplate.annotations.Variety;
import com.mindfulthinktank.boilerplate.annotations.VarietyClass;
import com.mindfulthinktank.boilerplate.utilities.UTypeElement;
import com.mindfulthinktank.boilerplate.utilities.UVelocity;

@SupportedAnnotationTypes("com.mindfulthinktank.boilerplate.annotations.VarietyClass")
@SupportedSourceVersion(SourceVersion.RELEASE_6)
public class VarietyClassTypeAnnotationProcessor extends TypeAnnotationProcessor {

  public VarietyClassTypeAnnotationProcessor() {
    super(VarietyClass.class);
  }

  @Override
  protected void process(TypeElement type, RoundEnvironment environment) {
    VarietyClass varietyClass = type.getAnnotation(VarietyClass.class);
    Variety variety = type.getAnnotation(Variety.class);

    String[] values = getClassVarieties(variety, varietyClass);
    for (String value : values) {
      String name = getClassName(type, value, varietyClass);
      String code = getClassCode(type, varietyClass, name, value);
      String sourceName = getSourceName(type, name);

      writeSource(sourceName, code);
    }
  }

  private String[] getClassVarieties(Variety variety, VarietyClass varietyClass) {
    String[] enumerationValues;

    if (variety == null) {
      enumerationValues = varietyClass.varieties();
    } else {
      enumerationValues = variety.values();
    }

    return enumerationValues;
  }

  private String getClassName(TypeElement type, String variety, VarietyClass varietyClass) {
    String templateName = "/templates/strings/VarietyClassName/" + type.getSimpleName();
    UVelocity.register(templateName, varietyClass.name());
    VelocityContext context = new VelocityContext();
    context.put("target", type);
    context.put("variety", variety);

    return UVelocity.mergeAsString(templateName, context);
  }

  private String getClassCode(TypeElement type,
                              VarietyClass varietyClass,
                              String className,
                              String variety) {
    String templateName = getTemplateName(type, varietyClass);
    VelocityContext context = new VelocityContext();
    context.put("package", UTypeElement.getPackageQualifiedName(type));
    context.put("class", className);
    context.put("variety", variety);
    context.put("target", type);

    return UVelocity.mergeAsString(templateName, context, getTypeSourcePath(type).getParent());
  }
  
  private String getTemplateName(TypeElement type, VarietyClass varietyClass) {
    String templateForTemplateName = varietyClass.template();
    String templateNameForTemplateName = "/templates/strings/VarietyClassTemplate/" + type.getSimpleName();
    VelocityContext context = new VelocityContext();
    context.put("target", type);

    UVelocity.register(templateNameForTemplateName, templateForTemplateName);
    String templateName = UVelocity.mergeAsString(templateNameForTemplateName, context);
    
    return templateName;
  }

  private String getSourceName(TypeElement type, String className) {
    return UTypeElement.getPackageQualifiedName(type) + "." + className;
  }
}
