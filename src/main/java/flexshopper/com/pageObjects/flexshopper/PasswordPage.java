package flexshopper.com.pageObjects.flexshopper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PasswordPage {

    //public AppiumDriver<?> driver;
    public WebDriver driver;

    /**
     * Constructor & Page Initialization
     */
    public PasswordPage(WebDriver driver) {
        //this.driver= (AppiumDriver<?>) driver;
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    /**
     * Elements
     */
    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div[2]/div/form/div/div[2]/div/div[1]/h3")
    private WebElement emailText;


    @FindBy(how =How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div[2]/div/form/div/div[1]/p")
    @AndroidBy(xpath = "//*[@text='Enter your password to sign in to your existing account.']")
    private WebElement enterPasswordTxt;
    // in case if text will be edited or changed: //*[@id="app"]/div[1]/div[2]/div/div/div/div[2]/div/form/div/div[1]/p

    @FindBy(how = How.XPATH, using = "//button[(.)='Not You?']")
    @AndroidBy(xpath = "//*[@text='Not You?']")
    private WebElement notYouTxt;

    @FindBy(how = How.ID,using = "password-input")
    @AndroidBy(xpath = "//*[@id='password-input']")
    private WebElement passwordField;

    @FindBy(how = How.XPATH, using = "//a[text()='Forgot Password?']")
    @AndroidBy(xpath = "//*[@text='Forgot Password?']")
    private WebElement forgotPasswordLnk;

    @FindBy(how = How.XPATH, using = "//span[(.)='Sign In']")
    @AndroidBy(xpath = "//span[(.)='Sign In']")
    public WebElement signInBtn;

    /**
     * Validation Messages
     */
    @FindBy(how = How.XPATH, using = "//span[text()='Invalid email or password: please check your details and try again']")
    @AndroidBy(xpath = "//span[text()='Invalid email or password: please check your details and try again']")
    private WebElement errorMsg;

    @FindBy(how= How.XPATH, using = "//span[@label='Required']")
    @AndroidBy(xpath = "//span[@label='Required']")
    public    WebElement errMsgRequired;

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
    public void clickToForgotPassword() throws InterruptedException {
        Thread.sleep(5000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", forgotPasswordLnk);
       // driver.executeScript("arguments[0].click();",forgotPasswordLnk);
    }
}
