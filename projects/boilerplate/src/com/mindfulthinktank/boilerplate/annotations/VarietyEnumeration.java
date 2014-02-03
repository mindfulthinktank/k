package com.mindfulthinktank.boilerplate.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface VarietyEnumeration {
  public String name() default "${target.simpleName}Kind";
  public String template() default "VarietyEnumeration.velocitytemplate";
  public String[] varieties() default {};
}
