package stepdefinitions.pp3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.pp3.*;

import java.time.Duration;
import java.util.concurrent.ExecutionException;

public class EmailSteps {
    WebDriver driver;
    EmailPage emailPage;
    PasswordPage passwordPage;
    ChangePasswordPage changePasswordPage;
    VerificationCodePage verificationCodePage;
    ProfileInfoPage profileInfoPage;

    @Given("^the user is on the Email screen$")
    public void theUserIsOnTheEmailScreen() throws ExecutionException, InterruptedException {
        System.out.println("Given the user is on the Email screen");
        // Launch browser and navigate to the PP3's Email screen
        //declare the chrome driver from the local machine location
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
        //create object of chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless"); //add the headless argument

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        emailPage = new EmailPage(driver);
        emailPage.navigateToBaseUrl();
        emailPage.browserFullScreen();
        emailPage.switchToFrame();

        // Verify user landed on the PP3's Email screen
        emailPage.verifyHeader();
        emailPage.verifyEmailScreen();
        emailPage.verifyFooter();
    }

    @When("^the user enters a valid existing email address: \"([^\"]*)\"$")
    public void theUserEntersAValidExistingEmailAddress(String email) {
        System.out.println("Then the user should see the email: " + email);
        emailPage.enterEmail(email);
    }

    @And("^the user clicks on the button: \"([^\"]*)\"$")
    public void theUserClicksOnTheButton(String button) {
        System.out.println("And the user clicks on the button: " + button);
        passwordPage = new PasswordPage(driver);
        verificationCodePage = new VerificationCodePage(driver);
        changePasswordPage = new ChangePasswordPage(driver);
        switch (button) {
            case "Continue":
            case "Submit Application":
                emailPage.clickOnContinueBtn();
                break;
            case "Sign In":
                passwordPage.clickOnTheSignInBtn();
                break;
            case "Submit":
                verificationCodePage.clickOnSubmitBtn();
                break;
            case "Change Password":
                changePasswordPage.clickOnChangePasswordBtn();
                break;
            default:
                System.out.println("Button " + button + "was not found!");
       }
    }

    @Then("^the user lands on the Password screen$")
    public void theUserLandsOnThePasswordScreen() throws ExecutionException, InterruptedException {
        System.out.println("Then the user lands on the Password screen");
        emailPage.verifyHeader();
        passwordPage.verifyPasswordScreen();
        emailPage.verifyFooter();

        driver.quit();
    }

    @When("^the user enters a valid no-registered email address: \"([^\"]*)\"$")
    public void theUserEntersAValidNoRegisteredEmailAddress(String email) {
        System.out.println("When the user enters a valid no-registered email address: " + email);
        emailPage.enterEmail(email);
    }

    @Then("^the user lands on the Profile Info screen$")
    public void theUserLandsOnTheProfileInfoScreen() throws InterruptedException {
        System.out.println("Then the user lands on the Profile Info screen");
        profileInfoPage = new ProfileInfoPage(driver);
        //TODO: profileInfoPage.verifyProfileInfoScreen();
        emailPage.verifyHeader();
        emailPage.verifyFooter();

        driver.quit();
    }

    @When("^the user enters an invalid email address: \"([^\"]*)\"$")
    public void theUserEntersAnInvalidEmailAddress(String email) {
        System.out.println("When the user enters an invalid email address: " + email);
        emailPage.enterEmail(email);
    }

    @Then("^the user sees the following validation message: \"([^\"]*)\"$")
    public void theUserSeesTheFollowingValidationMessage(String validationMsg) {
        System.out.println("Then the user should see the email: " + validationMsg);
        emailPage.emailValidationMessage(validationMsg);

        driver.quit();
    }

    @Then("^the user sees the following HTML validation message: \"([^\"]*)\"$")
    public void theUserSeesTheFollowingHTMLValidationMessage(String validationMsg) {
        System.out.println("Then the user sees the following HTML validation message: " + validationMsg);

        driver.quit();
    }
}
