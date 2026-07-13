package dataproviders;

import org.testng.annotations.DataProvider;

public class BookingDataProvider {
	@DataProvider(name="bookingData")
	public Object[][] bookingData()
	{
		return new Object[][]
				{ {"Mohit", "Bhatia", 500, true},
            {"Rahul", "Sharma", 1000, false},
            {"Priya", "Verma", 700, true}
				};
		
	}
}
