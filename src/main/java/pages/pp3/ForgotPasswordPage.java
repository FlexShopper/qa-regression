package pages.pp3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.helpers.WebElementHelpers;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ForgotPasswordPage extends EmailPage {
    protected WebElementHelpers elementHelpers = new WebElementHelpers();

    /**
     * Elements - PP3's Forgot Password Screen
     */
    @FindBy(how = How.CSS, using = "#subtitle > img")
    private WebElement flexshopperLogo;

    @FindBy(how = How.XPATH, using = "//h3[normalize-space(.)='How would you like to reset your password? You can verify by email or request a text to be sent to the mobile number linked to your account.']")
    private WebElement resetYourPasswordTxt;

    @FindBy(how = How.XPATH, using = "//p[(.)='Please choose one of the options below:']")
    public WebElement passwordResetOptionsTxt;

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div[2]/div/div/label[1]/div[1]")
    public WebElement emailRadioBtn;

    @FindBy(how = How.XPATH, using = "//span[(.)='Send email to:']")
    public WebElement sendEmailToTxt;

    @FindBy(how = How.CSS, using = "span.sc-gVyKpa.dgqWCN")
    public WebElement emailValueTxt;

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div[2]/div/div/label[2]/div[1]")
    public WebElement phoneNumberRadioBtn;

    @FindBy(how = How.XPATH, using = "//span[(.)='xxx-xxx-2917']")
    public WebElement phoneNumberTxt;

    @FindBy(how = How.XPATH, using = "//span[(.)='Send SMS text with code to:']")
    public WebElement sendSMAToTxt;

    @FindBy(how = How.XPATH, using = "//a[(.)='Return to Password Sign In']")
    public WebElement returnToPasswordLnk;

    @FindBy(how = How.ID, using = "formSubmitButton")
    private WebElement continueBtn;

    /**
     * verifyForgotPasswordScreen() - Verifies user landed in the Forgot Password screen
     */
    public void verifyForgotPasswordScreen() {
        elementHelpers.webElementIsDisplayed(flexshopperLogo);
        elementHelpers.webElementIsDisplayed(resetYourPasswordTxt);
        elementHelpers.webElementIsDisplayed(passwordResetOptionsTxt);
        elementHelpers.webElementIsDisplayed(emailRadioBtn);
        elementHelpers.webElementIsDisplayed(sendEmailToTxt);
        //TODO: elementHelpers.webElementIsDisplayed(emailValueTxt);
        elementHelpers.webElementIsDisplayed(returnToPasswordLnk);
        elementHelpers.webElementIsDisplayed(continueBtn);
    }

    /**
     * verifyEmailOptions() - Verifies Email information is shown in PP3's Forgot Password screen
     */
    public void verifyEmailOptions(String email) {
        assertTrue(elementHelpers.webElementIsDisplayed(emailRadioBtn));
        assertTrue(elementHelpers.webElementIsDisplayed(sendEmailToTxt));
        //TODO: assertTrue(elementHelpers.webElementIsDisplayed(emailValueTxt));
        //TODO: assertEquals(WebElementHelpers.webGetText(emailValueTxt), email);
    }

    /**
     * verifySMSOptions() - Verifies Phone information is shown in PP3's Forgot Password screen
     */
    public void verifySMSOptions(String phoneNumber) {
        assertTrue(elementHelpers.webElementIsDisplayed(phoneNumberRadioBtn));
        assertTrue(elementHelpers.webElementIsDisplayed(sendSMAToTxt));
        assertTrue(elementHelpers.webElementIsDisplayed(phoneNumberTxt));
        assertEquals(WebElementHelpers.webGetText(phoneNumberTxt), phoneNumber);
    }

    /**
     * verifySMSOptionsNotShown() - Verifies Phone information is not shown in PP3's Forgot Password screen
     */
    public void verifySMSOptionsNotShown() {
        assertTrue(elementHelpers.webElementIsInvisible(phoneNumberRadioBtn));
        assertTrue(elementHelpers.webElementIsInvisible(sendSMAToTxt));
        assertTrue(elementHelpers.webElementIsInvisible(phoneNumberTxt));
    }
}
