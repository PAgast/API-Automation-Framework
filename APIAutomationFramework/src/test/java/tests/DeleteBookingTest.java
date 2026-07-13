package tests;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import pojo.Booking;
import services.BookingService;
import utils.Test.TestData;

public class DeleteBookingTest {
	
	@Test
	public void deleteBooking()
	{
		Response response= BookingService.deleteBooking(TestData.bookingId);
		
		response.then()
		.statusCode(201);
		System.out.println("Deleted succesfully");
	}

}
