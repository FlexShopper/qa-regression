package flexshopper.com.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PersonalInfoSteps {
    @When("the user lands in the PersonalInfo screen")
    public void theUserLandsInThePersonalInfoScreen() {
    }

    @Then("the user can see \"PersonalInfo:")
    public void theUserCanSeePersonalInfo() throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
    }

    @And("the user can see the {string} drop down button")
    public void theUserCanSeeTheDropDownButton(String arg0) {
    }

    @And("the user can see the following options:")
    public void theUserCanSeeTheFollowingOptions() {
    }

    @And("the user can see one of the options")
    public void theUserCanSeeOneOfTheOptions() {
    }

    @And("the user can see the link {string}")
    public void theUserCanSeeTheLink(String arg0) {
    }

    @Given("the user is in the PersonalInfo")
    public void theUserIsInThePersonalInfo() {
    }

    @When("the user clicks on the {string} link")
    public void theUserClicksOnTheLink(String arg0) {
    }

    @Given("the user is in the PersonalInfo screen")
    public void theUserIsInThePersonalInfoScreen() {
    }

    @When("the user enters an invalid length of SSN: {string}")
    public void theUserEntersAnInvalidLengthOfSSN(String arg0) {
    }

    @When("the user enters an invalid of DOB: {string} and {string}")
    public void theUserEntersAnInvalidOfDOBAnd(String arg0, String arg1) {
    }

    @When("the user has entered information in the DOB field")
    public void theUserHasEnteredInformationInTheDOBField() {
    }

    @And("the user has entered information in the SSN field")
    public void theUserHasEnteredInformationInTheSSNField() {
    }

    @And("the user has entered information in the Gross Income field")
    public void theUserHasEnteredInformationInTheGrossIncomeField() {
    }

    @And("the user has entered Gross Monthly Income field")
    public void theUserHasEnteredGrossMonthlyIncomeField() {
    }

    @And("the user clicks on the Pay Frequency dropdown button and select frequency option")
    public void theUserClicksOnThePayFrequencyDropdownButtonAndSelectFrequencyOption() {
    }

    @And("clicks sign me up")
    public void clicksSignMeUp() {
    }
}