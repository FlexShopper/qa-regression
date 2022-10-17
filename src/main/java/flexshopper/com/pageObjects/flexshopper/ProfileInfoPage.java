package flexshopper.com.pageObjects.flexshopper;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProfileInfoPage {
    public WebDriver driver;

    /**
     * Constructor Definition & Page Initialization
     */
    public ProfileInfoPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Elements Definitions
     */
    @FindBy(how = How.XPATH, using = "//h2[text()='Profile Info']")
    public WebElement profileInfoTab;

    @FindBy(how = How.ID, using = "notYou-button")
    public WebElement notYouBtn;

    @FindBy(how = How.ID, using = "enterManualLink")
    public WebElement enterManualLink;

    /**
     * Classes Definitions
     */
    public void userIsInProfileInfoPage() {
        Assert.assertTrue(profileInfoTab.isDisplayed());
        Assert.assertTrue(notYouBtn.isDisplayed());
        Assert.assertTrue(enterManualLink.isDisplayed());
    }
}
