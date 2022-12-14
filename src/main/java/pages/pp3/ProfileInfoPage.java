package pages.pp3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import utils.helpers.SelectHelpers;
import utils.helpers.WaitHelpers;
import utils.helpers.WebElementHelpers;
import java.util.concurrent.ExecutionException;

public class ProfileInfoPage extends EmailPage {
    protected WebElementHelpers elementHelpers = new WebElementHelpers();
    protected SelectHelpers selectHelpers = new SelectHelpers();

    /**
     * Elements - PP3's Profile Info Screen
     */
    @FindBy(how = How.XPATH, using = "//h2[text()='Profile Info']")
    private WebElement profileInfoTab;

    @FindBy(how = How.CSS, using = "h3.sc-TOsTZ.iBTFfQ.sc-kLIISr.gdrpxe")
    private WebElement emailAddressTxt;

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

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div/div/div/form/div/div[5]/div/div[2]/div[2]/ul")
    private WebElement suggestedAddresses;

    @FindBy(how = How.XPATH, using = "//*[@id=\"enterManualLink\"]")
    private WebElement enterManualLink;

    @FindBy(how = How.ID, using = "street2-input")
    private WebElement unitNumber;

    @FindBy(how = How.ID, using = "city-input")
    private WebElement city;

    @FindBy(how = How.NAME, using = "region")
    private WebElement state;

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div/div/div/form/div/div[5]/div/div[2]/div[2]/div[1]/div[2]/div[2]/ul")
    private WebElement listOfStates;

    @FindBy(how = How.ID, using = "postalCode-input")
    private WebElement postalCode;

    @FindBy(how =How.ID, using = "emailConsent-checkBoxRadio")
    private WebElement signMeUpBtn;

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
    private WebElement errMsgFirstNameField;

    @FindBy(how = How.XPATH, using = "(//span[(.)='No special characters'])[2]")
    private WebElement errMsgLastNameField;

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div/div/div/form/div/div[4]/div/span[2]")
    private WebElement errMsfMobileField;

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div/div/div/form/div/div[5]/div/div[2]/div[2]/div[2]/div/span[2]")
    private WebElement errMsgZipCode;

    /**
     * verifyProfileInfoScreen() - Verify PP3's Profile Info Screen with "Enter Address Manually" link shown
     */
    public void verifyProfileInfoScreen() throws ExecutionException, InterruptedException {
        WaitHelpers.waitFluentWait(firstName, 240);
        WaitHelpers.waitForStaleElement(firstName);
        // TODO: instanceOf(EmailPage.class).verifyHeader();

        // Verify elements are displayed
        // TODO: elementHelpers.webElementIsDisplayed(profileInfoTab);
        // TODO: elementHelpers.weElementIsDisplayed(emailAddressTxt);
        elementHelpers.webElementIsDisplayed(notYouBtn);
        elementHelpers.webElementIsDisplayed(firstName);
        elementHelpers.webElementIsDisplayed(lastName);
        elementHelpers.webElementIsDisplayed(mobilePhone);
        elementHelpers.webElementIsDisplayed(homeAddress);
        elementHelpers.webElementIsDisplayed(enterManualLink);
        // TODO: elementHelpers.weElementIsDisplayed(signMeUpBtn);
        elementHelpers.webElementIsDisplayed(continueBtn);
        // TODO: Verify PP3's Footer
    }

    /**
     * verifyProfileInfoScreenWithHiddenFields() - Verify PP3's Profile Info Screen showing hidden address fields
     */
    public void verifyProfileInfoScreenWithHiddenFields() throws ExecutionException, InterruptedException {
        WaitHelpers.waitFluentWait(city, 240);
        WaitHelpers.waitForStaleElement(city);
        // TODO: instanceOf(EmailPage.class).verifyHeader();

        // Verify elements are displayed
        elementHelpers.webElementIsDisplayed(unitNumber);
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
     * verifyEmailAddressIsNotHis() - Verifies the email provided does not match the expected one
     * @param emailEntered
     */
    public void verifyEmailAddressIsNotHis(String emailEntered) {
        Assert.assertNotEquals(emailEntered, "expectedEmail@flexshopper.com");
    }

    /**
     * verifySuggestedAddressesDisplayed() - Verify Suggested Addresses are displayed
     */
    public void verifySuggestedAddressesDisplayed() {
        // TODO: Assert.assertTrue(selectHelpers.optionsReturned());
    }

    /**
     * verifySuggestedAddressesNotDisplayed() - Verify Suggested Addresses are not displayed
     */
    public void verifySuggestedAddressesNotDisplayed() {
        Assert.assertTrue(elementHelpers.webElementIsInvisible(suggestedAddresses));
    }

    /**
     * selectFromSuggestedAddresses() - Selects from the Suggested Addresses returned
     * @param withText
     */
    public void selectFromSuggestedAddresses(String withText) {
        selectHelpers.selectFromDropdown(withText);
    }

    /**
     * enterFirstName() - Enter First Name
     * @param name
     */
    public void enterFirstName(String name){;
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
        elementHelpers.webClickJSExecutor(enterManualLink);
    }

    /**
     * enterUnitNumber() - Enter Unit Number
     * @param unit
     */
    public void enterUnitNumber(String unit){
        elementHelpers.webSendKeys(unitNumber, unit, false);
    }

    /**
     * enterCity() - Enter City
     * @param cityOfResidence
     */
    public void enterCity(String cityOfResidence){
        elementHelpers.webSendKeys(city, cityOfResidence, false);
    }

    /**
     * enterState() - Enter State or Region
     * @param region
     */
    public void selectState(String region) {
        elementHelpers.webSendKeys(state, region, false);
        selectHelpers.selectFromDropdown(region);
    }

    /**
     * enterZipCode() - Enter Zip Code
     * @param postalCode
     */
    public void enterZipCode(String postalCode) {
        elementHelpers.webSendKeys(zipCode, postalCode, false);
    }

    /**
     * selectSignMeUpBtn() - Clicks on the "Sign me up..." radio button
     */
    public void selectSignMeUpBtn() {
        elementHelpers.webClickJSExecutor(signMeUpBtn);
    }
}
