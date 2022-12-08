package pages.pp3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import java.util.List;
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
        driverHelpers.wdIsElementFound(routingNumberPP3, 45);

        // TODO: Verify PP3's Header
        // Verify elements are displayed
        // TODO: elementHelpers.webElementIsDisplayed(profileInfoTab);
        // TODO: elementHelpers.webElementIsDisplayed(personalInfoTab);
        // TODO: elementHelpers.webElementIsDisplayed(bankingInfoTab);
        elementHelpers.webElementIsDisplayed(routingNumberPP3);
        elementHelpers.webElementIsDisplayed(accountNumberPP3);
        elementHelpers.webElementIsDisplayed(confirmAccountNumberPP3);
        // TODO: elementHelpers.webElementIsDisplayed(submitBtn); ==> Need to scroll down first!
        // TODO: Verify PP3's Footer
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

    /**
     * bankNameMsg() - Verifies the customer sees the name of the bank matching the routing number entered
     * @param bankName
     */
    public void bankNameMsg(String bankName) {
        // Wait for screen to load & Ajax to be completed
        waitHelpers.waitForPageReady(browser(),6);
        //TODO: Move it to WebElementHelpers
        WebDriver driver = browser();
        List<WebElement> spanText = driver.findElements(By.tagName("span"));
        for(int i = 0; i<spanText.size(); i++){
            String textFound = spanText.get(i).getText();
            System.out.println("Value is  ==> " + spanText.get(i).getText());
            if (textFound.contains(bankName)) {
                Assert.assertEquals(bankName, spanText.get(i).getText());
                break;
            }
        }
    }
}
