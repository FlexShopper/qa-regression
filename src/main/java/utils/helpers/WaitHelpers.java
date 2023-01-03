package utils.helpers;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import static utils.selenium.Driver.browser;

public class WaitHelpers {
    /**
     * waits for backgrounds processes on the browser to complete
     * @param waitTimeout
     */
    public static void waitForPageReady(int waitTimeout) {
        WebDriver driver = browser();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Initially bellow given if condition will check ready state of page.
        if (js.executeScript("return document.readyState").toString().equals("complete")){
            System.out.println("Page Is loaded.");
            return;
        }

        //This loop will rotate for n times to check If page Is ready after every 1 second.
        //You can replace your value with 25 If you wants to Increase or decrease wait time.
        for (int i=0; i<waitTimeout; i++){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {}
            //To check page ready state.
            if (js.executeScript("return document.readyState").toString().equals("complete")){
                break;
            }
        }
    }

    @SuppressWarnings( "deprecation" )
    public static void waitFluentWait(WebElement element, int waitTimeout) throws InterruptedException {
        WebDriver driver = browser();
        Thread.sleep(waitTimeout);
    }

    /**
     * waitForStaleElScheduledExecutor() - Wait for Stale State Exception to end using the SingleThreadScheduledExecutor()
     * @param element
     * @throws InterruptedException
     * @throws ExecutionException
     */
    public static boolean waitForStaleElement(WebElement element) throws InterruptedException, ExecutionException {
        boolean staleElement = true;
        int repeat = 60;
        while(repeat <=60) {
            try {
                element.click();
                staleElement = false;
            } catch (StaleElementReferenceException exception) {
                exception.printStackTrace();
            }
            repeat++;
        }
        return staleElement;
    }
}
