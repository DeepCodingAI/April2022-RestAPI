$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/GetInValidSingleEmployee.feature");
formatter.feature({
  "name": "Rest API for InValid Single Employee",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Get Single Employee Info InValid GET Request",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "baseUrl and invalid resourcePath",
  "keyword": "Given "
});
formatter.match({
  "location": "SingleEmployeeInValidCallStepDefinition.baseUrl_and_invalid_resourcePath()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Make a invalid GET call",
  "keyword": "When "
});
formatter.match({
  "location": "SingleEmployeeInValidCallStepDefinition.make_a_invalid_get_call()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should receive status code 404",
  "keyword": "Then "
});
formatter.match({
  "location": "SingleEmployeeInValidCallStepDefinition.i_should_receive_status_code_404()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("classpath:features/GetValidSingleEmployee.feature");
formatter.feature({
  "name": "Rest API for Valid Single Employee",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Get Single Employee Info Valid GET Request",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "baseUrl and valid resourcePath",
  "keyword": "Given "
});
formatter.match({
  "location": "SingleEmployeeValidCallStepDefinition.baseUrl_and_valid_resourcePath()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Make a valid GET call",
  "keyword": "When "
});
formatter.match({
  "location": "SingleEmployeeValidCallStepDefinition.make_a_valid_get_call()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should receive status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "SingleEmployeeValidCallStepDefinition.i_should_receive_status_code_200()"
});
formatter.result({
  "status": "passed"
});
});