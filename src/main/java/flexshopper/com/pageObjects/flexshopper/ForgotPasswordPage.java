package flexshopper.com.pageObjects.flexshopper;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgotPasswordPage {
    WebDriver driver;

    public ForgotPasswordPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using ="//*[@id='app']/div[1]/div[2]/div/div/div/div[1]/div/h3")
    public WebElement resetPasswordText;

    @FindBy(how =How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div[2]/div/div/p")
    public WebElement chooseOptionsText;

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div[2]/div/div/label[1]/div[2]/div/span[2]")
    public WebElement email;

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div[2]/div/div/label[2]/div[2]/div/span[2]")
    public WebElement phoneNumber;

    @FindBy(how = How.XPATH, using = "(//div[@class='sc-fMiknA erPZuz'])[1]")
    public WebElement emailNameOfRadioBtn;

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div[2]/div/div/label[2]/div[1]")
    public WebElement textMsgOfRadioBtn;

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div[2]/div/div/div/a")
    public WebElement returnToPwdSignIn;

    @FindBy(how = How.XPATH, using = "//span[text()='Continue']")
    public WebElement continueBtn;

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[3]/div/div/div/div/div/div/h1")
    public WebElement weSentYouCodeText;

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[3]/div/div/div/div/div/div/p/span")
    public WebElement emailNameOnCodeScreen;

    @FindBy(how = How.XPATH,using = "//*[@id='app']/div[3]/div/div/div/div/div/div/div/div/span[1]")
    public WebElement securityBox;

    @FindBy(how = How.XPATH, using = "//button[text()='No code received?']")
    public WebElement NoCodeReceivedBtn;

    @FindBy(how = How.XPATH, using = "//span[text()='Submit']")
    public WebElement SubmitBtn;

    @FindBy(how = How.ID, using = "code-input")
    public WebElement securityCodeBox;

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div[1]/h3")
    public WebElement ResetPsdText;

    @FindBy(how = How.ID, using = "password-input")
    public WebElement psdInputBox;

    @FindBy(how = How.ID, using = "notYou-button")
    public WebElement notYouBtn;

    @FindBy(how = How.XPATH, using = "//span[text()='Change Password']")
    public WebElement changePassword;


    public  void clickToSignIn(){

        returnToPwdSignIn.click();

    }

    public void clickToContinueBtn(){
        continueBtn.click();
    }
    public void clickToSendEmail(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, 20);
            WebElement element = wait.until(ExpectedConditions.visibilityOf(emailNameOfRadioBtn));
        } catch (
                TimeoutException toe) {
            System.out.println("WebElement wasn't found");
        }
        emailNameOfRadioBtn.click();

    }

    public void clickToSendSms(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, 20);
            WebElement element = wait.until(ExpectedConditions.visibilityOf(textMsgOfRadioBtn));
        } catch (
                TimeoutException toe) {
            System.out.println("WebElement wasn't found");
        }
        textMsgOfRadioBtn.click();

    }
}
