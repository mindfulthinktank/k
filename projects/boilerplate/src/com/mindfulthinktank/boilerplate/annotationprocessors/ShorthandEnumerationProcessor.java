package com.mindfulthinktank.boilerplate.annotationprocessors;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.tools.JavaFileObject;

import org.apache.velocity.VelocityContext;

import com.mindfulthinktank.boilerplate.ShorthandEnumeration;
import com.mindfulthinktank.boilerplate.utilities.AStringPair;
import com.mindfulthinktank.boilerplate.utilities.StringPair;
import com.mindfulthinktank.boilerplate.utilities.UFiles;
import com.mindfulthinktank.boilerplate.utilities.UStrings;
import com.mindfulthinktank.boilerplate.utilities.UVelocity;
import com.mindfulthinktank.boilerplate.utilities.UStrings.StringSplitOptions;

@SupportedAnnotationTypes("com.mindfulthinktank.boilerplate.ShorthandEnumeration")
@SupportedSourceVersion(SourceVersion.RELEASE_6)
public class ShorthandEnumerationProcessor extends TypeAnnotationProcessor {
  public ShorthandEnumerationProcessor() {
    super(ShorthandEnumeration.class);
  }

  @Override
  protected void process(TypeElement type, RoundEnvironment environment) {
    writeOutput(type, generateEnumerationCode(type));
  }

  private void writeOutput(TypeElement type, String content) {
    try {
      JavaFileObject file = filer.createSourceFile(type.getQualifiedName().toString() + "Kind");
      Writer writer = file.openWriter();
      writer.write(content);
      writer.close();
    } catch (IOException e) {
      note(e.getMessage());
    }
  }

  private String generateEnumerationCode(TypeElement type) {
    Path path = getTypeSourcePath(type);
    String specPath = path.toString().replace(".java", "Kind.spec");
    try {
      return generateEnumerationCode(parseSpecFile(specPath));
    } catch (IOException e) {
      return "";
    }
  }

  private static List<StringPair> parseSpecFile(String filePath) throws IOException {
    List<StringPair> result = new ArrayList<StringPair>();

    for (String line : UFiles.readNonEmptyLines(filePath)) {
      result.add(new AStringPair(UStrings.split(line, " ", StringSplitOptions.RemoveEmptyEntries)));
    }

    return result;
  }

  private static String generateEnumerationCode(List<StringPair> pairs) throws IOException {
    Properties properties = UVelocity
        .createVelocityProperties("S:\\cloud\\mindfulthinktank\\GitHub\\k\\projects\\boilerplate\\src\\com\\mindfulthinktank\\boilerplate\\annotationprocessors\\templates");
    VelocityContext context = createVelocityContext(pairs);

    return UVelocity.mergeAsString("ShorthandEnumeration.template", context, properties);
  }

  private static VelocityContext createVelocityContext(List<StringPair> pairs) {
    VelocityContext context = new VelocityContext();

    context.put("pairs", pairs);
    context.put("package", "com.mindfulthinktank.k.language.model");
    context.put("name", "BinaryExpressionKind");

    return context;
  }
}
