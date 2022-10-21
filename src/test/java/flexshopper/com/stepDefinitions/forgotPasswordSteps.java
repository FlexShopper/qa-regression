package flexshopper.com.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class forgotPasswordSteps {
    @Given("the user is in the Forgot Password screen")
    public void theUserIsInTheForgotPasswordScreen() {
        System.out.println("Then the user is in the Forgot Password screen");
    }

    @Then("the user should see the text: {string}")
    public void theUserShouldSeeTheText(String text) {
        System.out.println("Then the user  should see the text: " + text);
    }

    @And("the user should see the {string} button")
    public void theUserShouldSeeTheButton(String button) {
        System.out.println("Then the user should see the " + button + " button ");
    }

    @And("the user should not see the text: {string}")
    public void theUserShouldNotSeeTheText(String text) {
        System.out.println("Then the user  should not see the text: " + text);
    }

    @When("the user clicks on the link: {string}")
    public void theUserClicksOnTheLink(String link) {
        System.out.println("When the user clicks on the " + link);
    }

    @And("the {string} radio button is selected")
    public void theRadioButtonIsSelected(String radioBtn) {
        System.out.println("Given the radio button is selected " + radioBtn);
    }

    @And("the user should see the email: {string}")
    public void theUserShouldSeeTheEmail(String emailAddress) {
        System.out.println("Then the user should see the email: " + emailAddress);
    }

    @Then("the user lands on the We sent you a code screen")
    public void theUserLandsOnTheWeSentYouACodeScreen() {
    }

    @Given("the user is in the We sent you a code screen")
    public void theUserIsInTheWeSentYouACodeScreen() {
        System.out.println("Then the user lands on the We Sent You a Code screen");
    }

    @When("the user retrieves the verification code from the {string}")
    public void theUserRetrievesTheVerificationCodeFromThe(String device) {
        System.out.println("When the user retrieves the verification code from the " + device);
    }

    @And("the user enters the verification code in the field: {string}")
    public void theUserEntersTheVerificationCodeInTheField(String field) {
        System.out.println("When the user enters the verification code in the field: " + field);
    }

    @And("the user clicks on the Submit button")
    public void theUserClicksOnTheSubmitButton() {
        System.out.println("Then the user clicks on the Submit button");
    }

    @Then("the user lands on the Change Password screen")
    public void theUserLandsOnTheChangePasswordScreen() {
        System.out.println("Then the user lands on the Change Password screen");
    }

    @Given("the user is in the Change Password screen")
    public void theUserIsInTheChangePasswordScreen() {
        System.out.println("Then the user is in the Change Password screen");
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
        System.out.println("Then the user has changed the password");
    }

    @And("the user should see the Dashboard page")
    public void theUserShouldSeeTheDashboardPage() {
        System.out.println("Then the user should see the Dashboard page");
    }

    @And("the user should not see the Dashboard page")
    public void theUserShouldNotSeeTheDashboardPage() {
        System.out.println("Then the user should not see the Dashboard page");
    }
}
