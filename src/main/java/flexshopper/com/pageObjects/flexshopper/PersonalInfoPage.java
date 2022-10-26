package flexshopper.com.pageObjects.flexshopper;

import flexshopper.com.testDataTypes.pojoClasses.Customer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PersonalInfoPage {
    WebDriver driver;

    public PersonalInfoPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
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
    @FindBy(how = How.CLASS_NAME, using = "sc-elJkPf eUIGYj")
    private List<WebElement> payFrequencies;

    @FindBy(how=How.XPATH, using = "//h2[text()='Personal Info']")
    private WebElement PersonalInfoPScreenP3;
    public void enter_dob(String dob){
        dobPP3.sendKeys(dob);
    }
    public void enter_ssn(String ssn){
        ssnPP3.sendKeys(ssn);
    }
    public void enter_monthlyIncome(String monthlyIncome){
        monthlyIncomePP3.sendKeys(monthlyIncome);
    }

    public void enter_payFrequency(String payFrequency){
        payFrequencyPP3.click();
        for (WebElement eachPayFrequency : payFrequencies) {
            if(eachPayFrequency.getText().equalsIgnoreCase(payFrequency));
            eachPayFrequency.click();
            try { Thread.sleep(3000);}
            catch (InterruptedException e) {}
            break;

        }}

}
