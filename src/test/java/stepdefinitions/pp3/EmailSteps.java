package stepdefinitions.pp3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Page;
import pages.pp3.*;
import java.util.concurrent.ExecutionException;

public class EmailSteps extends Page {
    @Given("^the user is on the Email screen$")
    public void theUserIsOnTheEmailScreen() throws ExecutionException, InterruptedException {
        System.out.println("Given the user is on the Email screen");
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
        System.out.println("Then the user should see the email: " + email);
        instanceOf(EmailPage.class).enterEmail(email);
    }

    @And("^the user clicks on the button: \"([^\"]*)\"$")
    public void theUserClicksOnTheButton(String button) {
        System.out.println("And the user clicks on the button: " + button);
        switch (button) {
            case "Continue":
            case "Submit Application":
                instanceOf(EmailPage.class).clickOnContinueBtn();
                break;
            case "Sign In":
                instanceOf(PasswordPage.class).clickOnTheSignInBtn();
                break;
            case "Submit":
                instanceOf(VerificationCodePage.class).clickOnSubmitBtn();
                break;
            case "Change Password":
                instanceOf(ChangePasswordPage.class).clickOnChangePasswordBtn();
                break;
            default:
                System.out.println("Button " + button + "was not found!");
        }
    }

    @Then("^the user lands on the Password screen$")
    public void theUserLandsOnThePasswordScreen() throws ExecutionException, InterruptedException {
        System.out.println("Then the user lands on the Password screen");
        instanceOf(EmailPage.class).verifyHeader();
        instanceOf(PasswordPage.class).verifyPasswordScreen();
        instanceOf(EmailPage.class).verifyFooter();
    }

    @When("^the user enters a valid no-registered email address: \"([^\"]*)\"$")
    public void theUserEntersAValidNoRegisteredEmailAddress(String email) {
        System.out.println("When the user enters a valid no-registered email address: " + email);
        instanceOf(EmailPage.class).enterEmail(email);
    }

    @Then("^the user lands on the Profile Info screen$")
    public void theUserLandsOnTheProfileInfoScreen() throws ExecutionException, InterruptedException {
        System.out.println("Then the user lands on the Profile Info screen");
        instanceOf(EmailPage.class).verifyHeader();
        instanceOf(ProfileInfoPage.class).verifyProfileInfoScreen();
        instanceOf(EmailPage.class).verifyFooter();
    }

    @When("^the user enters an invalid email address: \"([^\"]*)\"$")
    public void theUserEntersAnInvalidEmailAddress(String email) {
        System.out.println("When the user enters an invalid email address: " + email);
        instanceOf(EmailPage.class).enterEmail(email);
    }

    @Then("^the user sees the following validation message: \"([^\"]*)\"$")
    public void theUserSeesTheFollowingValidationMessage(String validationMsg) {
        System.out.println("Then the user should see the email: " + validationMsg);
        instanceOf(EmailPage.class).emailValidationMessage(validationMsg);
    }

    @Then("^the user sees the following HTML validation message: \"([^\"]*)\"$")
    public void theUserSeesTheFollowingHTMLValidationMessage(String validationMsg) {
        System.out.println("Then the user sees the following HTML validation message: " + validationMsg);
    }
}
