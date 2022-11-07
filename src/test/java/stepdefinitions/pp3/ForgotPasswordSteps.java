package stepdefinitions.pp3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Page;
import pages.pp3.*;

public class ForgotPasswordSteps extends Page {
    @Given("^the user is on the Forgot Password screen with email: \"([^\"]*)\"$")
    public void theUserIsOnTheForgotPasswordScreenWithEmail(String email) {
        System.out.println("Given the user is on the Forgot Password screen with email: " + email);
        // Launch browser and navigate to the PP3's Forgot Password screen
        instanceOf(EmailPage.class).navigateToBaseUrl();
        instanceOf(EmailPage.class).browserFullScreen();
        instanceOf(EmailPage.class).switchToFrame();
        instanceOf(EmailPage.class).enterEmail(email);
        instanceOf(EmailPage.class).clickOnContinueBtn();
        instanceOf(PasswordPage.class).clickOnTheForgotPasswordLnk();

        // Verify user landed on the PP3's Forgot Password screen
        instanceOf(EmailPage.class).verifyHeader();
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

    @Then("^the user should not see the phone number: \"([^\"]*)\"$")
    public void theUserShouldNotSeeThePhoneNumber(String phoneNumber) {
        System.out.println("Then the user should not see the phone number: " + phoneNumber);
        instanceOf(ForgotPasswordPage.class).verifySMSOptionsNotShown(phoneNumber);
    }

    @When("^the user clicks on the link: \"([^\"]*)\"$")
    public void theUserClicksOnTheLink(String returnToPasswordLink) {
        System.out.println("When the user clicks on the link: " + returnToPasswordLink);
        instanceOf(ForgotPasswordPage.class).clickOnReturnToPasswordLink();
    }

    @Given("^the Send Email radio button is selected$")
    public void theSendEmailRadioButtonIsSelected() {
        System.out.println("Given the Send Email radio button is selected");
        instanceOf(ForgotPasswordPage.class).verifyEmailRadioButtonIsSelected();
    }

    @Then("^the user lands on the Verification Code screen$")
    public void theUserLandsOnTheVerificationCodeScreen() {
        System.out.println("Then the user lands on the Verification Code screen");
        instanceOf(VerificationCodePage.class).verifyVerificationCodeScreen();
    }

    @Then("^the user should see the field: \"([^\"]*)\"$")
    public void theUserShouldSeeTheField(String fieldName) {
        System.out.println("Then the user should see the field: " + fieldName);
        //TODO: ASSERT THE SECURITY CODE IS FOUND
    }

    @Given("^the Send SMS radio button is selected$")
    public void theSendSMSRadioButtonIsSelected() {
        System.out.println("Given the Send SMS radio button is selected");
        instanceOf(ForgotPasswordPage.class).verifySMSRadioButtonIsSelected();
    }

    @When("^the user enters the Verification Code in the field$")
    public void theUserEntersTheVerificationCodeInTheField() {
        System.out.println("When the user enters the Security Code in the field");
        instanceOf(VerificationCodePage.class).retrievesTheVerificationCodeFromEmail();
    }

    @When("^the user clicks on the Submit button$")
    public void theUserClicksOnTheSubmitButton() {
        System.out.println("When the user clicks on the Submit button");
        instanceOf(VerificationCodePage.class).clickOnSubmitBtn();
    }

    @Then("^the user lands on the Change Password screen$")
    public void theUserLandsOnTheChangePasswordScreen() {
        System.out.println("Then the user lands on the Change Password screen");
        instanceOf(ChangePasswordPage.class).verifyChangePasswordScreen();
    }

    @When("^the user retrieves the Verification Code from the phone$")
    public void theUserRetrievesTheVerificationCodeFromThePhone() {
        //TODO: RETRIEVE VERIFICATION CODE FROM THE PHONE
    }

    @When("^the user clicks on the button: \"([^\"]*)\"$")
    public void theUserClicksOnTheButton(String noCodeReceivedBtn) {
        instanceOf(VerificationCodePage.class).clickOnNoCodeReceivedLnk();
    }

    @Then("^the user lands on the Forgot Password screen$")
    public void theUserLandsOnTheForgotPasswordScreen() {
        // Verify user landed on the PP3's Forgot Password screen
        instanceOf(EmailPage.class).verifyHeader();
        instanceOf(ForgotPasswordPage.class).verifyForgotPasswordScreen();
        instanceOf(EmailPage.class).verifyFooter();
    }

    @Given("^the user is on the Change Password Screen$")
    public void theUserIsOnTheChangePasswordScreen() {
        // Verify user landed on the PP3's Change Password screen
        instanceOf(EmailPage.class).verifyHeader();
        instanceOf(ChangePasswordPage.class).verifyChangePasswordScreen();
        instanceOf(EmailPage.class).verifyFooter();
    }

    @When("^the user enters the password: \"([^\"]*)\"$")
    public void theUserEntersThePassword(String password) {
        //TODO: Enter new password
    }

    @When("^the user is on the Email screen$")
    public void theUserIsOnTheEmailScreen() {
        // Verify user landed on the PP3's Email screen
        instanceOf(EmailPage.class).verifyHeader();
        instanceOf(EmailPage.class).verifyEmailScreen();
        instanceOf(EmailPage.class).verifyFooter();
    }

    @When("^the user enters the email: \"([^\"]*)\"$")
    public void theUserEntersTheEmail(String email) {
        //TODO: user enters the email
    }

    @When("^the user clicks on the Sign in button$")
    public void theUserClicksOnTheSignInButton() {
        //TODO: user clicks on the Sign in button
    }

    @Given("^the user is on the Change Password Screen with email: \"([^\"]*)\"$")
    public void theUserIsOnTheChangePasswordScreenWithEmail(String string) {
        //TODO: Verify the user is on the Change Password Screen
    }

    @When("^the user clicks on the Save Changes button$")
    public void theUserClicksOnTheSaveChangesButton() {
        //TODO: user clicks on the Save Changes button
    }
}
