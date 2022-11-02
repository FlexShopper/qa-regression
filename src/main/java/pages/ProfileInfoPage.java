package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProfileInfoPage extends EmailPage {
    /**
     * Elements - Profile Info Screen
     */
    @FindBy(how = How.XPATH, using = "//h2[text()='Profile Info']")
    public WebElement profileInfoTab;

    @FindBy(how = How.CSS, using = "h3.sc-TOsTZ.iBTFfQ.sc-kLIISr.gdrpxe")
    public WebElement emailAddressTxt;

    @FindBy(how = How.ID, using = "notYou-button")
    private WebElement notYouBtn;

    @FindBy(how = How.ID, using = "firstName-input")
    private WebElement firstName;

    @FindBy(how = How.ID, using = "lastName-input")
    private WebElement lastName;

    @FindBy(how = How.ID, using = "phone1-input")
    private WebElement mobilePhone;

    @FindBy(how = How.ID, using = "street1-input")
    private WebElement homeAddress;

    @FindBy(how = How.ID, using = "enterManualLink")
    private WebElement enterManualLink;

    @FindBy(how = How.ID, using = "street2-input")
    private WebElement unitNumber;

    @FindBy(how = How.ID, using = "city-input")
    private WebElement city;

    @FindBy(how = How.ID, using = "region-input")
    private WebElement region;

    @FindBy(how = How.ID, using = "postalCode-input")
    private WebElement postalCode;

    @FindBy(how =How.CSS, using = ".sc-jhAzac.dVrxkJ")
    public WebElement signMeUpBtn;

    // TODO: Check Text: Sign me up to receive the latest news on FlexShopper and MyFlexLending products and promotions. We respect your privacy. Please view our
    // TODO: Check Link "Privacy Policy"

    @FindBy(how = How.ID, using = "postalCode-input")
    private WebElement zipCode;

    @FindBy(how =How.XPATH, using = "//*[@id='formSubmitButton']/span")
    private WebElement continueBtn;

    /**
     * Validation Messages
     */
    @FindBy(how = How.XPATH, using = "(//span[(.)='No special characters'])[1]")
    public WebElement errMsgFirstNameField;

    @FindBy(how = How.XPATH, using = "(//span[(.)='No special characters'])[2]")
    public WebElement errMsgLastNameField;

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div/div/div/form/div/div[4]/div/span[2]")
    public WebElement errMsfMobileField;

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div/div/div/form/div/div[5]/div/div[2]/div[2]/div[2]/div/span[2]")
    public WebElement errMsgZipCode;

    /**
     * Verify PP3's Profile Info Screen
     */
    public void verifyProfileInfoScreen() {
        elementHelpers.weElementIsDisplayed(profileInfoTab);
        // TODO: elementHelpers.weElementIsDisplayed(emailAddressTxt);
        elementHelpers.weElementIsDisplayed(notYouBtn);
        elementHelpers.weElementIsDisplayed(firstName);
        elementHelpers.weElementIsDisplayed(lastName);
        elementHelpers.weElementIsDisplayed(mobilePhone);
        elementHelpers.weElementIsDisplayed(homeAddress);
        elementHelpers.weElementIsDisplayed(enterManualLink);
        // TODO: elementHelpers.weElementIsDisplayed(signMeUpBtn);
        elementHelpers.weElementIsDisplayed(continueBtn);
    }
}
