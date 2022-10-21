package flexshopper.com.pageObjects.flexshopper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ApplyPage {
    WebDriver driver;

    public ApplyPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
     @FindBy(how = How.ID, using = "firstName-input")
     private WebElement firstNamePP3;

    @FindBy(how = How.ID, using = "lastName-input")
    private WebElement lastNamePP3;

    @FindBy(how = How.ID, using = "phone1-input")
    private WebElement phonePP3;

    @FindBy(how = How.ID, using = "enterManualLink")
    private WebElement enterAddressManuallyPP3;

    @FindBy(how = How.ID, using = "street1-input")
    private WebElement streetPP3;

    @FindBy(how = How.XPATH, using = "//*[@id='formSubmitButton']/span")
    private WebElement ContinueBtnPP3;

    @FindBy(how = How.XPATH, using = "//h2[text()='Profile Info']")
    private WebElement ProfileInfoScreenPP3;

     @FindBy(how = How.ID, using = "dob-input")
    private WebElement dobPP3;

    @FindBy(how = How.ID, using = "ssn-input")
    private WebElement ssnPP3;

    @FindBy(how = How.ID, using = "monthlyIncome-input")
    private WebElement monthlyIncomePP3;

    @FindBy(how = How.ID, using = "payFrequency-input")
    private WebElement payFrequencyPP3;

    @FindBy(how=How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div/div/form/div/div[6]/label/div[1]")
    private WebElement AgreementCheckBoxPP3;

    @FindBy(how=How.XPATH, using = "//h2[text()='Personal Info']")
    private WebElement PersonalInfoPScreenP3;

    @FindBy(how=How.XPATH, using = "//h2[.='Banking Info']")
    private WebElement BankingInfoPScreenP3;

    @FindBy(how = How.ID, using = "routingNumber-input")
    private WebElement routingNumberPP3;

    @FindBy(how = How.ID, using = "accountNumber-input")
    private WebElement accountNumberPP3;

    @FindBy(how = How.ID, using = "confirmAccountNumber-input")
    private WebElement confirmAccountNumberPP3;

    @FindBy(how = How.XPATH, using = "formSubmitButton")
    private WebElement submitBtnPP3;

    @FindBy(how = How.ID, using = "decision-decisionTitle-lease")
    private WebElement congratulationMessageScreenPP3;

    @FindBy(how = How.XPATH, using = "//*[@id='decision-headerDescription-lease']/div[1]")
    private WebElement approvedSpendingLimitOfMsg;

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div[2]/div[1]/h3")
    private WebElement spendingLimitText;

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div[2]/div[1]/ul/li[1]")
    private WebElement easyWeeklyPayments;

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div[2]/div[1]/ul/li[2]/text()")
    private WebElement Own12MonthOrLess;

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div[2]/div[1]/ul/li[3]/u")
    private WebElement Days90SameAsCash;

    @FindBy(how = How.XPATH,using = "//span[.='Start Shopping']")
    private WebElement startShoppingBtn;




































}
