package utils.Test;

import static io.restassured.RestAssured.given;

import endpoints.BookingAPI;
import io.restassured.response.Response;
import specifications.RequestSpec;

public class APIClient {
	
	public static Response get(String endpoint)
	{
		return given()
                .spec(RequestSpec.getRequestSpecification())
               

        .when()
                .get(endpoint);
	
	}
	
	public static Response get(String endpoint, String pathParamName , Object pathParamValue )
	{
		return given()
                .spec(RequestSpec.getRequestSpecification())
                .pathParam(pathParamName,pathParamValue)
               

        .when()
                .get(endpoint);
	
	}
	
	public static Response post(String endpoint , Object body)
	{
		return given()
                .spec(RequestSpec.getRequestSpecification())
                .body(body)
               

        .when()
                .post(endpoint);
	
	}
	public static Response put(String endpoint , String token,String pathParamName , Object pathParamValue, Object body)
	{
		return given()
                .spec(RequestSpec.getRequestSpecification())
                .cookie("token", token)
                .pathParam(pathParamName, pathParamValue)
                .body(body)
               

        .when()
                .put(endpoint);
	
	}
	 public static Response patch(String endpoint,
             String token,
             String pathParamName,
             Object pathParamValue,
             Object body) {

return given()
.spec(RequestSpec.getRequestSpecification())
.cookie("token", token)
.pathParam(pathParamName, pathParamValue)
.body(body)

.when()
.patch(endpoint);
}
	 public static Response delete(String endpoint,
             String token,
             String pathParamName,
             Object pathParamValue) {

return given()
.spec(RequestSpec.getRequestSpecification())
.cookie("token", token)
.pathParam(pathParamName, pathParamValue)

.when()
.delete(endpoint);
}
	
}
