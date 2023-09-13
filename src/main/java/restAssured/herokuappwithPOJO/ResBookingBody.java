package restAssured.herokuappwithPOJO;

public class ResBookingBody {
	
private int bookingid;
	
	public ResBookingBody(){
		
	}
	
	
	public ResBookingBody(int bookingid) {
		
		this.bookingid = bookingid;
	}

	public int getBookingid() {
		return bookingid;
	}
	
	

}
