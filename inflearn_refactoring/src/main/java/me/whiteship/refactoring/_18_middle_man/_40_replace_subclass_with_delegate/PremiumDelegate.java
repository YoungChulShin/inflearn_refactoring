package me.whiteship.refactoring._18_middle_man._40_replace_subclass_with_delegate;

public class PremiumDelegate {

  private Booking host;
  private PremiumExtra premiumExtra;

  public PremiumDelegate(Booking host, PremiumExtra premiumExtra) {
    this.host = host;
    this.premiumExtra = premiumExtra;
  }

  public double extendBasePrice(double basePrice) {
    return Math.round(basePrice + this.premiumExtra.getPremiumFee());
  }

  public boolean hasTalkback() {
    return this.host.show.hasOwnProperty("talkback");
  }

  public boolean hasDinner() {
    return this.premiumExtra.hasOwnProperty("dinner") && !this.host.isPeakDay();
  }

}
