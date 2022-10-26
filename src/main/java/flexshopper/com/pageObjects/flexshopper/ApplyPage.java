package flexshopper.com.pageObjects.flexshopper;

import flexshopper.com.testDataTypes.pojoClasses.Customer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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
    @FindBy(how = How.CLASS_NAME, using = "sc-elJkPf eUIGYj")
    private List<WebElement> payFrequencies;

   public void enter_name(String name){
       firstNamePP3.sendKeys(name);
   }
    public void enter_lastName(String lastName){
        lastNamePP3.sendKeys(lastName);
    }
    public void enter_phone(String phoneNumber){
       phonePP3.sendKeys(phoneNumber);
    }
    public void enter_street(String street){
       streetPP3.sendKeys(street);
    }
    public void enter_dob(String dob){
        dobPP3.sendKeys(dob);
    }
    public void enter_ssn(String ssn){
        ssnPP3.sendKeys(ssn);
    }
    public void enter_monthlyIncome(String monthlyIncome){
     monthlyIncomePP3.sendKeys(monthlyIncome);
    }
    public void enter_routingNumber(String routingNumber){
        monthlyIncomePP3.sendKeys(routingNumber);
    }
    public void enter_accountNumber(String accountNumber){
        monthlyIncomePP3.sendKeys(accountNumber);
    }
    public void enter_payFrequency(String payFrequency){
       payFrequencyPP3.click();
        for (WebElement eachPayFrequency : payFrequencies) {
            if(eachPayFrequency.getText().equalsIgnoreCase(payFrequency));
            eachPayFrequency.click();
            try { Thread.sleep(3000);}
            catch (InterruptedException e) {}
            break;

        }




    }
    public void clickEnterAddressManually(){
       enterAddressManuallyPP3.click();
    }
    public void fill_FullDetails(Customer customer) {
        enter_name(customer.first_name);
        enter_lastName(customer.last_name);
        enter_phone(customer.PhoneNumber);
        enter_street(customer.street);
        enter_dob(customer.Birthdate);
        enter_ssn(customer.SSN);
        enter_monthlyIncome(customer.MonthlyIncome);
        enter_routingNumber(customer.ACHAccount);
        enter_routingNumber(customer.ACHRouting);

    }









































}
