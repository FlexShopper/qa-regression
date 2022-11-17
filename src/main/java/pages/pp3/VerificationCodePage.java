package pages.pp3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.helpers.RetrieveEmailVerificationCode;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class VerificationCodePage extends EmailPage {
    /**
     * Elements - PP3's Verification Code Popup Screen
     */
    @FindBy(how = How.XPATH, using = "//h1[(.)='We sent you a code']")
    private WebElement codeSentTxt;

    @FindBy(how = How.XPATH, using = "//p[text()='Enter verification code we sent to']")
    private WebElement enterCodeTxt;

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[3]/div/div/div/div/div/div/p/span")
    private WebElement emailTxt;

    @FindBy(how = How.ID,using = "code-input")
    private WebElement securityCode;

    @FindBy(how = How.XPATH, using = "//button[(.)='No code received?']")
    private WebElement noCodeLink;

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[3]/div/div/div/div/div/div/button[2]")
    private WebElement submitBtn;

    /**
     * verifyVerificationCodeScreen() - Verifies user landed in the Verification Code screen
     */
    public void verifyVerificationCodeScreen() {
        elementHelpers.webElementIsDisplayed(codeSentTxt);
        elementHelpers.webElementIsDisplayed(enterCodeTxt);
        elementHelpers.webElementIsDisplayed(emailTxt);
        elementHelpers.webElementIsDisplayed(securityCode);
        elementHelpers.webElementIsDisplayed(noCodeLink);
        elementHelpers.webElementIsDisplayed(submitBtn);
    }

    /**
     * retrievesTheVerificationCodeFromEmail() - System retrieves the Verification Code from the email
     */
    public void retrievesTheVerificationCodeFromEmail() throws InterruptedException {
        Thread.sleep(5000); //TODO: Replace this with a Java ScheduledExecutorService or other form of wait
        String PassCode = RetrieveEmailVerificationCode.check("imap.gmail.com", "imap", "FlexShopperAutomation@gmail.com", "wpbpstzzakmrcqgu");
        System.out.println("PassCode is " + PassCode);
        elementHelpers.webSendKeys(securityCode, PassCode, true);
    }

    /**
     * clickOnSubmitBtn() - Click on the Submit button
     */
    public void clickOnSubmitBtn() {
            elementHelpers.webClick(submitBtn);
    }

    /**
     * clickOnSubmitBtn() - Click on the Submit button
     */
    public void clickOnNoCodeReceivedLnk() {
        elementHelpers.webClick(noCodeLink);
    }
}
