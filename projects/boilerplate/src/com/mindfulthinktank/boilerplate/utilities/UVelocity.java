package com.mindfulthinktank.boilerplate.utilities;

import java.io.StringWriter;
import java.util.Properties;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

public class UVelocity {
  public static Properties createVelocityProperties(String templateRootPath) {
    Properties properties = new Properties();

    properties.setProperty("resource.loader", "file");
    properties.setProperty("file.resource.loader.description", "Velocity File Resource Loader");
    properties.setProperty("file.resource.loader.class",
        "org.apache.velocity.runtime.resource.loader.FileResourceLoader");
    properties.setProperty("file.resource.loader.path", templateRootPath);
    properties.setProperty("file.resource.loader.cache", "false");
    properties.setProperty("file.resource.loader.modificationCheckInterval", "0");
    properties.setProperty("runtime.log.logsystem.class",
        "org.apache.velocity.runtime.log.NullLogSystem");

    return properties;
  }

  public static Properties createVelocityProperties() {
    return createVelocityProperties("S:\\cloud\\mindfulthinktank\\GitHub\\k\\projects\\boilerplate\\src\\com\\mindfulthinktank\\boilerplate\\annotationprocessors\\templates");
  }

  public static String mergeAsString(String template, VelocityContext context, Properties properties) {
    VelocityEngine engine = new VelocityEngine(properties);
    StringWriter writer = new StringWriter();
    engine.mergeTemplate(template, "utf8", context, writer);
    writer.flush();

    return writer.toString();
  }
}
