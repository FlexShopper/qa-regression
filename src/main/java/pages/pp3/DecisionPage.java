package pages.pp3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import utils.helpers.WaitHelpers;
import utils.helpers.WebElementHelpers;
import java.util.List;
import static utils.selenium.Driver.browser;

public class DecisionPage extends EmailPage {
    /**
     * Elements - PP3's Decision Screen
     */
    @FindBy(how=How.XPATH,using="//*[@id=\"app\"]")
    private List<WebElement> screenElements;

    @FindBy(how = How.ID, using = "decision-decisionTitle-lease")
    private WebElement decisionTitleTxt;

    @FindBy(how = How.XPATH, using = "//*[@id='decision-headerDescription-lease']")
    private WebElement decisionDescription;

    @FindBy(how = How.XPATH, using = "//*[@id='decision-amount-lease']")
    private WebElement decisionAmount;

    @FindBy(how = How.ID, using = "decision-action-button")
    private WebElement startShoppingBtn;

    /**
     * verifyBankingInfoPage() - Verify PP3's Decision Screen
     */
    public void verifyDecisionScreen() throws InterruptedException {
        // Wait for screen to load & Ajax to be completed
        // TODO: WaitHelpers.waitForPageReady(browser(), 120);
        Thread.sleep(120000);
        // Verify top element for stale state
        WaitHelpers.waitForStaleEl(decisionTitleTxt);
        // TODO: Verify PP3's Header
        // Verify elements are displayed
        elementHelpers.webElementIsDisplayed(decisionTitleTxt);
        elementHelpers.webElementIsDisplayed(decisionDescription);
        elementHelpers.webElementIsDisplayed(decisionAmount);
        elementHelpers.webElementIsDisplayed(startShoppingBtn);
        // TODO: Verify PP3's Footer
    }

    /**
     * verifyDecision() - Verify decision displayed in PP3's Decision Screen
     */
    public void verifyDecision() {
        //TODO: Use elementHelpers.webGetText()
        WebDriver driver = browser();
        WebElement validation = driver.findElement(By.xpath("//*[@id='decision-headerDescription-lease']/div[1]"));
        Assert.assertEquals("You were approved for a spending limit of", WebElementHelpers.webGetText(validation));
    }

    /**
     * clickOnStartShopping() - clicks on the "Start Shopping" button
     */
    public void clickOnStartShopping() {
        elementHelpers.webClickJSExecutor(startShoppingBtn);
    }
}