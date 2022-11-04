package pages.pp3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankingInfoPage {
    /**
     * Elements - PP3's Banking Info Screen
     */
    @FindBy(how = How.XPATH, using = "//h2[text()='Banking Info']")
    public WebElement bankingInfoTab;

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div/div/div[2]/div")
    public WebElement weeklyDeductionDisclaimerTxt;

    // TODO: Assess Text: After you receive your order, your weekly payments will be deducted from this account.

    @FindBy(how = How.ID, using = "routingNumber-input")
    private WebElement routingNumberPP3;

    @FindBy(how = How.ID, using = "accountNumber-input")
    private WebElement accountNumberPP3;

    @FindBy(how = How.ID, using = "confirmAccountNumber-input")
    private WebElement confirmAccountNumberPP3;

    @FindBy(how = How.XPATH, using = "formSubmitButton")
    private WebElement submitBtn;
}
