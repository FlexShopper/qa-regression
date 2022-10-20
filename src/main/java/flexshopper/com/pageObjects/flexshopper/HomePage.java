package flexshopper.com.pageObjects.flexshopper;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public WebDriver driver;

    /**
     * Constructor Definition & Page Initialization
     */
    public HomePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    /**
     * Elements Definitions
     */
    @FindBy(how = How.CLASS_NAME,using = "userName")
    public WebElement userName;

    @FindBy(how = How.CLASS_NAME,using = "userName")
    public WebElement myAccountHeader;

    /**
     * Classes Definitions
     */
    public void userNameIsDisplayed() {

        Assert.assertEquals("Ashley Zzelkova", myAccountHeader.getText());
    }
}
