package restAssuredwithLombok;

import lombok.Data;

@Data
public class BookingResponse {
	   private String bookingid;
	    private BookingRequest booking;
	    private String additionalneeds;
	

}
