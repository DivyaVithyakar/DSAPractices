package restAssured.herokuappwithPOJO;

public class ReqBookingIDS {
	private int bookingid;
	private ReqBookingBody booking;
	
	public ReqBookingIDS() {
		
	}

	public ReqBookingIDS(int bookingid, ReqBookingBody booking) {
		this.bookingid = bookingid;
		this.booking = booking;
	}

	public int getBookingid() {
		return bookingid;
	}

	public ReqBookingBody getBooking() {
		return booking;
	}

	

}
