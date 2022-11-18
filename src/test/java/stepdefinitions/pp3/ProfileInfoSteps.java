package stepdefinitions.pp3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileInfoSteps {
    @Given("^the user is on the Profile screen with email: \"([^\"]*)\"$")
    public void theUserIsOnTheProfileScreenWithEmail(String emailAddress) {
        System.out.println("Given the user is on the Profile screen with email: " + emailAddress);
    }

    @And("^the email address shown is not his$")
    public void theEmailAddressShownIsNotHis() {
        System.out.println("And the email address shown is not his");
    }

    @Then("^the user lands on the Email screen$")
    public void theUserLandsOnTheEmailScreen() {
        System.out.println("Then the user lands on the Email screen");
    }

    @When("^the user enters an invalid first name: \"([^\"]*)\"$")
    public void theUserEntersAnInvalidFirstName(String firstName) {
        System.out.println("When the user enters an invalid first name: " + firstName);
    }

    @Then("^the user should see the validation message: \"([^\"]*)\"$")
    public void theUserShouldSeeTheValidationMessage(String validationMsg) {
        System.out.println("Then the user should see the validation message: " + validationMsg);
    }

    @When("^the user enters an invalid last name: \"([^\"]*)\"$")
    public void theUserEntersAnInvalidLastName(String lastName) {
        System.out.println("When the user enters an invalid last name: " + lastName);
    }

    @When("^the user enters an invalid mobile number: \"([^\"]*)\"$")
    public void theUserEntersAnInvalidMobileNumber(String mobileNumber) {
        System.out.println("When the user enters an invalid mobile number: " + mobileNumber);
    }

    @When("^the user enters an invalid zip code: \"([^\"]*)\"$")
    public void theUserEntersAnInvalidZipCode(String zipCode) {
        System.out.println("When the user enters an invalid zip code: " + zipCode);
    }

    @When("^the user starts entering a valid address$")
    public void theUserStartsEnteringAValidAddress() {
        System.out.println("When the user starts entering a valid address");
    }

    @Then("^the user should see address suggestions$")
    public void theUserShouldSeeAddressSuggestions() {
        System.out.println("Then the user should see address suggestions");
    }

    @And("^the user can select the address from the suggestions$")
    public void theUserCanSelectTheAddressFromTheSuggestions() {
        System.out.println("And the user can select the address from the suggestions");
    }

    @When("^the user starts entering an invalid address$")
    public void theUserStartsEnteringAnInvalidAddress() {
        System.out.println("When the user starts entering an invalid address");
    }

    @Then("^the user should not see address suggestions$")
    public void theUserShouldNotSeeAddressSuggestions() {
        System.out.println("Then the user should not see address suggestions");
    }

    @And("^the user cannot select the address from the suggestions$")
    public void theUserCannotSelectTheAddressFromTheSuggestions() {
        System.out.println("And the user cannot select the address from the suggestions");
    }

    @When("^the user selects the address from the suggestions$")
    public void theUserSelectsTheAddressFromTheSuggestions() {
        System.out.println("When the user selects the address from the suggestions");
    }

    @Then("^the user lands on the Personal Info screen$")
    public void theUserLandsOnThePersonalInfoScreen() {
        System.out.println("Then the user lands on the Personal Info screen");
    }

    @And("^the user enters valid information in all fields$")
    public void theUserEntersValidInformationInAllFields() {
        System.out.println("And the user enters valid information in all fields");
    }

    @And("^the user clicks on the Sign me up checkbox$")
    public void theUserClicksOnTheSignMeUpCheckbox() {
        System.out.println("And the user clicks on the Sign me up checkbox");
    }
}
