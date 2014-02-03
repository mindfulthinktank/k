package com.mindfulthinktank.boilerplate.utilities;

import java.io.StringWriter;
import java.nio.file.Path;
import java.util.Properties;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.resource.loader.StringResourceLoader;
import org.apache.velocity.runtime.resource.util.StringResourceRepository;
import org.apache.velocity.runtime.resource.util.StringResourceRepositoryImpl;

public class UVelocity {
  private static final String REPO = "S:\\cloud\\mindfulthinktank\\GitHub\\k\\projects\\boilerplate\\src\\com\\mindfulthinktank\\boilerplate\\annotations\\processing\\templates";

  public static Properties createVelocityProperties(String templateRootPath) {
    Properties properties = new Properties();

    properties.setProperty("resource.loader", "file,string");
    properties.setProperty("file.resource.loader.description", "Velocity File Resource Loader");
    properties.setProperty("file.resource.loader.class",
        "org.apache.velocity.runtime.resource.loader.FileResourceLoader");
    properties.setProperty("file.resource.loader.path", templateRootPath);
    properties.setProperty("file.resource.loader.cache", "false");
    properties.setProperty("file.resource.loader.modificationCheckInterval", "0");

    properties.setProperty("string.resource.loader.description", "Velocity StringResource loader");
    properties.setProperty("string.resource.loader.class",
        "org.apache.velocity.runtime.resource.loader.StringResourceLoader");
    properties.setProperty("string.resource.loader.repository.name", "repo");
    properties.setProperty("string.resource.loader.repository.class",
        "org.apache.velocity.runtime.resource.util.StringResourceRepositoryImpl");

    properties.setProperty("runtime.log.logsystem.class",
        "org.apache.velocity.runtime.log.NullLogSystem");

    return properties;
  }

  public static Properties createVelocityProperties() {
    return createVelocityProperties(REPO);
  }

  public static String mergeAsString(String template, VelocityContext context, Path path) {
    return mergeAsString(template, context, createVelocityProperties(path.toString() + "," + REPO));
  }

  public static String mergeAsString(String template, VelocityContext context) {
    return mergeAsString(template, context, createVelocityProperties());
  }

  public static String mergeAsString(String template, VelocityContext context, Properties properties) {
    VelocityEngine engine = new VelocityEngine(properties);

    StringWriter writer = new StringWriter();
    engine.setApplicationAttribute("repo", repository);
    engine.mergeTemplate(template, "utf8", context, writer);
    writer.flush();

    return writer.toString();
  }

  private static StringResourceRepository repository;

  public static void register(String templateName, String template) {
    if (repository == null) {
      repository = new StringResourceRepositoryImpl();
      StringResourceLoader.setRepository("repo", repository);
    }
    repository.putStringResource(templateName, template);
  }
}
