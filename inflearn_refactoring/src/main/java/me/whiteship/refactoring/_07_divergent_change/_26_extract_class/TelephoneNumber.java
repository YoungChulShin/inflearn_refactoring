package me.whiteship.refactoring._07_divergent_change._26_extract_class;

public class TelephoneNumber {

  private final String number;
  private final String areaCode;

  public TelephoneNumber(String number, String areaCode) {
    this.number = number;
    this.areaCode = areaCode;
  }

  public String getNumber() {
    return number;
  }

  public String getAreaCode() {
    return areaCode;
  }

  @Override
  public String toString() {
    return this.areaCode + " " + this.number;
  }
}