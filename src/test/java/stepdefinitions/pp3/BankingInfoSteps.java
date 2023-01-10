package stepdefinitions.pp3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Page;
import pages.pp3.*;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class BankingInfoSteps extends Page {

    @Given("^the user is on the Banking Info screen with email: \"([^\"]*)\"$")
    public void theUserIsOnTheBankingInfoScreenWithEmail(String emailAddress) throws ExecutionException, InterruptedException, IOException {
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
        instanceOf(ProfileInfoPage.class).enterFirstName("BankingInfo");
        instanceOf(ProfileInfoPage.class).enterLastName("User");
        instanceOf(ProfileInfoPage.class).enterMobileNumber("18553539289");
        instanceOf(ProfileInfoPage.class).clickOnEnterAddressManuallyLnk();

        if(emailAddress.contains("deny")) {
            instanceOf(ProfileInfoPage.class).enterAddress("ABC 123 XYZ");
            instanceOf(ProfileInfoPage.class).enterCity("PALMS");
            instanceOf(ProfileInfoPage.class).selectState("CA");
            instanceOf(ProfileInfoPage.class).enterZipCode("92274");
        } else {
            instanceOf(ProfileInfoPage.class).enterAddress("901 Yamato Rd");
            instanceOf(ProfileInfoPage.class).enterUnitNumber("260");
            instanceOf(ProfileInfoPage.class).enterCity("Boca Raton");
            instanceOf(ProfileInfoPage.class).selectState("FL");
            instanceOf(ProfileInfoPage.class).enterZipCode("33431");
        }

        instanceOf(EmailPage.class).clickOnContinueBtn();

        // Enters required information in Personal Information
        // TODO: Read data from JSON files
        instanceOf(PersonalInfoPage.class).verifyPersonalInfoScreen();

        if(emailAddress.contains("deny")) {
            instanceOf(PersonalInfoPage.class).enterDOB("01011965");
            instanceOf(PersonalInfoPage.class).enterSSN("527684727");
            instanceOf(PersonalInfoPage.class).enterIncome("1500");
            instanceOf(PersonalInfoPage.class).selectPayFrequency("Bi-Weekly");
        } else {
            instanceOf(PersonalInfoPage.class).enterDOB("11031956");
            instanceOf(PersonalInfoPage.class).enterSSN("478724725");
            instanceOf(PersonalInfoPage.class).enterIncome("5000");
            instanceOf(PersonalInfoPage.class).selectPayFrequency("Weekly");
        }

        instanceOf(PersonalInfoPage.class).selectAgreementCheckBox();
        instanceOf(EmailPage.class).clickOnContinueBtn();

        // Verify user landed on the PP3's Banking Info screen
        instanceOf(BankingInfoPage.class).verifyBankingInfoPage();
    }

    @And("^the user enters a valid routing number: \"([^\"]*)\"$")
    public void theUserEntersAValidRoutingNumber(String routingNumber) {
        System.out.println("And the user enters a valid routing number: " + routingNumber);
        instanceOf(BankingInfoPage.class).enterRoutingNumber(routingNumber);
    }

    @And("^the user enters a valid account number: \"([^\"]*)\"$")
    public void theUserEntersAValidAccountNumber(String accountNumber) {
        System.out.println("And the user enters a valid routing number: " + accountNumber);
        instanceOf(BankingInfoPage.class).enterAccountNumber(accountNumber);
    }

    @And("^the user enters a matching account number: \"([^\"]*)\"$")
    public void theUserEntersAMatchingAccountNumber(String accountNumber) {
        System.out.println("And the user enters a matching account number: " + accountNumber);
        instanceOf(BankingInfoPage.class).confirmAccountNumber(accountNumber);
    }

    @Then("^the user sees the name of the bank: \"([^\"]*)\"$")
    public void theUserSeesTheNameOfTheBank(String bankName) {
        System.out.println("Then the user sees the name of the bank: " + bankName);
        instanceOf(BankingInfoPage.class).bankNameMsg(bankName);
    }

    @When("^the user enters an invalid routing number: \"([^\"]*)\"$")
    public void theUserEntersAnInvalidRoutingNumber(String routingNumber) {
        System.out.println("When the user enters an invalid routing number: " + routingNumber);
        instanceOf(BankingInfoPage.class).enterRoutingNumber(routingNumber);
    }

    @When("^the user enters an invalid account number: \"([^\"]*)\"$")
    public void theUserEntersAnInvalidAccountNumber(String accountNumber) {
        System.out.println("When the user enters an invalid account number: " + accountNumber);
        instanceOf(BankingInfoPage.class).enterAccountNumber(accountNumber);
    }

    @And("^the user enters a non matching account number: \"([^\"]*)\"$")
    public void theUserEntersANonMatchingAccountNumber(String confirmAccNumber) {
        System.out.println("When the user enters a non matching account number: " + confirmAccNumber);
        instanceOf(BankingInfoPage.class).confirmAccountNumber(confirmAccNumber);
    }

    @Then("^the user should not see the validation message: \"([^\"]*)\"$")
    public void theUserShouldNotSeeTheValidationMessage(String validationMessage) {
        System.out.println("Then the user should not see the validation message: " + validationMessage);
        //TODO: Assert Validation message is not displayed
    }
}
