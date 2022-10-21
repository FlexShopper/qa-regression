package flexshopper.com.pageObjects.flexshopper;

import io.appium.java_client.pagefactory.AndroidBy;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProfileInfoPage {
    public WebDriver driver;

    /**
     * Constructor & Page Initialization
     */
    public ProfileInfoPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Elements
     */
    @FindBy(how = How.XPATH, using = "//h2[text()='Profile Info']")
    public WebElement profileInfoTab;

    @AndroidBy(xpath = "//*[@nodeName='H3']")
    private WebElement emailAddressTxt;

    @FindBy(how = How.ID, using = "notYou-button")
    @AndroidBy(xpath = "//*[@id='notYou-button' and @nodeName='BUTTON']")
    public WebElement notYouBtn;

    @AndroidBy(xpath = "//*[@name='firstName']")
    private WebElement firstNameField;

    @AndroidBy(xpath = "//*[@name='lastName']")
    private WebElement lastNameField;

    @AndroidBy(xpath = "//*[@name='phone1']")
    private WebElement phoneField;

    @AndroidBy(xpath = "//*[@id='street1-input']")
    private WebElement streetField;

    @FindBy(how = How.ID, using = "enterManualLink")
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

    @AndroidBy(xpath = "//*[@id='formSubmitButton' and @nodeName='BUTTON']")
    private WebElement formSubmitBtn;

    /**
     * Classes
     */

    /**
     * userIsInProfileInfoPage() - Verify user landed in the Profile Info screen
     */
    public void userIsInProfileInfoPage() {
        Assert.assertTrue(profileInfoTab.isDisplayed());
        Assert.assertTrue(emailAddressTxt.isDisplayed());
        Assert.assertTrue(notYouBtn.isDisplayed());
        Assert.assertTrue(enterManualLink.isDisplayed());
        Assert.assertTrue(firstNameField.isDisplayed());
        Assert.assertTrue(lastNameField.isDisplayed());
        Assert.assertTrue(phoneField.isDisplayed());
        Assert.assertTrue(streetField.isDisplayed());
        Assert.assertTrue(enterManualLink.isDisplayed());
        Assert.assertTrue(signMeUpField.isDisplayed());
        Assert.assertTrue(formSubmitBtn.isDisplayed());
    }
}
