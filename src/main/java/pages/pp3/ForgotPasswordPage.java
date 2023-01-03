package pages.pp3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.helpers.WaitHelpers;

import java.util.concurrent.ExecutionException;

public class ForgotPasswordPage {
    //protected WebElementHelpers elementHelpers = new WebElementHelpers();

    public ForgotPasswordPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /**
     * Elements - PP3's Forgot Password Screen
     */
    @FindBy(how = How.CSS, using = "#subtitle > img")
    private WebElement flexshopperLogo;

    @FindBy(how = How.XPATH, using = "//h3[normalize-space(.)='How would you like to reset your password? You can verify by email or request a text to be sent to the mobile number linked to your account.']")
    private WebElement resetYourPasswordTxt;

    @FindBy(how = How.XPATH, using = "//p[(.)='Please choose one of the options below:']")
    private WebElement passwordResetOptionsTxt;

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div[2]/div/div/label[1]/div[1]")
    private WebElement emailRadioBtn;

    @FindBy(how = How.XPATH, using = "//span[(.)='Send email to:']")
    private WebElement sendEmailToTxt;

    @FindBy(how = How.CSS, using = "span.sc-gVyKpa.dgqWCN")
    private WebElement emailValueTxt;

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div[2]/div/div/label[2]/div[1]")
    private WebElement smsRadioBtn;

    @FindBy(how = How.XPATH, using = "//span[(.)='xxx-xxx-2917']")
    private WebElement phoneNumberTxt;

    @FindBy(how = How.XPATH, using = "//span[(.)='Send SMS text with code to:']")
    private WebElement sendSMAToTxt;

    @FindBy(how = How.XPATH, using = "//a[(.)='Return to Password Sign In']")
    private WebElement returnToPasswordLnk;

    @FindBy(how = How.ID, using = "formSubmitButton")
    private WebElement submitBtn;

    /**
     * verifyForgotPasswordScreen() - Verifies user landed on the Forgot Password screen
     */
    public void verifyForgotPasswordScreen() throws ExecutionException, InterruptedException {
        //WaitHelpers.waitFluentWait(continueBtn, 240);
        WaitHelpers.waitForStaleElement(submitBtn);
        //TODO: instanceOf(EmailPage.class).verifyHeader();

        // Verify elements are displayed
        //TODO: elementHelpers.webElementIsDisplayed(flexshopperLogo);
        //TODO: elementHelpers.webElementIsDisplayed(resetYourPasswordTxt);
        //TODO: elementHelpers.webElementIsDisplayed(passwordResetOptionsTxt);
        //TODO: elementHelpers.webElementIsDisplayed(emailRadioBtn);
        sendEmailToTxt.isDisplayed();
        //TODO: elementHelpers.webElementIsDisplayed(emailValueTxt);
        returnToPasswordLnk.isDisplayed();
        submitBtn.isDisplayed();
        // TODO: Verify PP3's Footer
    }

    /**
     * verifyEmailOptions() - Verifies Email information is shown in PP3's Forgot Password screen
     */
    public void verifyEmailOptions(String email) {
        //Assert.assertTrue(elementHelpers.webElementIsDisplayed(emailRadioBtn));
        //Assert.assertTrue(elementHelpers.webElementIsDisplayed(sendEmailToTxt));
        //TODO: assertTrue(elementHelpers.webElementIsDisplayed(emailValueTxt));
        //TODO: assertEquals(WebElementHelpers.webGetText(emailValueTxt), email);
    }

    /**
     * verifySMSOptions() - Verifies Phone information is shown in PP3's Forgot Password screen
     */
    public void verifySMSOptions(String phoneNumber) {
        //Assert.assertTrue(elementHelpers.webElementIsDisplayed(smsRadioBtn));
        //Assert.assertTrue(elementHelpers.webElementIsDisplayed(sendSMAToTxt));
        //Assert.assertTrue(elementHelpers.webElementIsDisplayed(phoneNumberTxt));
        //TODO: assertEquals(WebElementHelpers.webGetText(phoneNumberTxt), phoneNumber);
    }

    /**
     * clickOnReturnToPasswordLink() - Clicks on the Return to Password Sign In link
     */
    public void clickOnReturnToPasswordLink() {
        //elementHelpers.webClick(returnToPasswordLnk);
        returnToPasswordLnk.click();
    }

    /**
     * verifyEmailRadioButtonIsSelected() - Verifies if the Email radio button is selected or not
     */
    public void verifyEmailRadioButtonIsSelected() {
        //elementHelpers.webElementIsSelected(emailRadioBtn);
        emailRadioBtn.isSelected();
    }

    /**
     * verifySMSRadioButtonIsSelected() - Verifies if the SMS radio button is selected or not
     */
    public void verifySMSRadioButtonIsSelected() {
        //elementHelpers.webElementIsSelected(smsRadioBtn);
        smsRadioBtn.isSelected();
    }
}
