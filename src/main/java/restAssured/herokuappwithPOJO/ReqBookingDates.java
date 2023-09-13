package restAssured.herokuappwithPOJO;

public class ReqBookingDates {
	
	private String checkin;
	private String checkout;
	
	
    public ReqBookingDates() {
		
	}
	
	public ReqBookingDates(String checkin, String checkout) {
		
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public String getCheckin() {
		return checkin;
	}

	public String getCheckout() {
		return checkout;
	}

	
	

}
