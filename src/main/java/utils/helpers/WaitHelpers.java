package utils.helpers;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class WaitHelpers {
    /**
     * Waits for element to be in not stale state
     * @param element
     */
    public static void waitForStaleEl(WebElement element) {
        int y = 0;
        while (y <= 30) {
            try {
                element.isDisplayed();
                break;
            } catch (StaleElementReferenceException st) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            break;
        }
    }

    /**
     * waits for backgrounds processes on the browser to complete
     * @param waitTimeout
     */
    public static void waitForPageReady(WebDriver driver, int waitTimeout) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(waitTimeout))
                .pollingEvery(Duration.ofMillis(1000))
                .ignoring(NoSuchElementException.class);
        wait.until((ExpectedCondition<Boolean>) wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
    }
}
