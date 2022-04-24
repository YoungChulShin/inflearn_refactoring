package me.whiteship.refactoring._11_primitive_obsession._30_repliace_primitive_with_object;

import java.util.Arrays;
import java.util.List;

public class Priority {

  private final String value;

  private final List<String> legalValues = List.of("low", "normal", "high", "rush");

  public Priority(String value) {
    if (legalValues.contains(value)) {
      this.value = value;
    } else {
      throw new IllegalArgumentException("Illegal value for priority " + value);
    }
  }

  private int index() {
    return this.legalValues.indexOf(this.value);
  }

  public boolean higherThan(Priority other) {
    return this.index() > other.index();
  }

  @Override
  public String toString() {
    return this.value;
  }
}
