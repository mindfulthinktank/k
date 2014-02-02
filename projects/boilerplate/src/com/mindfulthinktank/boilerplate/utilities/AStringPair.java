package com.mindfulthinktank.boilerplate.utilities;

import java.util.Collection;

public class AStringPair extends APair<String> implements StringPair {
  private static final long serialVersionUID = 7934177075653294320L;

  public AStringPair() {
    super();
  }

  public AStringPair(Collection<String> strings) {
    addAll(strings);
  }
}
