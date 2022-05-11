package me.whiteship.refactoring._18_middle_man._40_replace_subclass_with_delegate;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Booking {

    protected Show show;

    protected LocalDateTime time;

    private PremiumDelegate premiumDelegate;

//    public Booking(Show show, LocalDateTime time) {
//        this.show = show;
//        this.time = time;
//    }

    private Booking () {

    }

    public static Booking createBooking(Show show, LocalDateTime time) {
        Booking booking = new Booking();
        booking.show = show;
        booking.time = time;

        return booking;
    }

    public static Booking createPremiumBooking(Show show, LocalDateTime time, PremiumExtra extra) {
        Booking booking = new Booking();
        booking.show = show;
        booking.time = time;
        booking.premiumDelegate = new PremiumDelegate(booking, extra);

        return booking;
    }

    public boolean hasTalkback() {
        return (this.premiumDelegate == null)
            ? this.show.hasOwnProperty("talkback") && !this.isPeakDay()
            : this.premiumDelegate.hasTalkback();
    }

    protected boolean isPeakDay() {
        DayOfWeek dayOfWeek = this.time.getDayOfWeek();
        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }

    public boolean hasDinner() {
        return this.premiumDelegate != null && this.premiumDelegate.hasDinner();
    }

    public double basePrice() {
        double result = this.show.getPrice();
        if (this.isPeakDay()) result += Math.round(result * 0.15);

        return (this.premiumDelegate == null)
            ? result
            : this.premiumDelegate.extendBasePrice(result);
    }
}
