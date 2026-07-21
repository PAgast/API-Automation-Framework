package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import dataproviders.BookingDataProvider;
import io.restassured.response.Response;
import services.BookingService;

public class CreateBookingDataProviderTest extends BaseTest {

    @Test(dataProvider = "bookingData",
          dataProviderClass = BookingDataProvider.class)

    public void createBooking(String firstName,
                              String lastName,
                              int price,
                              boolean depositPaid) {

        Response response = BookingService.createBooking(
                firstName,
                lastName,
                price,
                depositPaid);

        response.then()
                .statusCode(200);

        int bookingId = response.jsonPath().getInt("bookingid");

        System.out.println("--------------------------------");
        System.out.println("Booking Created");
        System.out.println("Booking ID : " + bookingId);
        System.out.println("Name : " + firstName + " " + lastName);
        logger.info("GitHub Webhook Test");
    }
}
