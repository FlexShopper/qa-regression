package pages.pp3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.helpers.WaitHelpers;

public class ProfileInfoPage extends EmailPage {
    /**
     * Elements - PP3's Profile Info Screen
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
    private WebElement state;

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
     * verifyProfileInfoScreen() - Verify PP3's Profile Info Screen with "Enter Address Manually" link shown
     */
    public void verifyProfileInfoScreen() {
        WaitHelpers.waitPageToLoad(6);
        elementHelpers.webElementIsDisplayed(profileInfoTab);
        // TODO: elementHelpers.weElementIsDisplayed(emailAddressTxt);
        elementHelpers.webElementIsDisplayed(notYouBtn);
        elementHelpers.webElementIsDisplayed(firstName);
        elementHelpers.webElementIsDisplayed(lastName);
        elementHelpers.webElementIsDisplayed(mobilePhone);
        elementHelpers.webElementIsDisplayed(homeAddress);
        elementHelpers.webElementIsDisplayed(enterManualLink);
        // TODO: elementHelpers.weElementIsDisplayed(signMeUpBtn);
        elementHelpers.webElementIsDisplayed(continueBtn);
    }

    /**
     * verifyProfileInfoScreenWithHiddenFields() - Verify PP3's Profile Info Screen showing hidden address fields
     */
    public void verifyProfileInfoScreenWithHiddenFields() {
        elementHelpers.webElementIsDisplayed(profileInfoTab);
        // TODO: elementHelpers.weElementIsDisplayed(emailAddressTxt);
        elementHelpers.webElementIsDisplayed(notYouBtn);
        elementHelpers.webElementIsDisplayed(firstName);
        elementHelpers.webElementIsDisplayed(lastName);
        elementHelpers.webElementIsDisplayed(mobilePhone);
        elementHelpers.webElementIsDisplayed(homeAddress);
        elementHelpers.webElementIsDisplayed(unitNumber);
        elementHelpers.webElementIsDisplayed(city);
        elementHelpers.webElementIsDisplayed(state);
        elementHelpers.webElementIsDisplayed(zipCode);
        // TODO: elementHelpers.weElementIsDisplayed(signMeUpBtn);
        elementHelpers.webElementIsDisplayed(continueBtn);
    }

    /**
     * enterFirstName() - Enter First Name
     * @param name
     */
    public void enterFirstName(String name){
        elementHelpers.webSendKeys(firstName, name, true);
    }

    /**
     * enterLastName() - Enter Last Name
     * @param surname
     */
    public void enterLastName(String surname){
        elementHelpers.webSendKeys(lastName, surname, true);
    }

    /**
     * enterMobileNumber() - Enter Mobile Number
     * @param mobile
     */
    public void enterMobileNumber(String mobile){
        elementHelpers.webSendKeys(mobilePhone, mobile, true);
    }

    /**
     * enterAddress() - Enter Address
     * @param address
     */
    public void enterAddress(String address){
        elementHelpers.webSendKeys(homeAddress, address, true);
    }

    /**
     * clickOnEnterAddressManuallyLnk() - Clicks on the "Enter Address Manually" link
     */
    public void clickOnEnterAddressManuallyLnk(){
        // TODO: Move to element
        elementHelpers.webClickJSExecutor(enterManualLink);
    }

    /**
     * enterUnitNumber() - Enter Unit Number
     * @param unit
     */
    public void enterUnitNumber(String unit){
        elementHelpers.webSendKeys(unitNumber, unit, true);
    }

    /**
     * enterCity() - Enter City
     * @param cityOfResidence
     */
    public void enterCity(String cityOfResidence){
        elementHelpers.webSendKeys(city, cityOfResidence, true);
    }

    /**
     * enterState() - Enter State or Region
     * @param region
     */
    public void enterState(String region){
        elementHelpers.webSendKeys(state, region, true);
    }

    /**
     * enterState() - Enter State or Region
     * @param postalCode
     */
    public void enterZipCode(String postalCode){
        elementHelpers.webSendKeys(zipCode, postalCode, true);
    }
}
