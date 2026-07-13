package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import io.restassured.response.Response;
import services.BookingService;
import utils.Test.TestData;

public class VerifyDeleteTest  extends BaseTest{
	
	@Test
	public void verifyDeletebooking() {
		
		Response response= BookingService.getBooking(TestData.bookingId);
		
		response.then()
		.statusCode(404);
		
		System.out.println("No Resource found");
	}

}
