package flexshopper.com.pageObjects.flexshopper;

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
}
