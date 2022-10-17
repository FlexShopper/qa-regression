package flexshopper.com.stepDefinitions;

import flexshopper.com.pageObjects.flexshopper.LoginPage;
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

public class loginSteps {
    public WebDriver driver;
    LoginPage loginPage = new LoginPage(driver);

    @Given("^the user is in the \"([^\"]*)\" screen$")
    public void theUserIsInTheScreen(String screen) {
        System.out.println("Given the user is in the " + screen + " screen");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://fmweb.staging.flexint.net/?do=pp3");
        driver.manage().window().fullscreen();
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);

        switch (screen) {
             case "Password":
                driver.findElement(By.id("email-input")).sendKeys("nann40547@gmail.com");
                driver.findElement(By.id("formSubmitButton")).click();
                break;
            case "Forgot Password":
                driver.findElement(By.id("email-input")).sendKeys("nann40547@gmail.com");
                driver.findElement(By.id("formSubmitButton")).click();
                driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
                break;
        }
    }

    @When("^the user enters a valid existing email address: \"([^\"]*)\"$")
    public void theUserEntersAValidExistingEmailAddress(String emailAddress) {
        System.out.println("When the user enters a valid existing email address: " + emailAddress);
        driver.findElement(By.id("email-input")).sendKeys("nann40547@gmail.com");
    }

    @And("^the user clicks on the \"([^\"]*)\" button$")
    public void theUserClicksOnTheButton(String button) {
        System.out.println("When the user clicks on the " + button + " button");
        driver.findElement(By.id("formSubmitButton")).click();
    }

    @Then("^the user lands on the \"([^\"]*)\" screen$")
    public void theUserLandsOnTheScreen(String screen) {
        System.out.println("Then the user lands on the " + screen);
        switch(screen) {
            case "Password":
                WebElement password = driver.findElement(By.id("password-input"));
                Assert.assertTrue(password.isDisplayed());
                System.out.println("Password is displayed");
                break;
            case "Profile Info":
                WebElement profileInfo = driver.findElement(By.xpath("//h2[text()='Profile Info']"));
                Assert.assertEquals("Profile Info", profileInfo.getText());
                System.out.println("profileInfo.getText() = " + profileInfo.getText());
                driver.quit();
                break;
            case "Homepage":
                WebElement myAccountHeader = driver.findElement(By.className("userName"));
                Assert.assertEquals("Ashley Zzelkova", myAccountHeader.getText());
                System.out.println("myAccountHeader.getText() = " + myAccountHeader.getText());
                driver.quit();
                break;
        }
    }

    @When("^the user enters a valid no-registered email address: \"([^\"]*)\"$")
    public void theUserEntersAValidNoRegisteredEmailAddress(String emailAddress) {
        System.out.println("When the user enters a valid no-registered email address: " + emailAddress);
        driver.findElement(By.id("email-input")).sendKeys(emailAddress);
    }

    @When("^the user enters an invalid email address: \"([^\"]*)\"$")
    public void theUserEntersAnInvalidEmailAddress(String emailAddress) {
        System.out.println("When the user enters an invalid email address: " + emailAddress);
        loginPage.enterEmail(emailAddress);
    }

    @Then("^the user sees the following validation message: \"([^\"]*)\"$")
    public void theUserSeesTheFollowingValidationMessage(String validationMsg) {
        System.out.println("Then the user should see the validation error message: " + validationMsg);
        WebElement errorMessage=driver.findElement(By.xpath("//span[@label='Invalid email address']"));
        Assert.assertEquals("Invalid email address", errorMessage.getText());
        System.out.println(errorMessage.getText());
        driver.quit();
    }
}
