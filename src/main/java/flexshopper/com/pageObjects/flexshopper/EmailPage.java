package flexshopper.com.pageObjects.flexshopper;

import flexshopper.com.managers.FileReaderManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EmailPage {
    WebDriver driver;

    /**
     * Constructor Definition & Page Initialization
     */
    public EmailPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    /**
     * Elements Definitions
     */
    @FindBy(how = How.ID, using = "email-input")
    private WebElement emailAddress;

    @FindBy(how = How.ID, using = "formSubmitButton")
    private WebElement continueBtn;

    @FindBy(how = How.XPATH, using = "//h3[text()='Welcome to']")
    public WebElement welcomeText;

    @FindBy(how = How.XPATH, using = "//span[@label='Invalid email address']")
    public WebElement errorMsg;

    /**
     * Classes Definitions
     */
    public void enterEmail(String email) {
        emailAddress.clear();
        emailAddress.sendKeys(email);
    }

    public void clickContinueBtn() {
        continueBtn.click();
    }

    public void userIsInEmailScreen() {
        Assert.assertTrue(emailAddress.isDisplayed());
        Assert.assertTrue(continueBtn.isDisplayed());
    }
    public void getEmailScreen() {
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
        // add delete cookies
    }
    public void login(){
        emailAddress.sendKeys(FileReaderManager.getInstance().getConfigReader().getEmail());
        continueBtn.click();
    }
    public void loginWithOutFullInfo(){
        emailAddress.sendKeys(FileReaderManager.getInstance().getConfigReader().getEmailWithOutFullInfo());
        continueBtn.click();
    }
}
