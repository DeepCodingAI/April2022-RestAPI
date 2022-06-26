package resources;

import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class SingleEmployeeResources {

    public static String baseUrl = "http://restapi.aineurontech.com:8080/service-webapp";
    public static String validResourcePath = "/api/SingleEmployeeResources/";
    public static String inValidResourcePath = "/api/SingleEmployeeResourcesByPass/";
    public static String objectId = "62b8664d2fc2132015669d09";

    public void callSingleEmployeeResourcesSuccessStatus(){
        Response response = given().when().get(baseUrl + validResourcePath + objectId).then().statusCode(200).extract().response();
        String statusLine = response.statusLine();
        int statusCode = response.getStatusCode();
        System.out.println(statusLine);
        Assert.assertEquals(statusLine,"HTTP/1.1 200 OK");
        response.getBody().prettyPrint();
        Assert.assertEquals(statusCode, 200);
    }

    public void callSingleEmployeeResourcesFailStatus(){
        Response response = given().when().get(baseUrl + inValidResourcePath + objectId).then().statusCode(404).extract().response();
        String statusLine = response.statusLine();
        int statusCode = response.getStatusCode();
        System.out.println(statusLine);
        Assert.assertEquals(statusLine,"HTTP/1.1 404 Not Found");
        response.getBody().prettyPrint();
        Assert.assertEquals(statusCode, 404);
    }

    public static int getSingleEmployeeResourcesSuccessStatus(String baseUrl, String resourcePath, String objectId){
        Response response = given().when().get(baseUrl + resourcePath + objectId).then().statusCode(200).extract().response();
        int statusCode = response.getStatusCode();

        return statusCode;
    }

    public static int getSingleEmployeeResourcesUnSuccessfulStatus(String baseUrl, String resourcePath, String objectId){
        Response response = given().when().get(baseUrl + resourcePath + objectId).then().statusCode(404).extract().response();
        int statusCode = response.getStatusCode();

        return statusCode;
    }
}
