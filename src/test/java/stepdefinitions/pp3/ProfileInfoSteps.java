package stepdefinitions.pp3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.pp3.EmailPage;
import pages.pp3.PersonalInfoPage;
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

    @And("^the email address shown is not his: \"([^\"]*)\"$")
    public void theEmailAddressShownIsNotHis(String emailAddressEntered) {
        System.out.println("And the email address shown is not his:" + emailAddressEntered);
        instanceOf(ProfileInfoPage.class).verifyEmailAddressIsNotHis(emailAddressEntered);
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
    public void theUserEntersAnInvalidZipCode(String zipCode) throws InterruptedException {
        System.out.println("When the user enters an invalid zip code: " + zipCode);
        instanceOf(ProfileInfoPage.class).enterZipCode(zipCode);
    }

    @When("^the user starts entering an address: \"([^\"]*)\"$")
    public void theUserStartsEnteringAnAddress(String partialAddress) {
        System.out.println("When the user starts entering a valid address: " + partialAddress);
        instanceOf(ProfileInfoPage.class).enterAddress(partialAddress);
    }

    @Then("^the user should see address suggestions$")
    public void theUserShouldSeeAddressSuggestions() {
        System.out.println("Then the user should not see address suggestions");
        instanceOf(ProfileInfoPage.class).verifySuggestedAddressesDisplayed();
    }

    @And("^the user can select the address from the suggestions list with: \"([^\"]*)\"$")
    public void theUserCanSelectTheAddressFromTheSuggestionsList(String withText) {
        System.out.println("And the user can select the address from the suggestions with: " + withText);
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
    public void theUserLandsOnThePersonalInfoScreen() {
        System.out.println("Then the user lands on the Personal Info screen");
        instanceOf(PersonalInfoPage.class).verifyPersonalInfoPage();
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
        System.out.println("Then the user lands on the Personal Info screen");
        instanceOf(ProfileInfoPage.class).selectState(state);
    }

    @And("^the user enters a valid zip code: \"([^\"]*)\"$")
    public void theUserEntersAValidZipCode(String zipCode) throws InterruptedException {
        System.out.println("Then the user lands on the Personal Info screen");
        instanceOf(ProfileInfoPage.class).enterZipCode(zipCode);
    }

    @And("^the user clicks on the Sign me up checkbox$")
    public void theUserClicksOnTheSignMeUpCheckbox() {
        System.out.println("And the user clicks on the Sign me up checkbox");
        instanceOf(ProfileInfoPage.class).selectSignMeUpBtn();
    }
}
