package tests;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
import base.BaseTest;
import io.restassured.response.Response;
import services.BookingService;
import specifications.RequestSpec;
import utils.Test.TestData;

public class PartialUpdateTest extends BaseTest{
	
	@Test
	public static void partialUpdateBooking() {
		
		Response response = BookingService.partialUpdateBooking(TestData.bookingId);
		
		response.then()
		.statusCode(200)
		.body("firstname",equalTo("Priya"))
		.body("lastname", equalTo("Sharma"))
		.body("totalprice",equalTo(1000))
		.log().all();
		
		
				
		
		
		
	}

}
