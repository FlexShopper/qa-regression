package flexshopper.com.stepDefinitions;

import flexshopper.com.cucumber.TestContext;
import flexshopper.com.pageObjects.flexshopper.EmailPage;
import flexshopper.com.pageObjects.flexshopper.HomePage;
import flexshopper.com.pageObjects.flexshopper.PasswordPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class passwordSteps {
    TestContext testContext;
    EmailPage emailPage;
    HomePage homePage;
    PasswordPage passwordPage;

    public  passwordSteps(TestContext context) {
        testContext=context;
        emailPage=testContext.getPageObjectManager().getLoginPage();
        passwordPage =testContext.getPageObjectManager().getPasswordPage();
        homePage=testContext.getPageObjectManager().getHomePage();
    }
    @Given("^the user is in the Password screen$")
    public void theUserIsInThePasswordScreen() {
        emailPage.getEmailScreen();
        testContext.getWebDriverManager().getDriver().switchTo().frame(0);
        testContext.getWebDriverManager().getDriver().switchTo().frame(0);
        emailPage.login();
        passwordPage.userIsInPasswordPage();
    }

    @And("the user clicks on the Sign In button")
    public void theUserClicksOnTheSignInButton() {
        System.out.println("Then the user clicks on the Sign In button");
        passwordPage.clickSignInBtn();
    }

    @Then("^the user lands in the Homepage as logged in user: \"([^\"]*)\"$")
    public void theUserLandsInTheHomepageAsLoggedInUser(String user) {
        Assert.assertEquals(user,homePage.myAccountHeader.getText() );
    }

    @When("^the user enters an invalid password: \"([^\"]*)\"$")
    public void theUserEntersAnInvalidPassword(String password) {
        System.out.println("When the user enters an invalid password: " + password);
       passwordPage.enterPassword(password);
    }

    @Then("^the user should see the validation error message: \"([^\"]*)\"$")
    public void theUserShouldSeeTheValidationErrorMessage(String errorMsg) {
        System.out.println("Then the user should see the validation error message: " + errorMsg);
        try {
            WebDriverWait wait = new WebDriverWait(testContext.getWebDriverManager().getDriver(), 10);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = testContext.getWebDriverManager().getDriver().switchTo().alert();
            String alertText=alert.getText();
            System.out.println("alertText = " + alertText);
            alert.accept();
            Assert.assertEquals(errorMsg, alert.getText());
        } catch (Exception e) {
            System.out.println("No such Alert exception");
        }
    }

    @When("^the user enters a valid password: \"([^\"]*)\"$")
    public void theUserEntersAValidPassword(String password) {
        passwordPage.enterPassword(password);
    }

    @When("the user enters blank: {string}")
    public void theUserEntersBlank(String password) {
        passwordPage.enterPassword(password);
    }

    @Then("the user should see the validation err message: {string}")
    public void theUserShouldSeeTheValidationErrMessage(String errorMsg) {
        Assert.assertEquals(errorMsg, passwordPage.errMsgRequired.getText());
    }


}