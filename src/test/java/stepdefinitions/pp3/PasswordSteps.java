package stepdefinitions.pp3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.pp3.EmailPage;
import pages.flexshopper.FlexShopperHomePage;
import pages.Page;
import pages.pp3.PasswordPage;

public class PasswordSteps extends Page {
    @Given("^the user is in the Password screen with email: \"([^\"]*)\"$")
    public void theUserIsInThePasswordScreenWithEmail(String email) {
        // Launch browser and navigate to the PP3's Password screen
        instanceOf(EmailPage.class).navigateToBaseUrl();
        instanceOf(EmailPage.class).browserFullScreen();
        instanceOf(EmailPage.class).switchToFrame();
        instanceOf(EmailPage.class).enterEmail(email);
        instanceOf(EmailPage.class).clickOnContinueBtn();

        // Verify user landed on the PP3's Password screen
        instanceOf(EmailPage.class).verifyHeader();
        instanceOf(PasswordPage.class).verifyPasswordScreen();
        instanceOf(EmailPage.class).verifyFooter();
    }

    @When("^the user enters a valid password: \"([^\"]*)\"$")
    public void theUserEntersAValidPassword(String password) {
        instanceOf(PasswordPage.class).enterPassword(password);
    }

    @And("^the user clicks on the Sign In button")
    public void theUserClicksOnTheSignInButton() throws InterruptedException {
        instanceOf(PasswordPage.class).clickOnTheSignInBtn();
        Thread.sleep(5000);
    }

    @Then("^the user lands on the Homepage as logged in user: \"([^\"]*)\"$")
    public void theUserLandsOnTheHomepageAsLoggedInUser(String userName) {
        instanceOf(FlexShopperHomePage.class).verifyFlexShopperHomePage();
        instanceOf(FlexShopperHomePage.class).verifyUserLoggedIn(userName);
    }

    @When("^the user enters an invalid password: \"([^\"]*)\"$")
    public void theUserEntersAnInvalidPassword(String password) {
        instanceOf(PasswordPage.class).enterPassword(password);
    }

    @Then("^the user should see the validation error message: \"([^\"]*)\"$")
    public void theUserShouldSeeTheValidationErrorMessage(String validationMsg) {
        instanceOf(PasswordPage.class).passwordValidationMessage(validationMsg);
    }

    @When("^the user enters blank: \"([^\"]*)\"$")
    public void theUserEntersBlank(String password) {
        instanceOf(PasswordPage.class).enterPassword(password);
    }

    @Then("^the user should see the required validation message: \"([^\"]*)\"$")
    public void theUserShouldSeeTheRequiredValidationMessage(String validationMsg) {
        instanceOf(PasswordPage.class).passwordRequiredMsg(validationMsg);
    }
}
