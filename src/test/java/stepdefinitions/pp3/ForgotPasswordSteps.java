package stepdefinitions.pp3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Page;
import pages.pp3.EmailPage;
import pages.pp3.ForgotPasswordPage;
import pages.pp3.PasswordPage;

public class ForgotPasswordSteps extends Page {
    @Given("^the user is in the Forgot Password screen with email: \"([^\"]*)\"$")
    public void theUserIsInTheForgotPasswordScreenWithEmail(String email) {
        // Launch browser and navigate to the PP3's Forgot Password screen
        instanceOf(EmailPage.class).navigateToBaseUrl();
        instanceOf(EmailPage.class).browserFullScreen();
        instanceOf(EmailPage.class).switchToFrame();
        instanceOf(EmailPage.class).enterEmail(email);
        instanceOf(EmailPage.class).clickOnContinueBtn();
        instanceOf(PasswordPage.class).clickOnTheForgotPasswordLnk();

        // Verify user landed in the PP3's Forgot Password screen
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
        instanceOf(ForgotPasswordPage.class).verifySMSOptionsNotShown();
    }

    @When("^the user clicks on the link: \"([^\"]*)\"$")
    public void theUserClicksOnTheLink(String link) {}

    @Given("^the Send Email radio button is selected$")
    public void theSendEmailRadioButtonIsSelected() {}

    @Then("^the user lands on the We Sent You a Code screen$")
    public void theUserLandsOnTheWeSentYouACodeScreen() {}

    @Then("^the user should see the field: \"([^\"]*)\"$")
    public void theUserShouldSeeTheField(String fieldName) {}

    @Given("^the Send SMS radio button is selected$")
    public void theSendSMSRadioButtonIsSelected() {}

    @When("^the user retrieves the verification code from the email$")
    public void theUserRetrievesTheVerificationCodeFromTheEmail() {}

    @When("^the user enters the Security Code in the field$")
    public void theUserEntersTheSecurityCodeInTheField() {}

    @When("^the user clicks on the Submit button$")
    public void theUserClicksOnTheSubmitButton() {}

    @Then("^the user lands on the Change Password screen$")
    public void theUserLandsOnTheChangePasswordScreen() {}

    @Given("^the user is in the We Sent You a Code screen$")
    public void theUserIsInTheWeSentYouACodeScreen() {}

    @When("^the user retrieves the verification code from the phone$")
    public void theUserRetrievesTheVerificationCodeFromThePhone() {}

    @Given("^the user is in the We Sent You a Code screen with email: \"([^\"]*)\"$")
    public void theUserIsInTheWeSentYouACodeScreenWithEmail(String email) {}

    @When("^the user clicks on the button: \"([^\"]*)\"$")
    public void theUserClicksOnTheButton(String noCodeReceivedBtn) {}

    @Then("^the user lands on the Forgot Password screen$")
    public void theUserLandsOnTheForgotPasswordScreen() {}

    @Given("^the user is on the Change Password Screen$")
    public void theUserIsOnTheChangePasswordScreen() {}

    @When("^the user enters the password: \"([^\"]*)\"$")
    public void theUserEntersThePassword(String password) {}

    @When("^the user is on the Email screen$")
    public void theUserIsOnTheEmailScreen() { }

    @When("^the user enters the email: \"([^\"]*)\"$")
    public void theUserEntersTheEmail(String email) {}

    @When("^the user clicks on the Sign in button$")
    public void theUserClicksOnTheSignInButton() {}

    @Given("^the user is on the Change Password Screen with email: \"([^\"]*)\"$")
    public void theUserIsOnTheChangePasswordScreenWithEmail(String string) {}

    @When("^the user clicks on the Save Changes button$")
    public void theUserClicksOnTheSaveChangesButton() {    }
}
