package pages.pp3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VerificationCodePage extends EmailPage {
    /**
     * Elements - PP3's Verification Code Popup Screen
     */
    // Text: 'We sent you a code'
    @FindBy(how = How.XPATH, using = "//h1[(.)='We sent you a code']")
    private WebElement codeSentTxt;

    // Text: 'Enter verification code we sent to'
    @FindBy(how = How.XPATH, using = "//div[@id='app']/div[3]/div/div/div/div/div/div")
    private WebElement enterCodeTxt;

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[3]/div/div/div/div/div/div/p/span")
    private WebElement emailTxt;

    @FindBy(how = How.ID,using = "code-input")
    private WebElement securityCode;

    // Link: "No code received?"
    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[3]/div/div/div/div/div/div/button[1]")
    private WebElement noCodeLink;

    @FindBy(how = How.XPATH, using = "//span[(.)='Submit']")
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
     * clickOnSubmitBtn() - Click on the No Code Received link
     */
    public void clickOnNoCodeReceivedLnk() {
        elementHelpers.webClick(noCodeLink);
    }

    /**
     * clickOnSubmitBtn() - Click on the Submit button
     */
    public void clickOnSubmitBtn() {
            elementHelpers.webClick(submitBtn);
    }
}
