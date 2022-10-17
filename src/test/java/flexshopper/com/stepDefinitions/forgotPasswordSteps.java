package flexshopper.com.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class forgotPasswordSteps {
    public WebDriver driver;

    @Then("the user should see the text: {string}")
    public void theUserShouldSeeTheText(String forgotPasswordScreen) {
        System.out.println("Then the user is in the " + forgotPasswordScreen + " screen");
    }

    @Then("the user should see the {string} button")
    public void theUserShouldSeeTheButton(String button) {
        System.out.println("Then the user should see the " + button + " button ");
    }

    @Then("the user should not see the text: {string}")
    public void theUserShouldNotSeeTheText(String text) {
        System.out.println("Then the user  should not see the text: " + text);
    }

    @When("the user clicks on the link: {string}")
    public void theUserClicksOnTheLink(String link) {
        System.out.println("When the user clicks on the " + link);
    }

    @Given("the {string} radio button is selected")
    public void theRadioButtonIsSelected(String radioBtn) {
        System.out.println("Given the radio button is selected " + radioBtn);
    }

    @Then("the user should see the email: {string}")
    public void theUserShouldSeeTheEmail(String emailAddress) {
        System.out.println("Then the user should see the email: " + emailAddress);
    }

    @When("the user retrieves the verification code from the {string}")
    public void theUserRetrievesTheVerificationCode(String device) {
        System.out.println("When the user retrieves the verification code from the " + device);
    }

    @When("the user enters the verification code in the field: {string}")
    public void theUserEntersTheVerificationCodeInTheField(String field) {
        System.out.println("When the user enters the verification code in the field: " + field);
    }

    @When("the user enters a new password: {string}")
    public void theUserEntersANewPassword(String password) {
        System.out.println("When the user enters a new password: " + password);
    }

    @Then("the user is able to change the password")
    public void theUserIsAbleToChangeThePassword() {
        System.out.println("Then the user is able to change the password");
    }

    @Given("the user has changed the password")
    public void theUserHasChangedThePassword() {
        System.out.println("Given the user has changed the password");
    }

    @Then("the user should see the {string} page")
    public void theUserShouldSeeThePage(String page) {
        System.out.println("Then the user should see the " + page);
    }

    @Then("the user should not see the {string} page")
    public void theUserShouldNotSeeThePage(String page) {
        System.out.println("Then the user should not see the " + page);
    }
}
