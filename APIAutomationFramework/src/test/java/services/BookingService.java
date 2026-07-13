package services;

import static io.restassured.RestAssured.given;

import endpoints.BookingAPI;
import io.restassured.response.Response;
import payloads.BookingPayload;
import payloads.PatchPayload;
import specifications.RequestSpec;
import utils.Test.APIClient;
import utils.Test.TestData;

public class BookingService {
	public static Response createBooking() {
		
		return APIClient.post(BookingAPI.CREATE_BOOKING, BookingPayload.createBookingPayload());
	}
	

	public static Response createBooking(String firstName,String lastName,int price,boolean depositPaid) {
    	return 
    	        APIClient.post(BookingAPI.CREATE_BOOKING, BookingPayload.createBookingPayload(firstName,
                      lastName,
                        price,
                        depositPaid));
    	        
    	        
	}
	public static Response getBooking(int bookingId) {

	    return APIClient.get(
	            BookingAPI.GET_BOOKING,
	            "id",
	            bookingId);
	}


    	 public static Response updateBooking(int bookingId) {
          String token= AuthService.getToken();
    	     return  APIClient.put(BookingAPI.UPDATE_BOOKING, token, "id", bookingId, BookingPayload.updateBookingPayload());
    	                

}
    	 public static Response partialUpdateBooking(int bookingId) {
             String token= AuthService.getToken();
       	     return 
       	                APIClient.patch(BookingAPI.PARTIAL_UPDATE_BOOKING,token,"id",bookingId,PatchPayload.updateFirstName());
    	 
    	 
}

    	 public static Response deleteBooking(int bookingId) {

    		    String token = AuthService.getToken();

    		    return APIClient
    		            .delete(BookingAPI.DELETE_BOOKING,token,"id",bookingId);
    		}
		
		
    	 
}
