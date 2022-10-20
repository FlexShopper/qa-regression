package flexshopper.com.stepDefinitions;

import flexshopper.com.cucumber.TestContext;
import flexshopper.com.pageObjects.flexshopper.EmailPage;
import flexshopper.com.pageObjects.flexshopper.PasswordPage;
import flexshopper.com.pageObjects.flexshopper.ProfileInfoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



public class emailSteps {
    TestContext testContext;
    EmailPage emailPage;
    ProfileInfoPage profileInfoPage;
    PasswordPage passwordPage;

    public  emailSteps(TestContext context) {
        testContext=context;
        emailPage=testContext.getPageObjectManager().getLoginPage();
        passwordPage =testContext.getPageObjectManager().getPasswordPage();
        profileInfoPage=testContext.getPageObjectManager().getProfileInfoPage();
    }
    @Given("^the user is in the Email screen$")
    public void theUserIsInTheEmailScreen() {
        System.out.println("Given the user is in the Email screen");
        emailPage.getEmailScreen();
        testContext.getWebDriverManager().getDriver().switchTo().frame(0);
        testContext.getWebDriverManager().getDriver().switchTo().frame(0);
    }
    @When("^the user enters a valid existing email address: \"([^\"]*)\"$")
    public void theUserEntersAValidExistingEmailAddress(String email) {
        System.out.println("When the user enters a valid existing email address: " + email);
        emailPage.enterEmail(email);
    }

    @And("^the user clicks on the Continue button$")
    public void theUserClicksOnTheContinueButton() {
        emailPage.clickContinueBtn();
        emailPage.welcomeText.click();
    }

    @When("^the user enters a valid no-registered email address: \"([^\"]*)\"$")
    public void theUserEntersAValidNoRegisteredEmailAddress(String email) {
        emailPage.enterEmail(email);
    }

    @When("^the user enters an invalid email address: \"([^\"]*)\"$")
    public void theUserEntersAnInvalidEmailAddress(String email) {
       emailPage.enterEmail(email);
    }

    @Then("^the user sees the following validation message: \"([^\"]*)\"$")
    public void theUserSeesTheFollowingValidationMessage(String errorMsg ) {
        Assert.assertEquals(errorMsg , emailPage.errorMsg.getText());

    }

    @Then("the user lands on the Password screen")
    public void theUserLandsOnThePasswordScreen() throws InterruptedException {
        passwordPage.userIsInPasswordPage();
    }

    @Then("the user lands on the Profile Info screen")
    public void theUserLandsOnTheProfileInfoScreen() throws InterruptedException {
        System.out.println("Then the user lands on the Profile Info screen");
        profileInfoPage.userIsInProfileInfoPage();
    }
}
