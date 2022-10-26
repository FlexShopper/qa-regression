package flexshopper.com.pageObjects.flexshopper;

import flexshopper.com.managers.FileReaderManager;
import io.appium.java_client.pagefactory.AndroidBy;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmailPage {
    WebDriver driver;

    /**
     * Constructor & Page Initialization
     */
    public EmailPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    /**
     * Elements
     */

    @FindBy(how = How.XPATH, using = "//h3[normalize-space(.)='Enter your email address to sign in or begin application for a spending limit of up to $2,500 to shop today.']")
    @AndroidBy(xpath = "//*[@text='Enter your email address to sign in or begin application for a spending limit of up to $2,500 to shop today.']")
    private WebElement enterEmailTxt;

    // in case if text will be edited or changed : //*[@id="app"]/div[1]/div[2]/div/div/div/div[1]/div/h3[2]
    @FindBy(how = How.XPATH, using = "//h3[(.)='Welcome to']")
    public WebElement welcomeText;

  @FindBy(how = How.ID, using = "email-input")
    @AndroidBy(xpath = "//*[@id='email-input']")
    private WebElement emailAddressField;
    
    @FindBy(how = How.ID, using = "formSubmitButton")
    @AndroidBy(xpath = "//*[@text='Continue']")
    private WebElement continueBtn;

    @AndroidBy(xpath = "//*[@name='firstName']")
    private WebElement firstNameField;

    @AndroidBy(xpath = "//*[@name='lastName']")
    private WebElement lastNameField;

    @AndroidBy(xpath = "//*[@name='phone1']")
    private WebElement phoneField;

    @AndroidBy(xpath = "//*[@id='street1-input']")
    private WebElement streetField;

    @AndroidBy(xpath = "//*[@id='enterManualLink' and @text='Enter Address Manually']")
    private WebElement enterManualLink;

    @AndroidBy(xpath = "//*[@name='street2']")
    private WebElement unitNumberField;

    @AndroidBy(xpath = "//*[@name='city']")
    private WebElement cityField;

    @AndroidBy(xpath = "//*[@name='region']")
    private WebElement regionField;

    @AndroidBy(xpath = "//*[@name='postalCode']")
    private WebElement postalCodeField;

    @AndroidBy(xpath = "//*[@text='Sign me up to receive the latest news on FlexShopper and MyFlexLending products and promotions. We respect your privacy. Please view our ']")
    private WebElement signMeUpField;



    /**
     * Validation Messages
     */
    @FindBy(how= How.XPATH, using = "//span[@label='Invalid email address']")
    @AndroidBy(xpath = "//span[@label='Invalid email address']")
    public  WebElement errMsgInvalidEmailAddress;

    /**
     * Classes
     */

    /**
     * userIsInEmailScreen() - Verify use landed in the Email screen
     */
    public void userIsInEmailScreen() {
        Assert.assertTrue(enterEmailTxt.isDisplayed());
        Assert.assertTrue(emailAddressField.isDisplayed());
        Assert.assertTrue(continueBtn.isDisplayed());
    }

    /**
     * enterEmail() - Enter email in the email address field.
     * @param email
     */
    public void enterEmail(String email) {
        emailAddressField.clear();
      emailAddressField.sendKeys(email);
    }

    /**
     * clickContinueBtn() - Click on the "Continue" button
     */
    public void clickContinueBtn() {
        WebDriverWait wait =new WebDriverWait(driver, 5);
       wait.until(ExpectedConditions.visibilityOf(continueBtn));
        continueBtn.click();
    }
    public void getEmailScreen() {
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
        // add delete cookies
    }


}
