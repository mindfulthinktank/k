package com.mindfulthinktank.boilerplate.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface VarietyClass {
  public String name() default "${variety}${target.simpleName}";
  public String template() default "${target.simpleName}VarietyClass.velocitytemplate";
  public String[] varieties() default {};
}
