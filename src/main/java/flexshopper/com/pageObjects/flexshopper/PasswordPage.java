package flexshopper.com.pageObjects.flexshopper;

import io.appium.java_client.pagefactory.AndroidBy;
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
     * Constructor & Page Initialization
     */
    public PasswordPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    /**
     * Elements
     */
    @AndroidBy(xpath = "//*[@text='Enter your password to sign in to your existing account.']")
    public WebElement enterPasswordTxt;

    @AndroidBy(xpath = "//*[@text='Not You?']")
    public WebElement notYouTxt;

    @FindBy(how = How.ID,using = "password-input")
    @AndroidBy(xpath = "//*[@id='password-input']")
    public WebElement passwordField;

    @FindBy(how = How.XPATH, using = "//a[text()='Forgot Password?']")
    @AndroidBy(xpath = "//*[@text='Forgot Password?']")
    public WebElement forgotPasswordLnk;

    @FindBy(how = How.ID, using = "formSubmitButton")
    @AndroidBy(xpath = "//*[@text='Sign In']")
    public WebElement signInBtn;

    /**
     * Validation Messages
     */
    @FindBy(how = How.XPATH, using = "//span[text()='Invalid email or password: please check your details and try again']")
    @AndroidBy(xpath = "//span[text()='Invalid email or password: please check your details and try again']")
    public WebElement errorMsg;

    @FindBy(how= How.XPATH, using = "//span[@label='Required']")
    @AndroidBy(xpath = "//span[@label='Required']")
    public  WebElement errMsgRequired;

    /**
     * Classes
     */

    /**
     * userIsInPasswordPage() - Verify user landed in the Password screen
      */
    public void userIsInPasswordPage() {
        Assert.assertTrue(enterPasswordTxt.isDisplayed());
        Assert.assertTrue(notYouTxt.isDisplayed());
        Assert.assertTrue(passwordField.isDisplayed());
        Assert.assertTrue(forgotPasswordLnk.isDisplayed());
        Assert.assertTrue(signInBtn.isDisplayed());
    }

    /**
     * enterPassword() - Enter password in the password field
     * @param password
     */
    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    /**
     * clickSignInBtn() - Click on the "Sign-In" button
     */
    public void clickSignInBtn() {
        signInBtn.click();
    }
}
