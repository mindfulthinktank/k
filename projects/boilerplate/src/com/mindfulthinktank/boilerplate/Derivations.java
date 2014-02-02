package com.mindfulthinktank.boilerplate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface Derivations {
  String[] values();

  boolean generateEnumeration() default false;

  boolean useTemplate() default true;
}
