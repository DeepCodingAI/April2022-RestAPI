package resources;

import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class AllEmployeeResources {
    String baseUrl = "http://restapi.aineurontech.com:8080/service-webapp";


    public void getAllEmployeeResources(){
        Response response = given().when().get(baseUrl+"/api/AllEmployeeResources").then().extract().response();
        int statusCode = response.getStatusCode();
        String statusLine = response.getStatusLine();
        response.getBody().prettyPrint();
        Assert.assertEquals(statusCode, 200);
        Assert.assertEquals(statusLine,statusLine);

    }
}
