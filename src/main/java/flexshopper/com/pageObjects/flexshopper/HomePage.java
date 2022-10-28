package flexshopper.com.pageObjects.flexshopper;

import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
   // public AppiumDriver<?> driver;
    public WebDriver driver;
    /**
     * Constructor & Page Initialization
     */
    public HomePage(WebDriver driver) {
       // this.driver= (AppiumDriver<?>) driver;
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    /**
     * Elements Definitions
     */
    @FindBy(how = How.CLASS_NAME,using = "userName")
    public WebElement myAccountHeader;

   @FindBy(how = How.XPATH, using = "(//*[@id='Layer_1'])[1]")
    public WebElement layer1;

    /**
     * Classes Definitions
     */

}
