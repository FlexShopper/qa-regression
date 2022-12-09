package stepdefinitions.pp3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.pp3.BankingInfoPage;
import pages.pp3.DecisionPage;
import pages.pp3.EmailPage;
import pages.pp3.PersonalInfoPage;
import java.util.concurrent.ExecutionException;
import static pages.Page.instanceOf;

public class DecisionSteps {

    @Then("^the user lands on the Decision Screen with decision: \"([^\"]*)\"$")
    public void theUserLandsOnTheDecisionScreenWithDecision(String decision) throws ExecutionException, InterruptedException {
        System.out.println("Then the user lands on the Decision Screen with decision: " + decision);
        instanceOf(DecisionPage.class).verifyDecisionScreen();
        instanceOf(DecisionPage.class).verifyDecision();
    }

    @And("^the user completes the Personal Info screen with pay frequency: \"([^\"]*)\"$")
    public void theUserCompletesThePersonalInfoScreenWithPayFrequency(String payFrequency) {
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
}
