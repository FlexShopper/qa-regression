package stepdefinitions.pp3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.pp3.BankingInfoPage;
import pages.pp3.EmailPage;
import pages.pp3.PersonalInfoPage;
import pages.pp3.ProfileInfoPage;

import static pages.Page.instanceOf;

public class BankingInfoSteps {
    @Given("^the user is on the Banking Info screen with email: \"([^\"]*)\"$")
    public void theUserIsOnTheBankingInfoScreenWithEmail(String emailAddress) throws InterruptedException {
        System.out.println("Given the user is in the Personal Info screen with email: " + emailAddress);
        // Launch browser and navigate to the PP3's Personal Info screen
        instanceOf(EmailPage.class).navigateToBaseUrl();
        instanceOf(EmailPage.class).browserFullScreen();
        instanceOf(EmailPage.class).switchToFrame();
        instanceOf(EmailPage.class).enterNewEmail(emailAddress);
        instanceOf(EmailPage.class).clickOnContinueBtn();

        // Enters required information in Profile Information
        // TODO: Read data from JSON files
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

        // Enters required information in Personal Information
        // TODO: Read data from JSON files
        instanceOf(PersonalInfoPage.class).enterDOB("01011970");
        instanceOf(PersonalInfoPage.class).enterSSN("362563215");
        instanceOf(PersonalInfoPage.class).enterIncome("5000");
        instanceOf(PersonalInfoPage.class).selectPayFrequency("Weekly");
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

    @Then("^the user lands on the Decision Screen with decision: \"([^\"]*)\"$")
    public void theUserLandsOnTheDecisionScreenWithDecision(String decision) {
        System.out.println("Then the user lands on the Decision Screen with decision: " + decision);
        //TODO:
    }
}
