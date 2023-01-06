package stepdefinitions.pp3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Page;
import pages.pp3.*;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class DecisionSteps extends Page {

    @Then("^the user lands on the Decision Screen with decision: \"([^\"]*)\"$")
    public void theUserLandsOnTheDecisionScreenWithDecision(String decision) throws ExecutionException, InterruptedException {
        System.out.println("Then the user lands on the Decision Screen with decision: " + decision);
        instanceOf(DecisionPage.class).verifyDecisionScreen(decision);
        instanceOf(DecisionPage.class).verifyDecision(decision);
    }

    @And("^the user completes the Personal Info screen with pay frequency: \"([^\"]*)\"$")
    public void theUserCompletesThePersonalInfoScreenWithPayFrequency(String payFrequency) throws IOException {
        System.out.println("And the user completes the Personal Info screen with pay frequency: " + payFrequency);
        // Enters required information in Personal Information
        // TODO: Read data from JSON files
        instanceOf(PersonalInfoPage.class).enterDOB("01011970");
        instanceOf(PersonalInfoPage.class).enterSSN("362563215");
        instanceOf(PersonalInfoPage.class).enterIncome("5000");
        instanceOf(PersonalInfoPage.class).selectPayFrequency(payFrequency);
        instanceOf(PersonalInfoPage.class).selectAgreementCheckBox();
        instanceOf(EmailPage.class).clickOnContinueBtn();
    }

    @And("^the user completes the Banking Info screen$")
    public void theUserCompletesTheBankingInfoScreen() {
        System.out.println("And the user completes the Banking Info screen");
        // Complete Banking Info and submit the application
        instanceOf(BankingInfoPage.class).enterRoutingNumber("325070760");
        instanceOf(BankingInfoPage.class).enterAccountNumber("3333333333");
        instanceOf(BankingInfoPage.class).confirmAccountNumber("3333333333");
        instanceOf(EmailPage.class).clickOnContinueBtn();
    }

    @Given("^the user is on the Decision screen with email: \"([^\"]*)\"$")
    public void theUserIsOnTheDecisionScreenWithEmail(String emailAddress) throws ExecutionException, InterruptedException, IOException {
        System.out.println("Given the user is in the Decision screen with email: " + emailAddress);
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
        instanceOf(ProfileInfoPage.class).enterFirstName("Decision");
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

        // Complete Banking Info and submit the application
        instanceOf(BankingInfoPage.class).enterRoutingNumber("325070760");
        instanceOf(BankingInfoPage.class).enterAccountNumber("3333333333");
        instanceOf(BankingInfoPage.class).confirmAccountNumber("3333333333");
        instanceOf(EmailPage.class).clickOnContinueBtn();
    }

    @And("^the user application decision is: \"([^\"]*)\"$")
    public void theUserApplicationDecisionIs(String decision) throws ExecutionException, InterruptedException {
        System.out.println("And the user application decision is: " + decision);
        instanceOf(DecisionPage.class).verifyDecisionScreen(decision);
        instanceOf(DecisionPage.class).verifyDecision(decision);
    }
}
