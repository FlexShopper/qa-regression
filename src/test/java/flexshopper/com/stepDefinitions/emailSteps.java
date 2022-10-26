package flexshopper.com.stepDefinitions;


import flexshopper.com.managers.CapabilitiesManager;
import flexshopper.com.pageObjects.flexshopper.EmailPage;
import flexshopper.com.pageObjects.flexshopper.PasswordPage;
import flexshopper.com.pageObjects.flexshopper.ProfileInfoPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class emailSteps {
    EmailPage emailPage;
    PasswordPage passwordPage;
    ProfileInfoPage profileInfoPage;
    public AppiumDriver<?> driver;
    @Given("the user is in the Email screen")
    public void theUserIsInTheEmailScreen() {
        CapabilitiesManager capabilitiesManager = new CapabilitiesManager();
        try {
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilitiesManager.getCapabilities());
            driver.get("https://fmweb.staging.flexint.net/?do=pp3");
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }

    @When("the user enters a valid existing email address: {string}")
    public void theUserEntersAValidExistingEmailAddress(String email) {
        emailPage=new EmailPage(driver);
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        emailPage.enterEmail(email);
    }

    @And("the user clicks on the Continue button")
    public void theUserClicksOnTheContinueButton() {
        emailPage.clickContinueBtn();
    }

    @Then("the user lands on the Password screen")
    public void theUserLandsOnThePasswordScreen(){
        passwordPage=new PasswordPage(driver);
        passwordPage.userIsInPasswordPage();
    }

    @When("the user enters a valid no-registered email address: {string}")
    public void theUserEntersAValidNoRegisteredEmailAddress(String email) {
        emailPage=new EmailPage(driver);
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        emailPage.enterEmail(email);
    }

    @Then("the user lands on the Profile Info screen")
    public void theUserLandsOnTheProfileInfoScreen() {
        profileInfoPage=new ProfileInfoPage(driver);
        profileInfoPage.userIsInProfileInfoPage();
    }

    @When("the user enters an invalid email address: {string}")
    public void theUserEntersAnInvalidEmailAddress(String email) {
        emailPage=new EmailPage(driver);
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        emailPage.enterEmail(email);
    }

    @Then("the user sees the following validation message: {string}")
    public void theUserSeesTheFollowingValidationMessage(String errorMsg ) {
        Assert.assertEquals(errorMsg, emailPage.errMsgInvalidEmailAddress.getText());
    }
}
