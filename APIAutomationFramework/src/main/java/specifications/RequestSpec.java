package specifications;

import config.ConfigReader;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpec {
	
	public static RequestSpecification requestspecification;
	
	public static RequestSpecification getRequestSpecification() {
		if(requestspecification==null) {
			
			requestspecification= new RequestSpecBuilder()
					.setContentType(ContentType.JSON)
					.build();
		}
		return requestspecification;	

}
	}
