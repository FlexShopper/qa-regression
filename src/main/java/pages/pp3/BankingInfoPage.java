package pages.pp3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.helpers.WaitHelpers;

import static utils.selenium.Driver.browser;

public class BankingInfoPage extends EmailPage {
    /**
     * Elements - PP3's Banking Info Screen
     */
    @FindBy(how = How.XPATH, using = "//h2[text()='Profile Info']")
    private WebElement profileInfoTab;

    @FindBy(how = How.XPATH, using = "//h2[text()='Personal Info']")
    private WebElement personalInfoTab;

    @FindBy(how = How.XPATH, using = "//h2[text()='Banking Info']")
    private WebElement bankingInfoTab;

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div/div/div[2]/div")
    private WebElement weeklyDeductionDisclaimerTxt;

    // TODO: Assert Text: After you receive your order, your weekly payments will be deducted from this account.

    @FindBy(how = How.ID, using = "routingNumber-input")
    private WebElement routingNumberPP3;

    @FindBy(how = How.ID, using = "accountNumber-input")
    private WebElement accountNumberPP3;

    @FindBy(how = How.ID, using = "confirmAccountNumber-input")
    private WebElement confirmAccountNumberPP3;

    @FindBy(how = How.XPATH, using = "formSubmitButton")
    private WebElement submitBtn;

    /**
     * verifyBankingInfoPage() - Verify PP3's Banking Info Screen
     */
    public void verifyBankingInfoPage() {
        // Wait for screen to load & Ajax to be completed
        WaitHelpers.waitForPageReady(browser(),30);

        // TODO: Verify PP3's Header
        // TODO: Verify PP3's Footer
        // TODO: elementHelpers.webElementIsDisplayed(profileInfoTab);
        // TODO: elementHelpers.webElementIsDisplayed(personalInfoTab);
        elementHelpers.webElementIsDisplayed(bankingInfoTab);
        elementHelpers.webElementIsDisplayed(routingNumberPP3);
        elementHelpers.webElementIsDisplayed(accountNumberPP3);
        elementHelpers.webElementIsDisplayed(confirmAccountNumberPP3);
        // TODO: elementHelpers.webElementIsDisplayed(submitBtn);
    }

    /**
     * enterRoutingNumber() - Enter Routing Number
     * @param routingNumber
     */
    public void enterRoutingNumber(String routingNumber) {
        elementHelpers.webSendKeys(routingNumberPP3, routingNumber, true);
    }

    /**
     * enterAccountNumber() - Enter Account Number
     * @param accountNumber
     */
    public void enterAccountNumber(String accountNumber) {
        elementHelpers.webSendKeys(accountNumberPP3, accountNumber, true);
    }

    /**
     * enterDOB() - Enter Date of Birth (DOB)
     * @param confirmAccountNumber
     */
    public void confirmAccountNumber(String confirmAccountNumber) {
        elementHelpers.webSendKeys(confirmAccountNumberPP3, confirmAccountNumber, true);
    }
}
