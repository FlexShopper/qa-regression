package flexshopper.com.stepDefinitions;

import flexshopper.com.managers.CapabilitiesManager;
import flexshopper.com.pageObjects.flexshopper.EmailPage;
import flexshopper.com.pageObjects.flexshopper.HomePage;
import flexshopper.com.pageObjects.flexshopper.PasswordPage;
import flexshopper.com.pageObjects.flexshopper.ProfileInfoPage;
import flexshopper.com.selenium.ActionClass;
import flexshopper.com.selenium.Wait;
import flexshopper.com.selenium.Window;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class passwordSteps {
    EmailPage emailPage;
    PasswordPage passwordPage;
    HomePage homePage;
    public AppiumDriver<?> driver;
    @Given("the user is in the Password screen")
    public void theUserIsInThePasswordScreen() {
        CapabilitiesManager capabilitiesManager = new CapabilitiesManager();
        try {
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilitiesManager.getCapabilities());
            driver.get("https://fmweb.staging.flexint.net/?do=pp3");
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        emailPage=new EmailPage(driver);
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        emailPage.enterEmail("startdrift@gmail.com");
        emailPage.clickContinueBtn();
    }

    @When("the user enters a valid password: {string}")
    public void theUserEntersAValidPassword(String password) {
        passwordPage=new PasswordPage(driver);
        passwordPage.enterPassword(password);
    }

    @And("the user clicks on the Sign In button")
    public void theUserClicksOnTheSignInButton() {
        driver.executeScript("arguments[0].click();", passwordPage.signInBtn);

    }

    @Then("the user lands in the Homepage as logged in user: {string}")
    public void theUserLandsInTheHomepageAsLoggedInUser(String user) {
        Window.switchToWindow("CDwindow-0");
        homePage=new HomePage(driver);
        ActionClass.click(homePage.layer1);
        Wait.waitForPageRefreshed(homePage.myAccountHeader);
        System.out.println(homePage.myAccountHeader.getText());


    }

    @When("the user enters an invalid password: {string}")
    public void theUserEntersAnInvalidPassword(String arg0) {
    }

    @Then("the user should see the validation error message: {string}")
    public void theUserShouldSeeTheValidationErrorMessage(String arg0) {
    }

    @When("the user enters blank: {string}")
    public void theUserEntersBlank(String arg0) {
    }

    @Then("the user should see the validation err message: {string}")
    public void theUserShouldSeeTheValidationErrMessage(String arg0) {
    }
}
