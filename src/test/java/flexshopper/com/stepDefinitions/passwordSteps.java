package flexshopper.com.stepDefinitions;

import flexshopper.com.managers.CapabilitiesManager;
import flexshopper.com.pageObjects.flexshopper.EmailPage;
import flexshopper.com.pageObjects.flexshopper.HomePage;
import flexshopper.com.pageObjects.flexshopper.PasswordPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
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
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", passwordPage.signInBtn);
                    driver.executeScript("arguments[0].click();", passwordPage.signInBtn);

    }

    @Then("the user lands in the Homepage as logged in user: {string}")
    public void theUserLandsInTheHomepageAsLoggedInUser(String user) {
        String windowHandle = driver.getWindowHandle();
        driver.switchTo().window("CDwindow-0");
        homePage=new HomePage(driver);
        Actions action = new Actions(driver);
        action.moveToElement(homePage.layer1).click().perform();
        WebDriverWait wait =new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(homePage.myAccountHeader)));
        System.out.println(homePage.myAccountHeader.getText());


    }

    @When("the user enters an invalid password: {string}")
    public void theUserEntersAnInvalidPassword(String password) {
        passwordPage=new PasswordPage(driver);
        passwordPage.enterPassword(password);

    }

    @Then("the user should see the validation error message: {string}")
    public void theUserShouldSeeTheValidationErrorMessage(String errorMsg) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 2);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            System.out.println(alert.getText());
            alert.accept();
            Assert.assertEquals(errorMsg, alert.getText());
        } catch (Exception e) {
            System.out.println("No such Alert exception");
        }
    }

    @When("the user enters blank: {string}")
    public void theUserEntersBlank(String password) {
        passwordPage=new PasswordPage(driver);
        passwordPage.enterPassword(password);
    }

    @Then("the user should see the validation err message: {string}")
    public void theUserShouldSeeTheValidationErrMessage(String errorMsg) {
        Assert.assertEquals(errorMsg, passwordPage.errMsgRequired.getText());
    }
}
