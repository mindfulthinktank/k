package com.mindfulthinktank.k.testing;

import java.util.List;
import java.util.Properties;

import org.apache.velocity.VelocityContext;

import com.mindfulthinktank.boilerplate.utilities.UFiles;
import com.mindfulthinktank.boilerplate.utilities.UVelocity;
import com.mindfulthinktank.k.language.model.BinaryExpression;
import com.mindfulthinktank.k.language.model.BinaryExpressionKind;
import com.mindfulthinktank.k.language.model.Expression;
import com.mindfulthinktank.k.language.model.IdentifierExpression;
import com.mindfulthinktank.k.language.model.IntegerLiteralExpression;

public class TestModel {
  private static final String ROOT = "S:\\cloud\\mindfulthinktank\\GitHub\\k\\projects\\language\\src\\com\\mindfulthinktank\\k\\generation";

  public static void main(String[] args) {

    Expression e = new BinaryExpression(BinaryExpressionKind.NUMERIC_ADDITION, new IntegerLiteralExpression("1"), new IdentifierExpression("n"));
    
    Properties properties = UVelocity.createVelocityProperties(ROOT + "\\templates");
    VelocityContext context = new VelocityContext();
    context.put("e", e);

    List<String> languages = UFiles.readNonEmptyLinesOrNull(ROOT + "\\registry\\languages.registry");
    for (String language : languages) {
      System.out.println(UVelocity.mergeAsString(String.format("%s/start.template", language), context, properties));
    }
  }
}
