package flexshopper.com.stepDefinitions;

import flexshopper.com.pageObjects.flexshopper.EmailPage;
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
    public WebDriver driver;

    @Given("^the user is in the Password screen$")
    public void theUserIsInThePasswordScreen() {
        System.out.println("Given the user is in the Password screen");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://fmweb.staging.flexint.net/?do=pp3");
        driver.manage().window().fullscreen();
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);

        EmailPage emailPage = new EmailPage(driver);
        emailPage.enterEmail("nann40547@gmail.com");
        emailPage.clickContinueBtn();

        PasswordPage passwordPage = new PasswordPage(driver);
        passwordPage.userIsInPasswordPage();
    }

    @And("the user clicks on the Sign In button")
    public void theUserClicksOnTheSignInButton() {
        System.out.println("Then the user clicks on the Sign In button");
        PasswordPage passwordPage = new PasswordPage(driver);
        passwordPage.clickSignInBtn();
    }

    @Then("^the user lands in the Homepage as logged in user: \"([^\"]*)\"$")
    public void theUserLandsInTheHomepageAsLoggedInUser(String user) {
        System.out.println("Then the user lands in the Home page as logged in user: " + user);
        WebElement myAccountHeader = driver.findElement(By.className("userName"));
        Assert.assertEquals("Ashley Zzelkova", myAccountHeader.getText());
    }

    @When("^the user enters an invalid password: \"([^\"]*)\"$")
    public void theUserEntersAnInvalidPassword(String password) {
        System.out.println("When the user enters an invalid password: " + password);
        driver.findElement(By.id("password-input")).sendKeys(password);
    }

    @Then("^the user should see the validation error message: \"([^\"]*)\"$")
    public void theUserShouldSeeTheValidationErrorMessage(String validationMsg) {
        System.out.println("Then the user should see the validation error message: " + validationMsg);
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            System.out.println(alert.getText());
            String alertText=alert.getText();
            System.out.println("alertText = " + alertText);
            alert.accept();
            Assert.assertEquals("Invalid email or password: please check your details and try again", alert.getText());
        } catch (Exception e) {
            System.out.println("No such Alert exception");
        }
    }

    @When("^the user enters a valid password: \"([^\"]*)\"$")
    public void theUserEntersAValidPassword(String password) {
        System.out.println("When the user enters a valid password: " + password);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("password-input")));
        element.click();
        //driver.findElement(By.id("password-input")).sendKeys(password);
    }
}