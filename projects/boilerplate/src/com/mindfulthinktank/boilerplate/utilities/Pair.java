package com.mindfulthinktank.boilerplate.utilities;

import java.util.List;

public interface Pair<T> extends List<T> {
  T getFirst();

  T getSecond();
}
