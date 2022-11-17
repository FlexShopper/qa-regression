package utils.helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import static utils.selenium.Driver.browser;

public class WaitHelpers {
    /**
     * Waits for element to be in not stale state
     * @param element
     */
    public static void waitForStaleEl(WebElement element) {
        int y = 0;
        while (y <= 25) {
            try {
                element.isDisplayed();
                break;
            } catch (StaleElementReferenceException st) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            break;
        }
    }

    /**
     * waits for backgrounds processes on the browser to complete
     * @param timeOutInSeconds
     */
    public static void waitPageToLoad(long timeOutInSeconds) {
        ExpectedCondition<Boolean> expectation = driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
        try {
            WebDriverWait wait = new WebDriverWait(browser(), timeOutInSeconds);
            wait.until(expectation);
        } catch (Throwable error) {
            error.printStackTrace();
        }
    }
}
