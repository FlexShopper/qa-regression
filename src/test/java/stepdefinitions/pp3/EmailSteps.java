package stepdefinitions.pp3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.pp3.EmailPage;
import pages.Page;
import pages.pp3.PasswordPage;
import pages.pp3.ProfileInfoPage;

public class EmailSteps extends Page {
    @Given("^the user is in the Email screen$")
    public void theUserIsInTheEmailScreen() throws InterruptedException {
        // Launch browser and navigate to the PP3's Email screen
        instanceOf(EmailPage.class).navigateToBaseUrl();
        instanceOf(EmailPage.class).browserFullScreen();
        instanceOf(EmailPage.class).switchToFrame();

        // Verify user landed on the PP3's Email screen
        instanceOf(EmailPage.class).verifyHeader();
        instanceOf(EmailPage.class).verifyEmailScreen();
        instanceOf(EmailPage.class).verifyFooter();
    }

    @When("^the user enters a valid existing email address: \"([^\"]*)\"$")
    public void theUserEntersAValidExistingEmailAddress(String email) {
        instanceOf(EmailPage.class).enterEmail(email);
    }

    @And("the user clicks on the Continue button")
    public void theUserClicksOnTheContinueButton() {
        instanceOf(EmailPage.class).clickOnContinueBtn();
    }

    @Then("the user lands on the Password screen")
    public void theUserLandsOnThePasswordScreen() throws InterruptedException {
        instanceOf(EmailPage.class).verifyHeader();
        instanceOf(PasswordPage.class).verifyPasswordScreen();
        instanceOf(EmailPage.class).verifyFooter();
    }

    @When("^the user enters a valid no-registered email address: \"([^\"]*)\"$")
    public void theUserEntersAValidNoRegisteredEmailAddress(String email) {
        instanceOf(EmailPage.class).enterEmail(email);
    }

    @Then("the user lands on the Profile Info screen")
    public void theUserLandsOnTheProfileInfoScreen() throws InterruptedException {
        instanceOf(EmailPage.class).verifyHeader();
        instanceOf(ProfileInfoPage.class).verifyProfileInfoScreen();
        instanceOf(EmailPage.class).verifyFooter();
    }

    @When("^the user enters an invalid email address: \"([^\"]*)\"$")
    public void theUserEntersAnInvalidEmailAddress(String email) {
        instanceOf(EmailPage.class).enterEmail(email);
    }

    @Then("^the user sees the following validation message: \"([^\"]*)\"$")
    public void theUserSeesTheFollowingValidationMessage(String validationMsg) {
        instanceOf(EmailPage.class).emailValidationMessage(validationMsg);
    }
}
