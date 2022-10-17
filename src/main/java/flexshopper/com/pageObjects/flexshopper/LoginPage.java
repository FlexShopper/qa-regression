package flexshopper.com.pageObjects.flexshopper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.ID, using = "email-input")
    private WebElement emailAddress;

    @FindBy(how = How.ID, using = "formSubmitButton")
    private WebElement continueBtn;

    public void enterEmail(String email) {
        emailAddress.clear();
        emailAddress.sendKeys(email);
    }

    public void clickContinueBtn() {
        continueBtn.click();
    }
}
