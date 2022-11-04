package stepdefinitions.pp3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Page;
import pages.pp3.EmailPage;
import pages.pp3.ForgotPasswordPage;
import pages.pp3.PasswordPage;
import pages.pp3.VerificationCodePage;

public class ForgotPasswordSteps extends Page {
    @Given("^the user is on the Forgot Password screen with email: \"([^\"]*)\"$")
    public void theUserIsOnTheForgotPasswordScreenWithEmail(String email) {
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
    public void theUserShouldSeeTheEmail(String emailAddress) {
        instanceOf(ForgotPasswordPage.class).verifyEmailOptions(emailAddress);
    }

    @Then("^the user should see the phone number: \"([^\"]*)\"$")
    public void theUserShouldSeeThePhoneNumber(String phoneNumber) {
        instanceOf(ForgotPasswordPage.class).verifySMSOptions(phoneNumber);
    }

    @Then("^the user should not see the phone number: \"([^\"]*)\"$")
    public void theUserShouldNotSeeThePhoneNumber(String phoneNumber) {
        instanceOf(ForgotPasswordPage.class).verifySMSOptionsNotShown(phoneNumber);
    }

    @When("the user clicks on the link: Return to Password Sign In")
    public void theUserClicksOnTheLinkReturnToPasswordSignIn() {
        instanceOf(ForgotPasswordPage.class).clickOnReturnToPasswordLink();
    }

    @Given("^the Send Email radio button is selected$")
    public void theSendEmailRadioButtonIsSelected() {
        instanceOf(ForgotPasswordPage.class).verifyEmailRadioButtonIsSelected();
    }

    @Then("^the user lands on the Verification Code screen$")
    public void theUserLandsOnTheVerificationCodeScreen() {
        instanceOf(VerificationCodePage.class).verifyVerificationCodeScreen();
    }

    @Then("^the user should see the field: \"([^\"]*)\"$")
    public void theUserShouldSeeTheField(String fieldName) {
        //TODO: ASSERT THE SECURITY CODE IS FOUND
    }

    @When("the user clicks on the link: No code received")
    public void theUserClicksOnTheLinkNoCodeReceived() {
        instanceOf(VerificationCodePage.class).clickOnNoCodeReceivedLnk();
    }

    @Given("^the Send SMS radio button is selected$")
    public void theSendSMSRadioButtonIsSelected() {
        instanceOf(ForgotPasswordPage.class).verifySMSRadioButtonIsSelected();
    }

    @When("^the user retrieves the verification code from the email$")
    public void theUserRetrievesTheVerificationCodeFromTheEmail() {
        //TODO: RETRIEVE VERIFICATION CODE FROM THE EMAIL
    }

    @When("^the user enters the Security Code in the field$")
    public void theUserEntersTheSecurityCodeInTheField() {
        //TODO: ENTER VERIFICATION CODE IN THE SECURITY CODE FIELD
    }

    @When("^the user clicks on the Submit button$")
    public void theUserClicksOnTheSubmitButton() {
        instanceOf(VerificationCodePage.class).clickOnSubmitBtn();
    }

    @Then("^the user lands on the Change Password screen$")
    public void theUserLandsOnTheChangePasswordScreen() {
        //TODO: VERIFY USER LANDED ON THE CHANGE PASSWORD SCREEN
    }

    @Given("^the user is on the Verification Code screen$")
    public void theUserIsOnTheVerificationCodeScreen(String email) {
        // Launch browser and navigate to the PP3's Verification Code screen
        instanceOf(EmailPage.class).navigateToBaseUrl();
        instanceOf(EmailPage.class).browserFullScreen();
        instanceOf(EmailPage.class).switchToFrame();
        instanceOf(EmailPage.class).enterEmail(email);
        instanceOf(EmailPage.class).clickOnContinueBtn();
        instanceOf(PasswordPage.class).clickOnTheForgotPasswordLnk();
        instanceOf(EmailPage.class).clickOnContinueBtn();

        // Verify user landed on the PP3's Verification Code screen
        instanceOf(VerificationCodePage.class).verifyVerificationCodeScreen();
    }

    @When("^the user retrieves the verification code from the phone$")
    public void theUserRetrievesTheVerificationCodeFromThePhone() {
        //TODO: RETRIEVE VERIFICATION CODE FROM THE PHONE
    }

    @Given("^the user is on the Verification Code screen with email: \"([^\"]*)\"$")
    public void theUserIsOnThVerificationCodeScreenWithEmail(String email) throws InterruptedException {
        // Launch browser and navigate to the PP3's Verification Code screen
        instanceOf(EmailPage.class).navigateToBaseUrl();
        instanceOf(EmailPage.class).browserFullScreen();
        instanceOf(EmailPage.class).switchToFrame();
        instanceOf(EmailPage.class).enterEmail(email);
        instanceOf(EmailPage.class).clickOnContinueBtn();
        instanceOf(PasswordPage.class).clickOnTheForgotPasswordLnk();
        instanceOf(EmailPage.class).clickOnContinueBtn();

        // Verify user landed on the PP3's Verification Code screen
        instanceOf(VerificationCodePage.class).verifyVerificationCodeScreen();
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
        //TODO: Verify the user is on the Change Password Screen
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
