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
import java.util.concurrent.ExecutionException;
import static utils.selenium.Driver.browser;

public class DecisionPage extends EmailPage {
    /**
     * Elements - PP3's Decision Screen
     */
    @FindBy(how=How.XPATH,using="//*[@id='app']")
    private List<WebElement> screenElements;

    @FindBy(how = How.XPATH, using = "//*[@id='decision-decisionTitle-lease']")
    private WebElement decisionTitleTxt;

    protected By decisionTitleTxtPP3 = By.xpath("//*[@id='decision-decisionTitle-lease']");

    @FindBy(how = How.XPATH, using = "//*[@id='decision-headerDescription-lease']")
    private WebElement decisionDescription;

    @FindBy(how = How.XPATH, using = "//*[@id='decision-amount-lease']")
    private WebElement decisionAmount;

    @FindBy(how = How.ID, using = "decision-action-button")
    private WebElement startShoppingBtn;

    /**
     * verifyBankingInfoPage() - Verify PP3's Decision Screen
     */
    public void verifyDecisionScreen() throws ExecutionException, InterruptedException {
        driverHelpers.wdIsElementFound(decisionTitleTxtPP3, 320);
        // TODO: instanceOf(EmailPage.class).verifyHeader(45);

        // Wait for elements to be displayed
        WaitHelpers.waitForStaleElement(startShoppingBtn);

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
