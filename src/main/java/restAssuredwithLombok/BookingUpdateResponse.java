package restAssuredwithLombok;

import lombok.Data;

@Data

public class BookingUpdateResponse {
	 private int bookingid; 
	    private BookingUpdateRequest booking; 

}
