package tests;

import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import base.BaseTest;
import endpoints.BookingAPI;
import io.restassured.response.Response;
import pojo.Booking;
import services.BookingService;
import utils.Test.TestData;

public class UpdateBookingTest extends BaseTest {

    @Test
    public void updateBooking() {

        Response response = BookingService.updateBooking(TestData.bookingId);

        response.then()
                .statusCode(200)
                .body("firstname", equalTo("Rahul"))
                .body("lastname", equalTo("Sharma"))
                .body("totalprice", equalTo(1000))
                .body("depositpaid", equalTo(false))
                .log().all();
        
    }
}