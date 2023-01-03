package utils.helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class WaitHelpers {
    /**
     * waits for backgrounds processes on the browser to complete
     * @param driver
     */
    public void checkPageIsReady(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor)driver;

        //Initially bellow given if condition will check ready state of page.
        if (js.executeScript("return document.readyState").toString().equals("complete")){
            System.out.println("Page Is loaded.");
            return;
        }

        //This loop will rotate for 30 times to check If page Is ready after every 1 second.
        for (int i=0; i<30; i++){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {}
            //To check page ready state.
            if (js.executeScript("return document.readyState").toString().equals("complete")){
                break;
            }
        }
    }

    /**
     * waits for backgrounds processes on the browser to complete
     * @param waitTimeout
     */
    public static void waitForPageReady(int waitTimeout) {
        //Wait<WebDriver> wait = new FluentWait<>(driver)
        //        .withTimeout(Duration.ofSeconds(waitTimeout))
        //        .pollingEvery(Duration.ofMillis(1000))
        //        .ignoring(NoSuchElementException.class);
        //wait.until((ExpectedCondition<Boolean>) wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
    }

    @SuppressWarnings( "deprecation" )
    public static void waitFluentWait(WebDriver driver, WebElement element, int waitTimeout) {
        //Actions move2Element = new Actions(driver);
        //Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(waitTimeout))
        //        .pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
        //wait.until(ExpectedConditions.visibilityOf(element));
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
        //System.out.println("Start");
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
        //System.out.println("Complete");
    }

    public boolean retryingFindClick(WebElement element) {
        boolean result = false;
        int attempts = 0;
        while(attempts < 60) {
            try {
                element.click();
                result = true;
                break;
            } catch(StaleElementReferenceException e) {
            }
            attempts++;
        }
        return result;
    }
}
