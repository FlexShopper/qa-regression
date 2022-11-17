package pages.pp3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import pages.Page;
import utils.helpers.WebDriverHelpers;
import utils.helpers.WebElementHelpers;
import utils.selenium.Settings;
import static utils.selenium.Driver.browser;

public class EmailPage extends Page {
    protected WebElementHelpers elementHelpers = new WebElementHelpers();
    protected WebDriverHelpers driverHelpers = new WebDriverHelpers();

    /**
     * Elements - Header
     */
    @FindBy(how = How.ID, using = "headerPanel-close-button") // Close PP3 button
    private WebElement headerCloseBtn;

    @FindBy(how = How.ID, using = "headerPanel-faq-button") // FAQ Button
    private WebElement headerFAQBtn;

    /**
     * Elements - PP3's Email Screen
     */
    @FindBy(how = How.CSS, using = "svg > .cls-1:nth-child(8)")
    private WebElement flexshopperLogo;

    @FindBy(how = How.XPATH, using = "//h3[normalize-space(.)='Enter your email address to sign in or begin application for a spending limit of up to $2,500 to shop today.']")
    private WebElement enterEmailTxt;

    @FindBy(how = How.XPATH, using = "//h3[(.)='Welcome to']")
    public WebElement welcomeTxt;

    @FindBy(how = How.ID, using = "email-input")
    private WebElement emailAddressField;

    @FindBy(how = How.ID, using = "formSubmitButton")
    protected WebElement continueBtn;

    /**
     * Elements - Footer
     */
    @FindBy(how = How.XPATH, using = "//footer[(.)='U.S. Pat. Nos. 10,089,682 & 10,282,779']") // FlexShopper's US Patten
    private WebElement flexUSPattenNumber;

    @FindBy(how = How.XPATH, using = "//span[(.)='© 2022 FlexShopper, LLC']") // FlexShopper's Copyright
    private WebElement flexCopyright;

    @FindBy(how = How.ID, using = "footer-accessibility-button") // Accessibility button
    private WebElement footerAccessibilityBtn;

    @FindBy(how = How.ID, using = "footer-terms-button") // Terms button
    private WebElement footerTermsBtn;

    @FindBy(how = How.ID, using = "footer-privacy-button") // Privacy button
    private WebElement footerPrivacyBtn;

    /**
     * Validation Messages
     */
    @FindBy(how= How.XPATH, using = "//span[@label='Invalid email address']")
    public  WebElement invalidEmailAddressErrorMsg;

    /**
     * Navigate to PP3's Base URL
     */
    public void navigateToBaseUrl() {
        String baseUrl = Settings.baseUrl;
        browser().navigate().to(baseUrl);
    }

    /**
     * Navigate to PP3's Base URL
     */
    public void browserFullScreen() {
        driverHelpers.wdDriverFullScreen();
    }

    /**
     * switchToFrame() - Switches to PP3's Frame
     */
    public void switchToFrame() {
        driverHelpers.wdSwitchToFrame();
    }

    /**
     * Verify PP3's Header
     */
    public void verifyHeader() throws InterruptedException {
        Thread.sleep(3000); //TODO: Replace this with a Java ScheduledExecutorService or other form of wait
        elementHelpers.webElementIsDisplayed(headerCloseBtn);
        elementHelpers.webElementIsDisplayed(headerFAQBtn);
    }

    /**
     * Verify PP3's Email Screen
     */
    public void verifyEmailScreen() {
        elementHelpers.webElementIsDisplayed(flexshopperLogo);
        elementHelpers.webElementIsDisplayed(enterEmailTxt);
        elementHelpers.webElementIsDisplayed(welcomeTxt);
        elementHelpers.webElementIsDisplayed(emailAddressField);
        elementHelpers.webElementIsDisplayed(continueBtn);
    }

    /**
     * Verify PP3's Footer
     */
    public void verifyFooter() {
        // TODO: elementHelpers.webElementIsDisplayed(flexUSPattenNumber);
        elementHelpers.webElementIsDisplayed(flexCopyright);
        elementHelpers.webElementIsDisplayed(footerAccessibilityBtn);
        elementHelpers.webElementIsDisplayed(footerPrivacyBtn);
        // TODO: assertFlexUSPattenNumber();
        // TODO: assertFlexUSCopyrightInfo();
    }

    /**
     * Assert FlexShopper's US Patten Number
     */
    public void assertFlexUSPattenNumber() {
        Assert.assertTrue((WebElementHelpers.webGetAttribute(flexUSPattenNumber,"value")).contains("U.S. Pat. Nos. 10,089,682 & 10,282,779"));
    }

    /**
     * Assert FlexShopper's Copyright Information
     */
    public void assertFlexUSCopyrightInfo() {
        Assert.assertTrue((WebElementHelpers.webGetAttribute(flexCopyright,"value")).contains("© 2022 FlexShopper, LLC"));
    }

    /**
     * enterEmail() - Enter email in the email address field.
     * @param email
     */
    public void enterEmail(String email) {
        elementHelpers.webSendKeys(emailAddressField, email, true);
    }

    /**
     * clickContinueBtn() - Click on the "Continue" button
     */
    public void clickOnContinueBtn() {
        elementHelpers.webClick(continueBtn);
    }

    /**
     * emailValidationMessage() - Verifies the customer sees the expected Validation Message
     */
    public void emailValidationMessage(String validationMsg) {
        Assert.assertEquals("Invalid email address", WebElementHelpers.webGetText(invalidEmailAddressErrorMsg));
    }
}
