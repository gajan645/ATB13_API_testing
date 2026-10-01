package ex_07_payload_mangament.Class.Manually.responsePOJO;

import ex_07_payload_mangament.Class.Manually.requestPOJO.Booking;

public class BookingResponse {
    private Integer bookingid;
   private Booking booking;

    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
