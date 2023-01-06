package pages.flexshopper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import pages.pp3.EmailPage;

import java.util.Locale;
import java.util.concurrent.ExecutionException;

public class FlexShopperHomePage extends EmailPage {

    /**
     * Elements - FlexShopper's Home Page
     */
    @FindBy(how = How.CSS, using = "span.userName")
    public WebElement myAccountHeader;

    /**
     * verifyFlexShopperHomePage() - Verify Customer lands in the FlexShopper's Homepage
     */
    public void verifyFlexShopperHomePage() throws ExecutionException, InterruptedException {
        waitHelpers.waitFluentWait(myAccountHeader, 60);
        waitHelpers.waitForStaleElement(myAccountHeader);
        validatePageUrl("https://fmweb.staging.flexint.net/?do=pp3");
        validatePageTitle("FlexShopper Lease-to-Own | Top Brands & Retailers");
    }

    //TODO: Move Getters and Validations to Selenium Helpers
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
        //TODO: Assert using Ignore Case
        Assert.assertTrue(getTitle().contains(expectedTitle));
        System.out.println(":: The title of the site is: " + getTitle());
    }

    /**
     * verifyUserLoggedIn() - Verify Customer's name is shown in Account Header
     * @param userName
     */
    public void verifyUserLoggedIn(String userName) {
        //TODO: Assert using Ignore Case
        //TODO: Wait until PP3 is closed & change focus to browser
        Assert.assertEquals(userName.toLowerCase(), myAccountHeader.getText().toLowerCase());
    }
}
