package pages.pp3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.helpers.ManageEmailTestAddresses;
import utils.helpers.WaitHelpers;
import utils.selenium.Settings;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class EmailPage {
    public WebDriver driver;
    protected ManageEmailTestAddresses emailTestAddress = new ManageEmailTestAddresses();

    public EmailPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Elements - Header
     */
    @FindBy(how = How.ID, using = "headerPanel-close-button") // Close PP3 button
    private WebElement headerCloseBtn;

    @FindBy(how = How.ID, using = "headerPanel-faq-button") // FAQ Button
    private WebElement headerFAQBtn;

    @FindBy(how = How.XPATH, using = "//*[@id='headerPanel']")
    public static By headerPanelPP3 = By.xpath("//*[@id='headerPanel']");

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

    @FindBy(how = How.XPATH, using = "//span[(.)='© 2023 FlexShopper, LLC']") // FlexShopper's Copyright
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
    public  WebElement invalidEmailAddress;

    /**
     * Navigate to PP3's Base URL
     */
    public void navigateToBaseUrl() {
        String baseUrl = Settings.baseUrl;
        driver.navigate().to(baseUrl);
    }

    /**
     * Navigate to PP3's Base URL
     */
    public void browserFullScreen() {
        driver.manage().window().fullscreen();;
    }

    /**
     * switchToFrame() - Switches to PP3's Frame
     */
    public void switchToFrame() {
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
    }

    /**
     * Verify PP3's Header
     */
    public void verifyHeader() throws InterruptedException {
        //WaitHelpers.waitFluentWait(headerCloseBtn, 240);
        Thread.sleep(20);

        // Verify elements are displayed
        //elementHelpers.webElementIsDisplayed(headerCloseBtn);
        //elementHelpers.webElementIsDisplayed(headerFAQBtn);
        headerCloseBtn.isDisplayed();
        headerFAQBtn.isDisplayed();
    }

    /**
     * Verify PP3's Email Screen
     */
    public void verifyEmailScreen() throws ExecutionException, InterruptedException {
        //WaitHelpers.waitFluentWait(emailAddressField, 240);
        Thread.sleep(20);
        WaitHelpers.waitForStaleElement(emailAddressField);

        // Verify elements are displayed
        //elementHelpers.webElementIsDisplayed(flexshopperLogo);
        //elementHelpers.webElementIsDisplayed(enterEmailTxt);
        //elementHelpers.webElementIsDisplayed(welcomeTxt);
        //elementHelpers.webElementIsDisplayed(emailAddressField);
        //elementHelpers.webElementIsDisplayed(continueBtn);
        flexshopperLogo.isDisplayed();
        enterEmailTxt.isDisplayed();
        welcomeTxt.isDisplayed();
        emailAddressField.isDisplayed();
        continueBtn.isDisplayed();
    }

    /**
     * Verify PP3's Footer
     */
    public void verifyFooter() {
        // Verify elements are displayed
        // TODO: elementHelpers.webElementIsDisplayed(flexUSPattenNumber);
        //elementHelpers.webElementIsDisplayed(flexCopyright);
        //elementHelpers.webElementIsDisplayed(footerAccessibilityBtn);
        //elementHelpers.webElementIsDisplayed(footerPrivacyBtn);
        flexCopyright.isDisplayed();
        footerAccessibilityBtn.isDisplayed();
        footerPrivacyBtn.isDisplayed();
        // TODO: assertFlexUSPattenNumber();
        // TODO: assertFlexUSCopyrightInfo();
    }

    /**
     * Assert FlexShopper's US Patten Number
     */
    public void assertFlexUSPattenNumber() {
        //Assert.assertTrue((WebElementHelpers.webGetAttribute(flexUSPattenNumber,"value")).contains("U.S. Pat. Nos. 10,089,682 & 10,282,779"));
    }

    /**
     * Assert FlexShopper's Copyright Information
     */
    public void assertFlexUSCopyrightInfo() {
        //Assert.assertTrue((WebElementHelpers.webGetAttribute(flexCopyright,"value")).contains("© 2022 FlexShopper, LLC"));
    }

    /**
     * enterEmail() - Enter email in the email address field.
     * @param email
     */
    public void enterEmail(String email) {
        //elementHelpers.webSendKeys(emailAddressField, email, true);
        emailAddressField.sendKeys(email);
    }

    /**
     * enterEmail() - Enter email in the email address field.
     * @param email
     */
    public void enterNewEmail(String email) {
        //elementHelpers.webSendKeys(emailAddressField, emailTestAddress.createEmailTestAddress(email), true);
        String Email2Send = emailTestAddress.createEmailTestAddress(email);
        emailAddressField.sendKeys(Email2Send);
    }

    /**
     * clickContinueBtn() - Click on the "Continue" button
     */
    public void clickOnContinueBtn() {
        //elementHelpers.webClickJSExecutor(continueBtn);
        continueBtn.click();
    }

    /**
     * emailValidationMessage() - Verifies the customer sees the expected Validation Message
     */
    public void emailValidationMessage(String validationMsg) {
        //TODO: Move code below to WebElementHelpers
        List<WebElement> spanText = driver.findElements(By.tagName("span"));
        for(int i = 0; i<spanText.size(); i++){
            String textFound = spanText.get(i).getText();
            System.out.println("Value is  ==> " + spanText.get(i).getText());
            if (textFound.contains("Invalid email address")) {
                //Assert.assertEquals("Invalid email address", spanText.get(i).getText());
                break;
            }
        }
    }

    /**
     * emailValidationMessage() - Verifies the customer sees the expected Validation Message
     */
    public void emailHTMLValidationMessage(String validationMsg) {
        //TODO: Move code below to WebElementHelpers
        WebElement email = driver.findElement(By.name("email"));
        String htmlValidationMsg = email.getAttribute("validationMessage");
        //Assert.assertTrue(htmlValidationMsg.contains(validationMsg));
    }
}
