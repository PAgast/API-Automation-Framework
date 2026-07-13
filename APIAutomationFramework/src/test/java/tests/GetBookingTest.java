package tests;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import endpoints.BookingAPI;
import io.restassured.response.Response;
import pojo.Booking;
import services.BookingService;
import specifications.RequestSpec;
import utils.Test.TestData;

public class GetBookingTest extends BaseTest {

    @Test
    public void getBooking() {

        Response response = BookingService.getBooking(TestData.bookingId);
        response.then()
                .statusCode(200)
                .log().all();

        Booking booking = response.as(Booking.class);
        Assert.assertEquals(booking.getFirstname(), "Priya");
        Assert.assertEquals(booking.getLastname(), "Sharma");
        Assert.assertEquals(booking.getTotalprice(), 1000);
        Assert.assertFalse(booking.isDepositpaid());
        Assert.assertEquals(booking.getAdditionalneeds(), "lunch");
        Assert.assertEquals(booking.getBookingdates().getCheckin(), "2026-09-01");
        Assert.assertEquals(booking.getBookingdates().getCheckout(), "2026-09-05");
        System.out.println("First Name : " + booking.getFirstname());
    }
}