package stepdefinitions.pp3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Page;
import pages.flexshopper.FlexShopperHomePage;
import pages.pp3.*;
import java.util.concurrent.ExecutionException;

public class PasswordSteps extends Page {
    @Given("^the user is on the Password screen with email: \"([^\"]*)\"$")
    public void theUserIsOnThePasswordScreenWithEmail(String email) throws ExecutionException, InterruptedException {
        System.out.println("Given the user is on the Password screen with email: " + email);
        // Launch browser and navigate to the PP3's Password screen
        instanceOf(EmailPage.class).navigateToBaseUrl();
        instanceOf(EmailPage.class).browserFullScreen();
        instanceOf(EmailPage.class).switchToFrame();
        instanceOf(EmailPage.class).verifyEmailScreen();
        instanceOf(EmailPage.class).enterEmail(email);
        instanceOf(EmailPage.class).clickOnContinueBtn();

        // Verify user landed on the PP3's Password screen
        instanceOf(PasswordPage.class).verifyPasswordScreen();
        instanceOf(EmailPage.class).verifyFooter();
    }

    @Then("^the user lands on the Email screen$")
    public void theUserLandsOnTheEmailScreen() throws ExecutionException, InterruptedException {
        System.out.println("Then the user lands on the Email screen");
        // Verify user landed on the PP3's Email screen
        instanceOf(EmailPage.class).verifyHeader();
        instanceOf(EmailPage.class).verifyEmailScreen();
        instanceOf(EmailPage.class).verifyFooter();
    }

    @When("^the user clicks on the link: \"([^\"]*)\"$")
    public void theUserClicksOnTheLink(String link) {
        System.out.println("When the user clicks on the link: " + link);
        switch (link) {
            case "Not You?":
                instanceOf(PasswordPage.class).clickOnTheNotYouLnk();
                break;
            case "Forgot Password?":
                instanceOf(PasswordPage.class).clickOnTheForgotPasswordLnk();
                break;
            case "Return to Password Sign In":
                instanceOf(ForgotPasswordPage.class).clickOnReturnToPasswordLink();
                break;
            case "No Code received?":
                instanceOf(VerificationCodePage.class).clickOnNoCodeReceivedLnk();
                break;
            case "Enter Address Manually":
                instanceOf(ProfileInfoPage.class).clickOnEnterAddressManuallyLnk();
                break;
            default:
                System.out.println("Link " + link + "was not found!");
        }
    }

    @When("^the user enters a valid password: \"([^\"]*)\"$")
    public void theUserEntersAValidPassword(String password) {
        System.out.println("When the user enters a valid password: " + password);
        instanceOf(PasswordPage.class).enterPassword(password);
    }

    @Then("^the user lands on the Homepage as logged in user: \"([^\"]*)\"$")
    public void theUserLandsOnTheHomepageAsLoggedInUser(String userName) throws ExecutionException, InterruptedException {
        System.out.println("Then the user lands on the Homepage as logged in user: " + userName);
        instanceOf(FlexShopperHomePage.class).verifyFlexShopperHomePage();
        instanceOf(FlexShopperHomePage.class).verifyUserLoggedIn(userName);
    }

    @When("^the user enters an invalid password: \"([^\"]*)\"$")
    public void theUserEntersAnInvalidPassword(String password) {
        System.out.println("When the user enters an invalid password: " + password);
        instanceOf(PasswordPage.class).enterPassword(password);
    }

    @Then("^the user should see the validation error message: \"([^\"]*)\"$")
    public void theUserShouldSeeTheValidationErrorMessage(String validationMsg) {
        System.out.println("Then the user should see the validation error message: " + validationMsg);
        instanceOf(PasswordPage.class).passwordValidationMessage(validationMsg);
    }

    @When("^the user enters blank: \"([^\"]*)\"$")
    public void theUserEntersBlank(String password) {
        System.out.println("When the user enters blank: " + password);
        instanceOf(PasswordPage.class).enterPassword(password);
    }

    @Then("^the user should see the required validation message: \"([^\"]*)\"$")
    public void theUserShouldSeeTheRequiredValidationMessage(String validationMsg) {
        System.out.println("Then the user should see the required validation message: " + validationMsg);
        instanceOf(PasswordPage.class).passwordRequiredMsg(validationMsg);
    }
}
