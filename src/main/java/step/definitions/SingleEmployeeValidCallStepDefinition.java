package step.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import resources.SingleEmployeeResources;


public class SingleEmployeeValidCallStepDefinition {

    String baseUrl = "";
    String resourcePath = "";
    String objectId = "62b8664d2fc2132015669d09";
    int actualStatusCode = 0;
    int expectedStatusCode = 200;

    @Given("baseUrl and valid resourcePath")
    public void baseUrl_and_valid_resourcePath(){
        baseUrl = "http://restapi.aineurontech.com:8080/service-webapp";
        resourcePath = "/api/SingleEmployeeResources/";
    }

    @When("Make a valid GET call")
    public void make_a_valid_get_call(){
        actualStatusCode = SingleEmployeeResources.getSingleEmployeeResourcesSuccessStatus(baseUrl,resourcePath,objectId);
    }

    @Then("I should receive status code 200")
    public void i_should_receive_status_code_200(){
        Assert.assertEquals(actualStatusCode,expectedStatusCode);
    }
}
