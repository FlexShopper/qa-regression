package stepdefinitions.pp3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.pp3.BankingInfoPage;
import pages.pp3.EmailPage;
import pages.pp3.PersonalInfoPage;
import pages.pp3.ProfileInfoPage;

import java.util.concurrent.ExecutionException;

import static pages.Page.instanceOf;

public class PersonalInfoSteps {
    @Given("^the user is on the Personal Info screen with email: \"([^\"]*)\"$")
    public void theUserIsOnThePersonalInfoScreenWithEmail(String emailAddress) throws ExecutionException, InterruptedException {
        System.out.println("Given the user is in the Personal Info screen with email: " + emailAddress);
        // Launch browser and navigate to the PP3's Personal Info screen
        instanceOf(EmailPage.class).navigateToBaseUrl();
        instanceOf(EmailPage.class).browserFullScreen();
        instanceOf(EmailPage.class).switchToFrame();
        instanceOf(EmailPage.class).verifyEmailScreen();
        instanceOf(EmailPage.class).enterNewEmail(emailAddress);
        instanceOf(EmailPage.class).clickOnContinueBtn();

        // Enters required information in Profile Information
        // TODO: Read data from JSON files
        instanceOf(ProfileInfoPage.class).verifyProfileInfoScreen();
        instanceOf(ProfileInfoPage.class).enterFirstName("PersonalInfo");
        instanceOf(ProfileInfoPage.class).enterLastName("User");
        instanceOf(ProfileInfoPage.class).enterMobileNumber("18553539289");
        instanceOf(ProfileInfoPage.class).clickOnEnterAddressManuallyLnk();
        instanceOf(ProfileInfoPage.class).enterAddress("901 Yamato Rd");
        instanceOf(ProfileInfoPage.class).enterUnitNumber("260");
        instanceOf(ProfileInfoPage.class).enterCity("Boca Raton");
        instanceOf(ProfileInfoPage.class).selectState("FL");
        instanceOf(ProfileInfoPage.class).enterZipCode("33431");
        instanceOf(EmailPage.class).clickOnContinueBtn();

        // Verify user landed on the PP3's Personal Info screen
        instanceOf(PersonalInfoPage.class).verifyPersonalInfoScreen();

    }

    @When("^the user enters an invalid DOB: \"([^\"]*)\"$")
    public void theUserEntersAnInvalidDOB(String DOB) {
        System.out.println("When the user enters an invalid DOB: " + DOB);
        instanceOf(PersonalInfoPage.class).enterDOB(DOB);
    }

    @When("^the user enters an invalid SSN: \"([^\"]*)\"$")
    public void theUserEntersAnInvalidSSN(String SSN) {
        System.out.println("When the user enters an invalid SSN: " + SSN);
        instanceOf(PersonalInfoPage.class).enterSSN(SSN);
    }

    @And("^the user enters a valid date of birth: \"([^\"]*)\"$")
    public void theUserEntersAValidDateOfBirth(String DOB) {
        System.out.println("And the user enters a valid date of birth: " + DOB);
        instanceOf(PersonalInfoPage.class).enterDOB(DOB);
    }

    @And("^the user enters a valid SSN: \"([^\"]*)\"$")
    public void theUserEntersAValidSSN(String SSN) {
        System.out.println("And the user enters a valid SSN: " + SSN);
        instanceOf(PersonalInfoPage.class).enterSSN(SSN);
    }

    @And("^the user enters a valid gross income: \"([^\"]*)\"$")
    public void theUserEntersAValidGrossIncome(String grossIncome) {
        System.out.println("And the user enters a valid gross income: " + grossIncome);
        instanceOf(PersonalInfoPage.class).enterIncome(grossIncome);
    }

    @And("^the user selects a valid pay frequency: \"([^\"]*)\"$")
    public void theUserSelectsAValidPayFrequency(String payFrequency) {
        System.out.println("And the user selects a valid pay frequency: " + payFrequency);
        instanceOf(PersonalInfoPage.class).selectPayFrequency(payFrequency);
    }

    @When("^the user clicks on the agreement button")
    public void theUserClicksOnTheAgreementButton() {
        System.out.println("When the user clicks on the agreement button");
        instanceOf(PersonalInfoPage.class).selectAgreementCheckBox();
    }

    @Then("^the user lands on the Banking Info Screen")
    public void theUserLandsOnTheBankingInfoScreen() throws ExecutionException, InterruptedException {
        System.out.println("Then the user lands on the Banking Info Screen");
        instanceOf(BankingInfoPage.class).verifyBankingInfoPage();
    }
}
