package utils.helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static utils.selenium.Driver.browser;
import static utils.selenium.Settings.weHighlightedColour;

public class WebElementHelpers {

    public static WebDriverWait webWaitForSeconds() {
        return new WebDriverWait(browser(), Duration.ofSeconds(10));
    }

    public boolean webElementIsDisplayed(WebElement element) {
        webWaitForSeconds().until(ExpectedConditions.visibilityOf(element));
        return element.isDisplayed();
    }

    public void webElementIsSelected(WebElement element) {
        webWaitForSeconds().until(ExpectedConditions.visibilityOf(element));
        boolean selectState = element.isSelected();

        // Performing the click operation only if element is not selected
        if(selectState == false) {
            element.click();
        }
    }

    public void webElementToBeClickable(WebElement element) {
        webWaitForSeconds().until(ExpectedConditions.elementToBeClickable(element));
        element.isEnabled();
    }

    public void webHighlightElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) browser();
        js.executeScript(weHighlightedColour, element);
    }

    public void webClick(WebElement element) {
        webElementToBeClickable(element);
        webHighlightElement(element);
        element.click();
    }
    public void webSendKeys(WebElement element, String text, boolean clearFirst) {
        webElementIsDisplayed(element);
        if (clearFirst) webClick(element);
        element.sendKeys(text);
    }

    public boolean webElementIsInvisible(WebElement element) {
        webWaitForSeconds().until(ExpectedConditions.invisibilityOf(element));
        return !element.isDisplayed();
    }

    public static String webGetAttribute(WebElement element, String attribute) {
        return element.getAttribute(attribute);
    }

    public static String webGetText(WebElement element) {
        return element.getText();
    }
}
