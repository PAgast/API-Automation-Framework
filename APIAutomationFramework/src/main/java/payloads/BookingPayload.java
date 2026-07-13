package payloads;

import pojo.Booking;
import pojo.BookingDates;

public class BookingPayload {
	
	public static Booking createBookingPayload(String firstName,
            String lastName,
            int price,
            boolean depositPaid) {

Booking booking = new Booking();

booking.setFirstname(firstName);
booking.setLastname(lastName);
booking.setTotalprice(price);
booking.setDepositpaid(depositPaid);
booking.setAdditionalneeds("Breakfast");

BookingDates dates = new BookingDates();

dates.setCheckin("2026-08-01");
dates.setCheckout("2026-08-05");

booking.setBookingdates(dates);

return booking;
}
	public static Booking createBookingPayload() {

Booking booking = new Booking();

booking.setFirstname("Mohit");
booking.setLastname("Bhatia");
booking.setTotalprice(500);
booking.setDepositpaid(true);
booking.setAdditionalneeds("Breakfast");

BookingDates dates = new BookingDates();

dates.setCheckin("2026-08-01");
dates.setCheckout("2026-08-05");

booking.setBookingdates(dates);

return booking;
}
	
	
	
public static  Booking updateBookingPayload() {
		
		Booking booking = new Booking();
		
		booking.setFirstname("Rahul");
		booking.setLastname("Sharma");
		booking.setTotalprice(1000);
		booking.setDepositpaid(false);
		booking.setAdditionalneeds("lunch");
		
		BookingDates dates= new BookingDates();
		
		dates.setCheckin("2026-09-01");
        dates.setCheckout("2026-09-05");

        booking.setBookingdates(dates);
		
		return booking;
		
		
		
		
		
		
	}
public static Booking deleteBookingPayload()
{
	Booking booking= new Booking();
	
	
	
	return booking;
	
}



}
