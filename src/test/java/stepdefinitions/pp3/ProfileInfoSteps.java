package stepdefinitions.pp3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.pp3.EmailPage;
import pages.pp3.ProfileInfoPage;

import static pages.Page.instanceOf;

public class ProfileInfoSteps {
    @Given("^the user is on the Profile Info screen with email: \"([^\"]*)\"$")
    public void theUserIsOnTheProfileInfoScreenWithEmail(String emailAddress) {
        System.out.println("Given the user is on the Profile screen with email: " + emailAddress);
        // Launch browser and navigate to the PP3's Profile Info screen
        instanceOf(EmailPage.class).navigateToBaseUrl();
        instanceOf(EmailPage.class).browserFullScreen();
        instanceOf(EmailPage.class).switchToFrame();
        instanceOf(EmailPage.class).enterEmail(emailAddress);
        instanceOf(EmailPage.class).clickOnContinueBtn();
    }

    @And("^the email address shown is not his$")
    public void theEmailAddressShownIsNotHis() {
        System.out.println("And the email address shown is not his");
        //TODO: Assert using a different email address
    }

    @Then("^the user should see the hidden address fields$")
    public void theUserShouldSeeTheHiddenAddressFields() {
        System.out.println("Then the user should see the hidden address fields");
        instanceOf(ProfileInfoPage.class).verifyProfileInfoScreenWithHiddenFields();
    }

    @When("^the user enters an invalid first name: \"([^\"]*)\"$")
    public void theUserEntersAnInvalidFirstName(String firstName) {
        System.out.println("When the user enters an invalid first name: " + firstName);
        instanceOf(ProfileInfoPage.class).enterFirstName(firstName);
    }

    @Then("^the user should see the validation message: \"([^\"]*)\"$")
    public void theUserShouldSeeTheValidationMessage(String validationMsg) {
        System.out.println("Then the user should see the validation message: " + validationMsg);
    }

    @When("^the user enters an invalid last name: \"([^\"]*)\"$")
    public void theUserEntersAnInvalidLastName(String lastName) {
        System.out.println("When the user enters an invalid last name: " + lastName);
        instanceOf(ProfileInfoPage.class).enterLastName(lastName);
    }

    @When("^the user enters an invalid mobile number: \"([^\"]*)\"$")
    public void theUserEntersAnInvalidMobileNumber(String mobileNumber) {
        System.out.println("When the user enters an invalid mobile number: " + mobileNumber);
        instanceOf(ProfileInfoPage.class).enterMobileNumber(mobileNumber);
    }

    @When("^the user enters an invalid zip code: \"([^\"]*)\"$")
    public void theUserEntersAnInvalidZipCode(String zipCode) {
        System.out.println("When the user enters an invalid zip code: " + zipCode);
        instanceOf(ProfileInfoPage.class).enterZipCode(zipCode);
    }

    @When("^the user starts entering a valid address$")
    public void theUserStartsEnteringAValidAddress() {
        System.out.println("When the user starts entering a valid address");
        //TODO: instanceOf(ProfileInfoPage.class).enterAddress();
    }

    @Then("^the user should see address suggestions$")
    public void theUserShouldSeeAddressSuggestions() {
        System.out.println("Then the user should see address suggestions");
        //TODO:
    }

    @And("^the user can select the address from the suggestions$")
    public void theUserCanSelectTheAddressFromTheSuggestions() {
        System.out.println("And the user can select the address from the suggestions");
        //TODO:
    }

    @When("^the user starts entering an invalid address$")
    public void theUserStartsEnteringAnInvalidAddress() {
        System.out.println("When the user starts entering an invalid address");
        //TODO: instanceOf(ProfileInfoPage.class).enterAddress();
    }

    @Then("^the user should not see address suggestions$")
    public void theUserShouldNotSeeAddressSuggestions() {
        System.out.println("Then the user should not see address suggestions");
        //TODO:
    }

    @And("^the user cannot select the address from the suggestions$")
    public void theUserCannotSelectTheAddressFromTheSuggestions() {
        System.out.println("And the user cannot select the address from the suggestions");
        //TODO:
    }

    @When("^the user selects the address from the suggestions$")
    public void theUserSelectsTheAddressFromTheSuggestions() {
        System.out.println("When the user selects the address from the suggestions");
        //TODO:
    }

    @Then("^the user lands on the Personal Info screen$")
    public void theUserLandsOnThePersonalInfoScreen() {
        System.out.println("Then the user lands on the Personal Info screen");
    }

    @And("^the user enters valid information in all fields$")
    public void theUserEntersValidInformationInAllFields() {
        System.out.println("And the user enters valid information in all fields");
        //TODO:
    }

    @And("^the user clicks on the Sign me up checkbox$")
    public void theUserClicksOnTheSignMeUpCheckbox() {
        System.out.println("And the user clicks on the Sign me up checkbox");
        //TODO:
    }
}
