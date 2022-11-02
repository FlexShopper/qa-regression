package pages.flexshopper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import pages.pp3.EmailPage;

import static utils.selenium.Driver.browser;

public class FlexShopperHomePage extends EmailPage {
    public WebDriver driver = browser();

    /**
     * Elements - FlexShopper's Home Page
     */
    @FindBy(how = How.CLASS_NAME, using = "userName")
    public WebElement myAccountHeader;

    /**
     * verifyFlexShopperHomePage() - Verify Customer lands in the FlexShopper's Homepage
     */
    public void verifyFlexShopperHomePage() {
        validatePageUrl("https://fmweb.staging.flexint.net/?do=pp3");
        validatePageTitle("FlexShopper Lease-to-Own | Top Brands & Retailers");
    }

    // TODO: Move Getters and Validations to Selenium Helpers
    /**
     *  Getters:
     *      Get FlexShopper's Homepage URL
     *      Get FlexShopper's Homepage Title
     */
    private String getUrl() {return driver.getCurrentUrl(); }
    private String getTitle() { return driver.getTitle(); }

    /**
     * validatePageUrl() - Validates Page URL
     * @param expectedUrl
     */
    public void validatePageUrl(String expectedUrl) {
        Assert.assertTrue(getUrl().contains(expectedUrl));
        System.out.println(":: The page Url is: " + getUrl());
    }

    /**
     * validatePageTitle() - Validates Page Title
     * @param expectedTitle
     */
    public void validatePageTitle(String expectedTitle) {
        // TODO: Assert using Ignore Case
        Assert.assertTrue(getTitle().contains(expectedTitle));
        System.out.println(":: The title of the site is: " + getTitle());
    }

    /**
     * verifyUserLoggedIn() - Verify Customer's name is shown in Account Header
     * @param userName
     */
    public void verifyUserLoggedIn(String userName) {
        // TODO: Assert using Ignore Case
        Assert.assertEquals("Stanislav Kuleshov", myAccountHeader.getText());
    }
}
