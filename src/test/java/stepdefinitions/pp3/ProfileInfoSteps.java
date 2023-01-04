package stepdefinitions.pp3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.pp3.*;
import java.util.concurrent.ExecutionException;
import static pages.Page.instanceOf;

public class ProfileInfoSteps {
    @Given("^the user is on the Profile Info screen with email: \"([^\"]*)\"$")
    public void theUserIsOnTheProfileInfoScreenWithEmail(String emailAddress) throws ExecutionException, InterruptedException {
        System.out.println("Given the user is on the Profile screen with email: " + emailAddress);

        // Launch browser and navigate to the PP3's Profile Info screen
        instanceOf(EmailPage.class).navigateToBaseUrl();
        instanceOf(EmailPage.class).browserFullScreen();
        instanceOf(EmailPage.class).switchToFrame();
        instanceOf(EmailPage.class).verifyEmailScreen();
        instanceOf(EmailPage.class).enterNewEmail(emailAddress);
        instanceOf(EmailPage.class).clickOnContinueBtn();

        // Verify user landed on the PP3's Profile Info screen
        instanceOf(ProfileInfoPage.class).verifyProfileInfoScreen();
    }

    @And("^the email address shown is not his: \"([^\"]*)\"$")
    public void theEmailAddressShownIsNotHis(String emailAddressEntered) {
        System.out.println("And the email address shown is not his:" + emailAddressEntered);
        instanceOf(ProfileInfoPage.class).verifyEmailAddressIsNotHis(emailAddressEntered);
    }

    @Then("^the user should see the hidden address fields$")
    public void theUserShouldSeeTheHiddenAddressFields() throws ExecutionException, InterruptedException {
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
        //TODO:
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

    @When("^the user enters a valid address: \"([^\"]*)\"$")
    public void theUserEntersAValidAddress(String address) {
        System.out.println("When the user enters a valid address: " + address);
        instanceOf(ProfileInfoPage.class).enterAddress(address);
    }

    @When("^the user enters an invalid address: \"([^\"]*)\"$")
    public void theUserEntersAnInvalidAddress(String address) {
        System.out.println("When the user enters an invalid address: " + address);
        instanceOf(ProfileInfoPage.class).enterAddress(address);
    }

    @Then("^the user should see address suggestions$")
    public void theUserShouldSeeAddressSuggestions() {
        System.out.println("Then the user should not see address suggestions");
        instanceOf(ProfileInfoPage.class).verifySuggestedAddressesDisplayed();
    }

    @And("^the user selects an address from the suggestions list with: \"([^\"]*)\"$")
    public void theUserSelectsAnAddressFromTheSuggestionsList(String withText) {
        System.out.println("And the user selects an address from the suggestions with: " + withText);
        instanceOf(ProfileInfoPage.class).selectFromSuggestedAddresses(withText);
    }

    @Then("^the user should not see address suggestions$")
    public void theUserShouldNotSeeAddressSuggestions() {
        System.out.println("Then the user should not see address suggestions");
        instanceOf(ProfileInfoPage.class).verifySuggestedAddressesNotDisplayed();
    }

    @And("^the user enters a valid first name: \"([^\"]*)\"$")
    public void theUserEntersAValidFirstName(String firstName) {
        System.out.println("And the user enters a valid first name: " + firstName);
        instanceOf(ProfileInfoPage.class).enterFirstName(firstName);
    }

    @And("^the user enters a valid last name: \"([^\"]*)\"$")
    public void theUserEntersAValidLastName(String lastName) {
        System.out.println("And the user enters a valid last name: " + lastName);
        instanceOf(ProfileInfoPage.class).enterLastName(lastName);
    }

    @And("^the user enters a valid mobile number: \"([^\"]*)\"$")
    public void theUserEntersAValidMobileNumber(String mobileNumber) {
        System.out.println("And the user enters a valid mobile number: " + mobileNumber);
        instanceOf(ProfileInfoPage.class).enterMobileNumber(mobileNumber);
    }

    @Then("^the user lands on the Personal Info screen$")
    public void theUserLandsOnThePersonalInfoScreen() throws ExecutionException, InterruptedException {
        System.out.println("Then the user lands on the Personal Info screen");
        instanceOf(PersonalInfoPage.class).verifyPersonalInfoScreen();
    }

    @And("^the user enters a valid unit number: \"([^\"]*)\"$")
    public void theUserEntersAValidUnitNumber(String unitNumber) {
        System.out.println("And the user enters a valid unit number: " + unitNumber);
        instanceOf(ProfileInfoPage.class).enterUnitNumber(unitNumber);
    }

    @And("^the user enters a valid city: \"([^\"]*)\"$")
    public void theUserEntersAValidCity(String city) {
        System.out.println("And the user enters a valid city: " + city);
        instanceOf(ProfileInfoPage.class).enterCity(city);
    }

    @And("^the user selects a valid state: \"([^\"]*)\"$")
    public void theUserSelectsAValidState(String state) {
        System.out.println("And the user selects a valid state: " + state);
        instanceOf(ProfileInfoPage.class).selectState(state);
    }

    @And("^the user enters a valid zip code: \"([^\"]*)\"$")
    public void theUserEntersAValidZipCode(String zipCode) {
        System.out.println("Then the user lands on the Personal Info screen");
        instanceOf(ProfileInfoPage.class).enterZipCode(zipCode);
    }

    @And("^the user clicks on the Sign me up checkbox$")
    public void theUserClicksOnTheSignMeUpCheckbox() {
        System.out.println("And the user clicks on the Sign me up checkbox");
        instanceOf(ProfileInfoPage.class).selectSignMeUpBtn();
    }
}
