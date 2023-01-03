package pages.pp3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.helpers.RetrieveEmailVerificationCode;
import utils.helpers.WaitHelpers;

import java.util.concurrent.ExecutionException;

public class VerificationCodePage {
    public VerificationCodePage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

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
    public void verifyVerificationCodeScreen() throws ExecutionException, InterruptedException {
        //WaitHelpers.waitFluentWait(securityCode, 240);
        WaitHelpers.waitForStaleElement(securityCode);

        // Verify elements are displayed
        codeSentTxt.isDisplayed();
        enterCodeTxt.isDisplayed();
        emailTxt.isDisplayed();
        securityCode.isDisplayed();
        noCodeLink.isDisplayed();
        submitBtn.isDisplayed();
    }

    /**
     * retrievesTheVerificationCodeFromEmail() - System retrieves the Verification Code from the email
     */
    public void retrievesTheVerificationCodeFromEmail() throws InterruptedException {
        Thread.sleep(5000); //TODO: Replace this with a Java ScheduledExecutorService or other form of wait
        String PassCode = RetrieveEmailVerificationCode.check("imap.gmail.com", "imap", "FlexShopperAutomation@gmail.com", "tstcqpyzcqsajfeg");
        System.out.println("PassCode is " + PassCode);
        //elementHelpers.webSendKeys(securityCode, PassCode, true);
        securityCode.sendKeys(PassCode);
    }

    /**
     * clickOnSubmitBtn() - Click on the Submit button
     */
    public void clickOnSubmitBtn() {
        //elementHelpers.webClick(submitBtn);
        submitBtn.click();
    }

    /**
     * clickOnSubmitBtn() - Click on the Submit button
     */
    public void clickOnNoCodeReceivedLnk() {
        //elementHelpers.webClick(noCodeLink);
        noCodeLink.click();
    }
}
