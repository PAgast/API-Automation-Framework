package specifications;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

public class ResponseSpec {
	
	public static ResponseSpecification responsespecification;
	
	public static ResponseSpecification getResponseSpecification() {
		 if(responsespecification==null) {
			 
			 responsespecification= new ResponseSpecBuilder()
					 .expectContentType(ContentType.JSON)
					 .build();
		 }
		
		
		
		
		return responsespecification;
		
		
		
		
		
	}

}
