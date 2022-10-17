package flexshopper.com.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class passwordSteps {
    public WebDriver driver;

    @When("^the user enters a valid password: \"([^\"]*)\"$")
    public void theUserEntersAValidPassword(String password) {
        System.out.println("When the user enters a valid password: " + password);
        driver.findElement(By.id("password-input")).sendKeys(password);
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

    @When("^the user do not enter a password$")
    public void theUserDoNotEnterAPassword() {
        System.out.println("When the user do not enter a password");
    }
}