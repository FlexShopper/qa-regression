package flexshopper.com.stepDefinitions;


import flexshopper.com.cucumber.TestContext;
import flexshopper.com.pageObjects.flexshopper.EmailPage;
import flexshopper.com.pageObjects.flexshopper.HomePage;
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
    HomePage homePage;
    PasswordPage passwordPage;
    ProfileInfoPage profileInfoPage;

    public  emailSteps(TestContext context) {
        testContext=context;
        emailPage=testContext.getPageObjectManager().getLoginPage();
        passwordPage =testContext.getPageObjectManager().getPasswordPage();
        homePage=testContext.getPageObjectManager().getHomePage();
        profileInfoPage=testContext.getPageObjectManager().getProfileInfoPage();
    }
    @Given("the user is in the Email screen")
    public void theUserIsInTheEmailScreen() {
        emailPage.getEmailScreen();
        testContext.getWebDriverManager().getDriver().switchTo().frame(0);
        testContext.getWebDriverManager().getDriver().switchTo().frame(0);
    }

    @When("the user enters a valid existing email address: {string}")
    public void theUserEntersAValidExistingEmailAddress(String email) {
        emailPage.enterEmail(email);
    }

    @And("the user clicks on the Continue button")
    public void theUserClicksOnTheContinueButton() {
        emailPage.clickContinueBtn();
    }

    @Then("the user lands on the Password screen")
    public void theUserLandsOnThePasswordScreen() {
        passwordPage.userIsInPasswordPage();
    }

    @When("the user enters a valid no-registered email address: {string}")
    public void theUserEntersAValidNoRegisteredEmailAddress(String email) {
        emailPage.enterEmail(email);
    }

    @Then("the user lands on the Profile Info screen")
    public void theUserLandsOnTheProfileInfoScreen() {
        profileInfoPage.userIsInProfileInfoPage();

    }

    @When("the user enters an invalid email address: {string}")
    public void theUserEntersAnInvalidEmailAddress(String email) {
    }

    @Then("the user sees the following validation message: {string}")
    public void theUserSeesTheFollowingValidationMessage(String errorMsg ) {
        emailPage.welcomeText.click();
        Assert.assertEquals(errorMsg, emailPage.errMsgInvalidEmailAddress.getText());
    }
}
