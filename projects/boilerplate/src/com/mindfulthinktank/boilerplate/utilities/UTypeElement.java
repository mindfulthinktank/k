package com.mindfulthinktank.boilerplate.utilities;

import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;

public class UTypeElement {
  public static String getPackageQualifiedName(TypeElement type) {
    return ((PackageElement)type.getEnclosingElement()).getQualifiedName().toString();
  }
}
