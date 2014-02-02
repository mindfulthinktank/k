package com.mindfulthinktank.boilerplate.utilities;

import java.util.ArrayList;

public class APair<T> extends ArrayList<T> implements Pair<T> {
  private static final long serialVersionUID = -268174413559480810L;

  @Override
  public T getFirst() {
    return get(0);
  }

  @Override
  public T getSecond() {
    return get(1);
  }
}
