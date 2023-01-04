package pages.pp3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import utils.helpers.WaitHelpers;
import utils.helpers.WebElementHelpers;
import java.util.List;
import java.util.concurrent.ExecutionException;
import static pages.Page.instanceOf;
import static utils.selenium.Driver.browser;

public class DecisionPage extends EmailPage {
    /**
     * Elements - PP3's Decision Screen - Approved
     */
    @FindBy(how=How.XPATH,using="//*[@id='app']")
    private List<WebElement> screenElements;

    @FindBy(how = How.XPATH, using = "//*[@id='decision-decisionTitle-lease']")
    private WebElement decisionTitleTxt;

    @FindBy(how = How.XPATH, using = "//*[@id='decision-headerDescription-lease']")
    private WebElement decisionDescription;

    @FindBy(how = How.XPATH, using = "//*[@id='decision-amount-lease']")
    private WebElement decisionAmount;

    @FindBy(how = How.ID, using = "decision-action-button")
    private WebElement startShoppingBtn;

    /**
     * Elements - PP3's Decision Screen - Denied
     */
    @FindBy(how = How.XPATH, using = "//h2[text()='Thank You For Applying.']")
    private WebElement decisionThankYouTxt;

    @FindBy(how = How.ID, using = "denied-denialDescription")
    private WebElement denialDescriptionTxt;

    @FindBy(how = How.ID, using = "denied-okayBtn-lease")
    private WebElement deniedOkayBtn;

    @FindBy(how = How.ID, using = "denied-arbitrationLink-lease")
    private WebElement arbitrationAgreementLnk;

    /**
     * verifyBankingInfoPage() - Verify PP3's Decision Screen
     */
    public void verifyDecisionScreen(String decision) throws ExecutionException, InterruptedException {
        if(decision.contains("approved")) {
            WaitHelpers.waitFluentWait(startShoppingBtn, 240);
            WaitHelpers.waitForStaleElement(startShoppingBtn);
        } else if(decision.contains("did not qualify")) {
            WaitHelpers.waitFluentWait(deniedOkayBtn, 240);
            WaitHelpers.waitForStaleElement(deniedOkayBtn);
        }
        instanceOf(EmailPage.class).verifyHeader();

        // Verify elements are displayed
        if(decision.contains("approved")) {
            elementHelpers.webElementIsDisplayed(decisionTitleTxt);
            elementHelpers.webElementIsDisplayed(decisionDescription);
            elementHelpers.webElementIsDisplayed(decisionAmount);
            elementHelpers.webElementIsDisplayed(startShoppingBtn);
        } else if(decision.contains("did not qualify")) {
            elementHelpers.webElementIsDisplayed(decisionThankYouTxt);
            elementHelpers.webElementIsDisplayed(denialDescriptionTxt);
            elementHelpers.webElementIsDisplayed(deniedOkayBtn);
            elementHelpers.webElementIsDisplayed(arbitrationAgreementLnk);
        }

        // TODO: Verify PP3's Footer
    }

    /**
     * verifyDecision() - Verify decision displayed in PP3's Decision Screen
     */
    public void verifyDecision(String decision) {
        if(decision.contains("approved")) {
            //TODO: Use elementHelpers.webGetText()
            WebElement validation = browser().findElement(By.xpath("//*[@id='decision-headerDescription-lease']/div[1]"));
            Assert.assertEquals("You were approved for a spending limit of", WebElementHelpers.webGetText(validation));
        } else if(decision.contains("did not qualify")) {
            //TODO: Use elementHelpers.webGetText()
            WebElement validation = browser().findElement(By.xpath("//*[@id='denied-denialDescription']"));
            boolean expectedText = WebElementHelpers.webGetText(validation).contains("You did not qualify for a spending limit");
            Assert.assertTrue(expectedText);
        }
    }

    /**
     * clickOnStartShopping() - clicks on the "Start Shopping" button
     */
    public void clickOnStartShopping() {
        elementHelpers.webClickJSExecutor(startShoppingBtn);
    }
}
