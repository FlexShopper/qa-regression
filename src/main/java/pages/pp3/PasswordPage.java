package pages.pp3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.helpers.WaitHelpers;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class PasswordPage {
    //protected WebElementHelpers elementHelpers = new WebElementHelpers();

    public PasswordPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /**
     * Elements - PP3's Password Screen
     */
    @FindBy(how = How.CSS, using = "svg > .cls-1:nth-child(8)")
    private WebElement flexshopperLogo;

    @FindBy(how = How.XPATH, using = "//h3[normalize-space(.)='Looks like you already have an account with FlexShopper registered under this email address.'")
    private WebElement existingCustomerTxt;

    @FindBy(how =How.XPATH, using = "//p[(.)='Enter your password to sign in to your existing account.']")
    private WebElement enterPasswordTxt;

    @FindBy(how = How.CSS, using = "h3.sc-TOsTZ.iBTFfQ.sc-kLIISr.gdrpxe")
    private WebElement emailTxt;

    @FindBy(how = How.XPATH, using = "//button[(.)='Not You?']")
    private WebElement notYouTxt;

    @FindBy(how = How.ID,using = "password-input")
    private WebElement passwordField;

    @FindBy(how = How.XPATH, using = "//a[text()='Forgot Password?']")
    private WebElement forgotPasswordLnk;

    @FindBy(how = How.XPATH, using = "//span[(.)='Sign In']")
    private WebElement signInBtn;

    /**
     * Validation Messages
     */
    @FindBy(how = How.XPATH, using = "//span[text()='Invalid email or password: please check your details and try again']")
    private WebElement passwordValidationMsg;

    @FindBy(how= How.XPATH, using = "//span[@label='Required']")
    public WebElement passwordRequiredMsg;

    /**
     * verifyPasswordScreen() - Verifies user landed on the Password screen
     */
    public void verifyPasswordScreen() throws ExecutionException, InterruptedException {
        //WaitHelpers.waitFluentWait(passwordField, 240);
        WaitHelpers.waitForStaleElement(passwordField);
        //TODO: move to steps emailPage.verifyHeader();

        // Verify elements are displayed
        // TODO: elementHelpers.webElementIsDisplayed(flexshopperLogo);
        // TODO: elementHelpers.webElementIsDisplayed(existingCustomerTxt);
        enterPasswordTxt.isDisplayed();
        // TODO: elementHelpers.webElementIsDisplayed(emailTxt);
        notYouTxt.isDisplayed();
        passwordField.isDisplayed();
        forgotPasswordLnk.isDisplayed();
        signInBtn.isDisplayed();
        // TODO: Verify PP3's Footer
    }

    /**
     * enterPassword() - Enter password in the password field
     * @param password
     */
    public void enterPassword(String password) {
        //elementHelpers.webSendKeys(passwordField, password, true);
        passwordField.sendKeys(password);
    }

    /**
     * clickSignInBtn() - Click on the "Sign-In" button
     */
    public void clickOnTheSignInBtn() {
        //elementHelpers.webClickJSExecutor(signInBtn);
        signInBtn.click();
    }

    /**
     * passwordValidationMessage() - Verifies the customer sees the expected Validation Message when an invalid password is submitted
     * @param validationMsg
     */
    public void passwordValidationMessage(String validationMsg) {
        // Wait for screen to load & Ajax to be completed
        WaitHelpers.waitForPageReady(6);
/**
        //TODO: Move code below to WebElementHelpers
        WebDriver driver = browser();
        List<WebElement> spanText = driver.findElements(By.tagName("span"));
        for(int i = 0; i<spanText.size(); i++){
            String textFound = spanText.get(i).getText();
            System.out.println("Value is  ==> " + spanText.get(i).getText());
            if (textFound.contains(validationMsg)) {
                Assert.assertEquals(validationMsg, spanText.get(i).getText());
                break;
            }
        }
 */
    }

    /**
     * passwordRequiredMsg() - Verifies the customer sees the expected Validation Message when the password is not provided
     * @param validationMsg
     */
    public void passwordRequiredMsg(WebDriver driver, String validationMsg) {
        // Wait for screen to load & Ajax to be completed
        WaitHelpers.waitForPageReady(6);

        //TODO: Move code below to WebElementHelpers
        List<WebElement> spanText = driver.findElements(By.tagName("span"));
        for(int i = 0; i<spanText.size(); i++){
            String textFound = spanText.get(i).getText();
            System.out.println("Value is  ==> " + spanText.get(i).getText());
            if (textFound.contains("Required")) {
                //Assert.assertEquals("Required", spanText.get(i).getText());
                break;
            }
        }
    }

    /**
     * clickOnTheNotYouLnk() - Clicks on the "Not You?" Link
     */
    public void clickOnTheNotYouLnk() {
        //elementHelpers.webClick(notYouTxt);
        notYouTxt.click();
    }

    /**
     * clickOnTheForgotPasswordLnk() - Clicks on the "Forgot Password" Link
     */
    public void clickOnTheForgotPasswordLnk() {
        //elementHelpers.webClick(forgotPasswordLnk);
        forgotPasswordLnk.click();
    }
}
