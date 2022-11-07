package pages.pp3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import utils.helpers.WebDriverHelpers;
import utils.helpers.WebElementHelpers;

public class PasswordPage extends EmailPage {
    protected WebElementHelpers elementHelpers = new WebElementHelpers();
    protected WebDriverHelpers driverHelpers = new WebDriverHelpers();

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
    public WebElement signInBtn;

    /**
     * Validation Messages
     */
    @FindBy(how = How.XPATH, using = "//span[text()='Invalid email or password: please check your details and try again']")
    private WebElement passwordValidationMsg;

    @FindBy(how= How.XPATH, using = "//span[@label='Required']")
    public WebElement passwordRequiredMsg;

    /**
     * verifyPasswordScreen() - Verifies user landed in the Password screen
     */
    public void verifyPasswordScreen() {
        elementHelpers.webElementIsDisplayed(flexshopperLogo);
        // TODO: elementHelpers.webElementIsDisplayed(existingCustomerTxt);
        elementHelpers.webElementIsDisplayed(enterPasswordTxt);
        // TODO: elementHelpers.webElementIsDisplayed(emailTxt);
        elementHelpers.webElementIsDisplayed(notYouTxt);
        elementHelpers.webElementIsDisplayed(passwordField);
        elementHelpers.webElementIsDisplayed(forgotPasswordLnk);
        elementHelpers.webElementIsDisplayed(signInBtn);
    }

    /**
     * enterPassword() - Enter password in the password field
     * @param password
     */
    public void enterPassword(String password) {
        elementHelpers.webSendKeys(passwordField, password, true);
    }

    /**
     * clickSignInBtn() - Click on the "Sign-In" button
     */
    public void clickOnTheSignInBtn() {
        elementHelpers.webClick(signInBtn);
    }

    /**
     * passwordValidationMessage() - Verifies the customer sees the expected Validation Message when an invalid password is submitted
     * @param validationMsg
     */
    public void passwordValidationMessage(String validationMsg) {
        elementHelpers.webElementIsDisplayed(passwordValidationMsg);
        // TODO: Assert using Ignore Case
        Assert.assertEquals("Invalid email or password: please check your details and try again", passwordValidationMsg.getText());
    }

    /**
     * passwordRequiredMsg() - Verifies the customer sees the expected Validation Message when the password is not provided
     * @param validationMsg
     */
    public void passwordRequiredMsg(String validationMsg) {
        elementHelpers.webElementIsDisplayed(passwordRequiredMsg);
        // TODO: Assert using Ignore Case
        Assert.assertEquals("Required", passwordRequiredMsg.getText());
    }

    /**
     * clickOnTheForgotPasswordLnk() - Click on the "Forgot Password" Link
     */
    public void clickOnTheForgotPasswordLnk() {
        elementHelpers.webClick(forgotPasswordLnk);
    }
}