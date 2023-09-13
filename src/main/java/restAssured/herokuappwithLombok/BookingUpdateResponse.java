package restAssured.herokuappwithLombok;

import lombok.Data;

@Data

public class BookingUpdateResponse {
	 private int bookingid; 
	    private BookingUpdateRequest booking; 

}
