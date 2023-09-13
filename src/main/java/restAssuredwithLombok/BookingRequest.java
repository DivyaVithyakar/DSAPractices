package restAssuredwithLombok;

import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Data


public class BookingRequest {
	 private String firstname;
	    private String lastname;
	    private int totalprice;
	    private boolean depositpaid;
	    private BookingDates bookingdates;
	    private String additionalneeds;

	    @Data
	    public static class BookingDates {
	        private String checkin;
	        private String checkout;
	    }

}
