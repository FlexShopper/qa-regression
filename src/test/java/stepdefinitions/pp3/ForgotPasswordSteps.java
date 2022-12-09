package stepdefinitions.pp3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Page;
import pages.pp3.*;

import java.util.concurrent.ExecutionException;


public class ForgotPasswordSteps extends Page {
    @Given("^the user is on the Forgot Password screen with email: \"([^\"]*)\"$")
    public void theUserIsOnTheForgotPasswordScreenWithEmail(String email) throws ExecutionException, InterruptedException {
        System.out.println("Given the user is on the Forgot Password screen with email: " + email);
        // Launch browser and navigate to the PP3's Forgot Password screen
        instanceOf(EmailPage.class).navigateToBaseUrl();
        instanceOf(EmailPage.class).browserFullScreen();
        instanceOf(EmailPage.class).switchToFrame();
        instanceOf(EmailPage.class).verifyHeader(45);
        instanceOf(EmailPage.class).enterEmail(email);
        instanceOf(EmailPage.class).clickOnContinueBtn();
        instanceOf(PasswordPage.class).clickOnTheForgotPasswordLnk();

        // Verify user landed on the PP3's Forgot Password screen
        instanceOf(ForgotPasswordPage.class).verifyForgotPasswordScreen();
        instanceOf(EmailPage.class).verifyFooter();
    }

    @Then("^the user should see the email: \"([^\"]*)\"$")
    public void theUserShouldSeeTheEmail(String email) {
        System.out.println("Then the user should see the email: " + email);
        instanceOf(ForgotPasswordPage.class).verifyEmailOptions(email);
    }

    @Then("^the user should see the phone number: \"([^\"]*)\"$")
    public void theUserShouldSeeThePhoneNumber(String phoneNumber) {
        System.out.println("Then the user should see the phone number: " + phoneNumber);
        instanceOf(ForgotPasswordPage.class).verifySMSOptions(phoneNumber);
    }

    @Given("^the Send Email radio button is selected$")
    public void theSendEmailRadioButtonIsSelected() {
        System.out.println("Given the Send Email radio button is selected");
        instanceOf(ForgotPasswordPage.class).verifyEmailRadioButtonIsSelected();
    }

    @Then("^the user lands on the Verification Code screen$")
    public void theUserLandsOnTheVerificationCodeScreen() throws ExecutionException, InterruptedException {
        System.out.println("Then the user lands on the Verification Code screen");
        instanceOf(VerificationCodePage.class).verifyVerificationCodeScreen();
    }

    @Given("^the Send SMS radio button is selected$")
    public void theSendSMSRadioButtonIsSelected() {
        System.out.println("Given the Send SMS radio button is selected");
        instanceOf(ForgotPasswordPage.class).verifySMSRadioButtonIsSelected();
    }

    @When("^the user enters the Verification Code in the field$")
    public void theUserEntersTheVerificationCodeInTheField() throws InterruptedException {
        System.out.println("When the user enters the Security Code in the field");
        instanceOf(VerificationCodePage.class).retrievesTheVerificationCodeFromEmail();
    }

    @Then("^the user lands on the Change Password screen$")
    public void theUserLandsOnTheChangePasswordScreen() throws InterruptedException, ExecutionException {
        System.out.println("Then the user lands on the Change Password screen");
        // Verify user landed on the PP3's Change Password screen
        instanceOf(ChangePasswordPage.class).verifyChangePasswordScreen();
        //TODO: instanceOf(EmailPage.class).verifyFooter();
    }

    @When("^the user retrieves the Verification Code from the phone$")
    public void theUserRetrievesTheVerificationCodeFromThePhone() {
        System.out.println("When the user retrieves the Verification Code from the phone");
        //TODO: RETRIEVE VERIFICATION CODE FROM THE PHONE
    }

    @Then("^the user lands on the Forgot Password screen$")
    public void theUserLandsOnTheForgotPasswordScreen() throws InterruptedException, ExecutionException {
        System.out.println("Then the user lands on the Forgot Password screen");
        // Verify user landed on the PP3's Forgot Password screen
        instanceOf(ForgotPasswordPage.class).verifyForgotPasswordScreen();
        instanceOf(EmailPage.class).verifyFooter();
    }

    @When("^the user enters the password: \"([^\"]*)\"$")
    public void theUserEntersThePassword(String password) {
        System.out.println("When the user enters the password: " + password);
        instanceOf(ChangePasswordPage.class).enterNewPassword(password);
    }

    @When("^the user enters the email: \"([^\"]*)\"$")
    public void theUserEntersTheEmail(String emailAddress) {
        System.out.println("When the user enters the email: " + emailAddress);
        //TODO: user enters the email
    }

    @When("^the user clicks on the Sign in button$")
    public void theUserClicksOnTheSignInButton() {
        System.out.println("When the user clicks on the Sign in button");
        //TODO: user clicks on the Sign in button
    }

    @Given("^the user is on the Change Password screen with email: \"([^\"]*)\"$")
    public void theUserIsOnTheChangePasswordScreenWithEmail(String emailAddress) throws InterruptedException, ExecutionException {
        System.out.println("Given the user is on the Change Password screen with email: " + emailAddress);
        // Launch browser and navigate to the PP3's Change Password screen
        instanceOf(EmailPage.class).navigateToBaseUrl();
        instanceOf(EmailPage.class).browserFullScreen();
        instanceOf(EmailPage.class).switchToFrame();
        instanceOf(EmailPage.class).verifyHeader(45);
        instanceOf(EmailPage.class).enterEmail(emailAddress);
        instanceOf(EmailPage.class).clickOnContinueBtn();
        instanceOf(PasswordPage.class).clickOnTheForgotPasswordLnk();
        instanceOf(EmailPage.class).clickOnContinueBtn();
        instanceOf(VerificationCodePage.class).retrievesTheVerificationCodeFromEmail();
        instanceOf(VerificationCodePage.class).clickOnSubmitBtn();

        // Verify user landed on the PP3's Change Password screen
        instanceOf(ChangePasswordPage.class).verifyChangePasswordScreen();
        instanceOf(EmailPage.class).verifyFooter();
    }

    @When("^the user clicks on the Change Password button$")
    public void theUserClicksOnTheChangePasswordButton() {
        System.out.println("And the user clicks on the Change Changes button");
        instanceOf(ChangePasswordPage.class).clickOnChangePasswordBtn();
    }

    @Then("^the user is able to change the password$")
    public void theUserIsAbleToChangeThePassword() {
        System.out.println("Then the user is able to change the password");
    }
}
