package pages;

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
     * Elements - Password Screen
     */
    @FindBy(how = How.CSS, using = "svg > .cls-1:nth-child(8)")
    private WebElement flexshopperLogo;

    @FindBy(how = How.CSS, using = "h3.sc-jKJlTe.ithYWB")
    private WebElement existingCustomerTxt;

    @FindBy(how =How.XPATH, using = "Enter your password to sign in to your existing account.")
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
        elementHelpers.weElementIsDisplayed(flexshopperLogo);
        // TODO: elementHelpers.weElementIsDisplayed(existingCustomerTxt);
        // TODO: elementHelpers.weElementIsDisplayed(enterPasswordTxt);
        // TODO: elementHelpers.weElementIsDisplayed(emailTxt);
        elementHelpers.weElementIsDisplayed(notYouTxt);
        elementHelpers.weElementIsDisplayed(passwordField);
        elementHelpers.weElementIsDisplayed(forgotPasswordLnk);
        elementHelpers.weElementIsDisplayed(signInBtn);
    }

    /**
     * enterPassword() - Enter password in the password field
     * @param password
     */
    public void enterPassword(String password) {
        elementHelpers.weSendKeys(passwordField, password, true);
    }

    /**
     * clickSignInBtn() - Click on the "Sign-In" button
     */
    public void clickOnTheSignInBtn() {
        elementHelpers.weClick(signInBtn);
    }

    /**
     * emailValidationMessage() - Verifies the customer sees the expected Validation Message
     */
    public void passwordValidationMessage(String validationMsg) {
        elementHelpers.weElementIsDisplayed(passwordValidationMsg);
        // TODO: Assert using Ignore Case
        Assert.assertEquals("Invalid email or password: please check your details and try again", passwordValidationMsg.getText());
    }

    public void passwordRequiredMsg(String validationMsg) {
        elementHelpers.weElementIsDisplayed(passwordRequiredMsg);
        // TODO: Assert using Ignore Case
        Assert.assertEquals("Required", passwordRequiredMsg.getText());
    }
}
