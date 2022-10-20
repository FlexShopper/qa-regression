package flexshopper.com.stepDefinitions;

import flexshopper.com.pageObjects.flexshopper.EmailPage;
import flexshopper.com.pageObjects.flexshopper.PasswordPage;
import flexshopper.com.pageObjects.flexshopper.ProfileInfoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class emailSteps {
    public WebDriver driver;

    @Given("^the user is in the Email screen$")
    public void theUserIsInTheEmailScreen() {
        System.out.println("Given the user is in the Email screen");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://fmweb.staging.flexint.net/?do=pp3");
        driver.manage().window().fullscreen();
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);

        EmailPage emailPage = new EmailPage(driver);
        emailPage.userIsInEmailScreen();
    }

    @When("^the user enters a valid existing email address: \"([^\"]*)\"$")
    public void theUserEntersAValidExistingEmailAddress(String emailAddress) {
        System.out.println("When the user enters a valid existing email address: " + emailAddress);
        EmailPage emailPage = new EmailPage(driver);
        emailPage.enterEmail(emailAddress);
    }

    @And("^the user clicks on the Continue button$")
    public void theUserClicksOnTheContinueButton() {
        System.out.println("When the user clicks on the Continue button");
        //driver.findElement(By.id("formSubmitButton")).click();
        EmailPage emailPage = new EmailPage(driver);
        emailPage.clickContinueBtn();
    }

    @When("^the user enters a valid no-registered email address: \"([^\"]*)\"$")
    public void theUserEntersAValidNoRegisteredEmailAddress(String emailAddress) {
        System.out.println("When the user enters a valid no-registered email address: " + emailAddress);
        driver.findElement(By.id("email-input")).sendKeys(emailAddress);
    }

    @When("^the user enters an invalid email address: \"([^\"]*)\"$")
    public void theUserEntersAnInvalidEmailAddress(String emailAddress) {
        System.out.println("When the user enters an invalid email address: " + emailAddress);
        driver.findElement(By.id("email-input")).sendKeys(emailAddress);
    }

    @Then("^the user sees the following validation message: \"([^\"]*)\"$")
    public void theUserSeesTheFollowingValidationMessage(String validationMsg) {
        System.out.println("Then the user should see the validation error message: " + validationMsg);
        WebElement errorMessage=driver.findElement(By.xpath("//span[@label='Invalid email address']"));
        Assert.assertEquals("Invalid email address", errorMessage.getText());
        System.out.println(errorMessage.getText());
        driver.quit();
    }

    @Then("the user lands on the Password screen")
    public void theUserLandsOnThePasswordScreen() {
        System.out.println("Then the user lands on the Password screen");
        PasswordPage passwordPage = new PasswordPage(driver);
        passwordPage.userIsInPasswordPage();
    }

    @Then("the user lands on the Profile Info screen")
    public void theUserLandsOnTheProfileInfoScreen() {
        System.out.println("Then the user lands on the Profile Info screen");
        ProfileInfoPage profileInfoPage = new ProfileInfoPage(driver);
        profileInfoPage.userIsInProfileInfoPage();
    }
}
