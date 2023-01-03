package utils.helpers;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class WebDriverHelpers {

    public Object wdElementIsDisplayed(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOf((WebElement) locator));
    }

    public void wdElementToDisappear(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public WebElement wdFindElement(WebDriver driver, By locator) {
        wdElementIsDisplayed(driver, locator);
        return driver.findElement(locator);
    }

    public void wdIsElementFound(WebDriver driver, By locator, int timeout) {
        try {
            for (int i=0; i<timeout; i++) {
                List<WebElement> dynamicElement = driver.findElements(locator);
                if(dynamicElement.size() != 0){
                    //If list size is non-zero, element is present
                    //System.out.println("Element " + locator + " was found");
                    break;
                }
                else{
                    //Else if size is 0, then element is not present
                    Thread.sleep(1000);
                    //System.out.println( "Iteration number: " + i + " - Element " + locator + " not found");
                }
            }
        } catch (NoSuchElementException e){
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void wdClick(WebDriver driver, By locator) {
        wdFindElement(driver, locator).click();
    }

    public void wdSendKeys(WebDriver driver, By locator, String text, boolean clearFirst) {
        if (clearFirst) wdClick(driver, locator);
        wdFindElement(driver, locator).sendKeys(text);
    }

    public void wdSwitchToFrame(WebDriver driver) {
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
    }

    public Alert wdSwitchToAlert(WebDriver driver) {
        return driver.switchTo().alert();
    }

    public void wdDriverFullScreen(WebDriver driver) {
        driver.manage().window().fullscreen();
    }
}
