package step.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import resources.SingleEmployeeResources;

public class SingleEmployeeInValidCallStepDefinition {

    String baseUrl = "";
    String resourcePath = "";
    String objectId = "62b8664d2fc2132015669d09";
    int actualStatusCode = 0;
    int expectedStatusCode = 404;

    @Given("baseUrl and invalid resourcePath")
    public void baseUrl_and_invalid_resourcePath(){
        baseUrl = "http://restapi.aineurontech.com:8080/service-webapp";
        resourcePath = "/api/data/SingleEmployeeResources/";
    }

    @When("Make a invalid GET call")
    public void make_a_invalid_get_call(){
        actualStatusCode = SingleEmployeeResources.getSingleEmployeeResourcesUnSuccessfulStatus(baseUrl,resourcePath,objectId);
    }

    @Then("I should receive status code 404")
    public void i_should_receive_status_code_404(){
        Assert.assertEquals(actualStatusCode,expectedStatusCode);
    }
}
