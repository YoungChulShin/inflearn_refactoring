package me.whiteship.refactoring._11_primitive_obsession._30_repliace_primitive_with_object;

public enum PriorityEnum {

  LOW(1),
  NORMAL(2),
  HIGH(3),
  RUSH(4);

  private final int value;

  PriorityEnum(int value) {
    this.value = value;
  }

  public boolean higherThan(PriorityEnum other) {
    return this.value > other.value;
  }

  @Override
  public String toString() {
    return String.valueOf(this.value);
  }
}
