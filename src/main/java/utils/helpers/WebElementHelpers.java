package utils.helpers;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import static utils.selenium.Driver.browser;
import static utils.selenium.Settings.weHighlightedColour;

public class WebElementHelpers {

    public WebDriverWait webWaitForSeconds() {
        return new WebDriverWait(browser(), 20);
    }

    public WebDriverWait webWaitForSeconds(int timeOut) {
        return new WebDriverWait(browser(), timeOut);
    }

    public boolean webElementIsDisplayed(WebElement element) {
        webWaitForSeconds().until(ExpectedConditions.visibilityOf(element));
        return element.isDisplayed();
    }

    public void webElementIsSelected(WebElement element) {
        webElementIsDisplayed(element);
        boolean selectState = element.isSelected();

        // Performing the click operation only if element is not selected
        if(selectState == false) {
            element.click();
        }
    }

    public void webWaitForClickable(WebElement element) {
        webWaitForSeconds().until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(element)));
        element.isEnabled();
    }

    public void webHighlightElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) browser();
        js.executeScript(weHighlightedColour, element);
    }

    public void webClick(WebElement element) {
        webWaitForSeconds().until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(element)));
        int attempts = 0;
        while(attempts < 10) {
            try {
                element.click();
                break;
            }
            catch(StaleElementReferenceException staleException) {
                staleException.printStackTrace();
            }
            attempts++;
        }

        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            while (element.isDisplayed()) {
                //do nothing
            }
        });
        try {
            future.get(3, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException | ExecutionException | java.util.concurrent.TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void webClickJSExecutor(WebElement element) {
        int attempts = 0;
        while(attempts < 5) {
            try {
                JavascriptExecutor js = (JavascriptExecutor) browser();
                js.executeScript("arguments[0].click();", element);
                break;
            }
            catch(StaleElementReferenceException staleException) {
                staleException.printStackTrace();
            }
            attempts++;
        }
    }

    public void webSendKeys(WebElement element, String text, boolean clearFirst) {
        webWaitForSeconds().until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(element)));
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
