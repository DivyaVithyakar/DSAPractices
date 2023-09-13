package restAssured.herokuappwithPOJO;

public class ReqBookingBody {
	
	private String firstname;
	private String lastname;
	private int totalprice;
	private boolean depositpaid;
	private ReqBookingDates bookingdates;
	private String additionalneeds;
	
   public ReqBookingBody() {
	   
   }

	public ReqBookingBody(String firstname, String lastname, int totalprice, boolean depositpaid,
			ReqBookingDates bookingdates, String additionalneeds) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.totalprice = totalprice;
		this.depositpaid = depositpaid;
		this.bookingdates = bookingdates;
		this.additionalneeds = additionalneeds;
		
	}
	
	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public int getTotalprice() {
		return totalprice;
	}

	public boolean isDepositpaid() {
		return depositpaid;
	}

	public ReqBookingDates getBookingdates() {
		return bookingdates;
	}

	public String getAdditionalneeds() {
		return additionalneeds;
	}
	
	

}
