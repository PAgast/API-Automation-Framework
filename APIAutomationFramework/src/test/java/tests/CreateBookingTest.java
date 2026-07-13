package tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import base.BaseTest;
import endpoints.BookingAPI;
import io.restassured.response.Response;
import payloads.BookingPayload;
import services.AuthService;
import services.BookingService;
import specifications.RequestSpec;
import utils.Test.TestData;

public class CreateBookingTest extends BaseTest {
	
    @Test
    public void createBooking() {
    	Response response = BookingService.createBooking();

    	response.then()
        .statusCode(200)
        .body("bookingid", notNullValue())
        .body("booking.firstname", equalTo("Mohit"))
        .body("booking.lastname", equalTo("Bhatia"))
        .body("booking.totalprice", equalTo(500))
        .body("booking.depositpaid", equalTo(true))
        .body("booking.additionalneeds", equalTo("Breakfast"));
    	System.out.println(response.asPrettyString());
    	int bookingId = response.jsonPath().getInt("bookingid");

    	System.out.println("Booking ID = " + bookingId);

    	TestData.bookingId = bookingId;
    	
    }
}
