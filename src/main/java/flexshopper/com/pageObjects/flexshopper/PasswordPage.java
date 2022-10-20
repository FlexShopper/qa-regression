package flexshopper.com.pageObjects.flexshopper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

public class PasswordPage {
    WebDriver driver;

    /**
     * Constructor Definition & Page Initialization
     */
    public PasswordPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    /**
     * Elements Definitions
     */
    @FindBy(how = How.ID,using = "password-input")
    public WebElement passwordField;

    @FindBy(how = How.XPATH, using = "//span[text()='Invalid email or password: please check your details and try again']")
    public WebElement errorMsg;

    @FindBy(how= How.XPATH, using = "//span[@label='Required']")
    public  WebElement errMsgRequired;

    @FindBy(how = How.ID, using = "formSubmitButton")
    public WebElement signInBtn;

    @FindBy(how = How.XPATH, using = "//a[text()='Forgot Password?']")
    public WebElement ForgotPasswordLnk;

    /**
     * Classes Definitions
     */
    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickSignInBtn() {
        signInBtn.click();
    }

    public void passwordIsDisplayed() {
        Assert.assertTrue(passwordField.isDisplayed());
    }

    public void userIsInPasswordPage() {
        Assert.assertTrue(passwordField.isDisplayed());
        Assert.assertTrue(ForgotPasswordLnk.isDisplayed());
        Assert.assertTrue(signInBtn.isDisplayed());
    }
}
