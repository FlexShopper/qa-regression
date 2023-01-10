package pages.pp3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.helpers.SelectHelpers;
import utils.helpers.WaitHelpers;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class PersonalInfoPage extends EmailPage {
    protected SelectHelpers selectHelpers = new SelectHelpers();
    Properties browserProps = new Properties();

    /**
     * Elements - PP3's Personal Info Screen
     */
    @FindBy(how = How.XPATH, using = "//h2[text()='Profile Info']")
    private WebElement profileInfoTab;

    @FindBy(how = How.XPATH, using = "//h2[text()='Personal Info']")
    private WebElement personalInfoTab;

    @FindBy(how = How.NAME, using = "dob")
    private WebElement dobPP3;

    @FindBy(how = How.ID, using = "ssn-input")
    private WebElement ssnPP3;

    @FindBy(how = How.ID, using = "monthlyIncome-input")
    private WebElement grossMonthlyIncome;

    @FindBy(how = How.NAME, using = "payFrequency")
    private WebElement payFrequency;

    @FindBy(how=How.ID, using = "isLegalTermsChecked-checkBoxRadio")
    private WebElement agreementCheckBox;

    // TODO: Check Text: By checking here and clicking "Continue",  you understand and agree that you are providing written authorization to FlexShopper LLC and its affiliates and/or assigns (“Flexshopper”) under the Fair Credit Reporting Act authorizing FlexShopper to obtain information from your personal consumer report or other information from third-party sources.  You authorize FlexShopper to obtain such information to verify your personal and financial information. We may obtain information about you, including information from your bank and/or a consumer reporting agency, and you agree to be legally bound by the terms of our
    // TODO: Check Link: Arbitration Agreement
    // TODO: Check Link: ESIGN Disclosure
    // TODO: Check Link: Terms of Use
    // TODO: Check Link: Privacy Policy
    // TODO: Check Link: Terms of Use

    @FindBy(how=How.ID, using = "teleMarketingConsent-checkBoxRadio")
    private WebElement telemarketingCheckBox;

    // TODO: Check Text: By checking here and clicking "Continue", you authorize FlexShopper (or our service providers) to make telemarketing calls and deliver sales and marketing text messages to 234-567-8900 using an automatic telephone dialing system or an artificial or prerecorded voice. A machine may play messages automatically when the phone is answered, whether by you, someone else or a recording device. You understand that standard message and data rates may apply, and you agree that we are not liable to reimburse you. You can withdraw this consent at any time by
    // TODO: Check Link: contact us page

    @FindBy(how = How.ID, using = "formSubmitButton")
    private WebElement ContinueBtn;

    /**
     * verifyProfileInfoScreen() - Verify PP3's Profile Info Screen with "Enter Address Manually" link shown
     */
    public void verifyPersonalInfoScreen() throws ExecutionException, InterruptedException {
        WaitHelpers.waitFluentWait(dobPP3, 240);
        WaitHelpers.waitForStaleElement(dobPP3);
        instanceOf(EmailPage.class).verifyHeader();


        // Verify elements are displayed
        //TODO: elementHelpers.webElementIsDisplayed(profileInfoTab);
        //TODO: elementHelpers.webElementIsDisplayed(personalInfoTab);
        elementHelpers.webElementIsDisplayed(dobPP3);
        elementHelpers.webElementIsDisplayed(ssnPP3);
        elementHelpers.webElementIsDisplayed(grossMonthlyIncome);
        elementHelpers.webElementIsDisplayed(payFrequency);
        elementHelpers.webElementIsDisplayed(agreementCheckBox);
        //TODO: elementHelpers.webElementIsDisplayed(agreementTxt);
        //TODO: elementHelpers.webElementIsDisplayed(telemarketingCheckBox);
        //TODO: elementHelpers.webElementIsDisplayed(telemarketingTxt);
        elementHelpers.webElementIsDisplayed(continueBtn);
        // TODO: Verify PP3's Footer
    }

    /**
     * enterDOB() - Enter Date of Birth (DOB)
     * @param dob
     */
    public void enterDOB(String dob) {
        elementHelpers.webSendKeys(dobPP3, dob, false);
    }

    /**
     * enterSSN() - Enter Social Security Number (SSN)
     * @param ssn
     */
    public void enterSSN(String ssn) {
        elementHelpers.webSendKeys(ssnPP3, ssn, false);
    }

    /**
     * enterIncome() - Enter Gross Monthly Income
     * @param income
     */
    public void enterIncome(String income) {
        elementHelpers.webSendKeys(grossMonthlyIncome, income, false);
    }

    /**
     * selectPayFrequency() - Selects Pay Frequency
     * @param paymentFrequency
     */
    public void selectPayFrequency(String paymentFrequency) throws IOException {
        elementHelpers.webClick(payFrequency);
        browserProps.load(Files.newInputStream(Paths.get("src/test/resources/config.properties")));
        String browser = browserProps.getProperty("browserName");
        if (browser.toLowerCase().contains("chromeMobileEmulator".toLowerCase())) {
                selectHelpers.selectFromDropdownOptionTag(paymentFrequency);
        } else {
            selectHelpers.selectFromDropdown(paymentFrequency);
        }
    }

    /**
     * selectAgreementCheckBox() - Clicks on the "Agreement" radio button
     */
    public void selectAgreementCheckBox() {
        elementHelpers.webClickJSExecutor(agreementCheckBox);
    }
}
