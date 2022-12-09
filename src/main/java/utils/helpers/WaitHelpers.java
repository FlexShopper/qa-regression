package utils.helpers;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class WaitHelpers {
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

    /**
     * waitForStaleElScheduledExecutor() - Wait for Stale State Exception to end using the SingleThreadScheduledExecutor()
     * @param element
     * @throws InterruptedException
     * @throws ExecutionException
     */
    public static void waitForStaleElement(WebElement element) throws InterruptedException, ExecutionException {
        int iCount = 60, iDelay = 1;
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        System.out.println("Start");
        List<Future<Integer>> futures = new ArrayList<>(iCount);
        for (int i =0; i< iCount; i++) {
            try {
                element.isDisplayed();
                break;
            } catch (StaleElementReferenceException st) {
                int j = i;
                futures.add(scheduler.schedule(() -> j, iDelay, TimeUnit.SECONDS));
            }
        }

        for (Future<Integer> e : futures) {
            e.get();
        }
        System.out.println("Complete");
    }
}
