package com.mindfulthinktank.boilerplate.annotations.processing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;

import org.apache.velocity.VelocityContext;

import com.mindfulthinktank.boilerplate.annotations.VarietyShorthandEnumeration;
import com.mindfulthinktank.boilerplate.utilities.AStringPair;
import com.mindfulthinktank.boilerplate.utilities.StringPair;
import com.mindfulthinktank.boilerplate.utilities.UFiles;
import com.mindfulthinktank.boilerplate.utilities.UStrings;
import com.mindfulthinktank.boilerplate.utilities.UStrings.StringSplitOptions;
import com.mindfulthinktank.boilerplate.utilities.UTypeElement;
import com.mindfulthinktank.boilerplate.utilities.UVelocity;

@SupportedAnnotationTypes("com.mindfulthinktank.boilerplate.annotations.VarietyShorthandEnumeration")
@SupportedSourceVersion(SourceVersion.RELEASE_6)
public class VarietyShorthandEnumerationTypeAnnotationProcessor extends TypeAnnotationProcessor {

  public VarietyShorthandEnumerationTypeAnnotationProcessor() {
    super(VarietyShorthandEnumeration.class);
  }

  @Override
  protected void process(TypeElement type, RoundEnvironment environment) {
    VarietyShorthandEnumeration annotation = type.getAnnotation(VarietyShorthandEnumeration.class);

    String name = getEnumerationName(type, annotation);
    String code = getEnumerationCode(type, annotation, name);
    String sourceName = getSourceName(type, name);

    writeSource(sourceName, code);
  }

  private String getEnumerationName(TypeElement type, VarietyShorthandEnumeration annotation) {
    String templateName = "/templates/strings/ShorthandEnumeration/" + type.getSimpleName();
    UVelocity.register(templateName, annotation.name());
    VelocityContext context = new VelocityContext();
    context.put("target", type);

    return UVelocity.mergeAsString(templateName, context);
  }

  private String getEnumerationCode(TypeElement type,
                                    VarietyShorthandEnumeration annotation,
                                    String enumerationName) {
    String specPath = getSpecPath(type, annotation);
    return generateEnumerationCode(type, enumerationName, parseSpecFile(specPath));
  }

  private String getSpecPath(TypeElement type, VarietyShorthandEnumeration annotation) {
    String templateForTemplateName = annotation.template();
    String templateNameForTemplateName = "/templates/strings/VarietyShorthandEnumerationTemplate/"
        + type.getSimpleName();
    VelocityContext context = new VelocityContext();
    context.put("target", type);

    UVelocity.register(templateNameForTemplateName, templateForTemplateName);
    String specName = UVelocity.mergeAsString(templateNameForTemplateName, context);

    return getTypeSourcePath(type).getParent().toString() + "\\" + specName;
  }

  private List<StringPair> parseSpecFile(String filePath) {
    List<StringPair> result = new ArrayList<StringPair>();

    try {
      for (String line : UFiles.readNonEmptyLines(filePath)) {
        result
            .add(new AStringPair(UStrings.split(line, " ", StringSplitOptions.RemoveEmptyEntries)));
      }
    } catch (IOException e) {
      note(e.getMessage());
    }

    return result;

  }

  private static String generateEnumerationCode(TypeElement type,
                                                String enumerationName,
                                                List<StringPair> pairs) {
    VelocityContext context = new VelocityContext();
    context.put("pairs", pairs);
    context.put("package", UTypeElement.getPackageQualifiedName(type));
    context.put("name", enumerationName);

    return UVelocity.mergeAsString("ShorthandEnumeration.template", context);
  }

  private String getSourceName(TypeElement type, String enumerationName) {
    return UTypeElement.getPackageQualifiedName(type) + "." + enumerationName;
  }
}
