package utils.helpers;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.pp3.EmailPage;

import java.util.List;
import static utils.selenium.Driver.browser;
import static utils.selenium.Settings.wdHighlightedColour;

public class WebDriverHelpers {

    public Object wdHighlight(By locator) {
        WebDriver driver = browser();
        WebElement myLocator = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js.executeScript(wdHighlightedColour, myLocator);
    }

    public Object wdElementIsDisplayed(By locator) {
        WebDriverWait wait = new WebDriverWait(browser(), 10);
        return wait.until(ExpectedConditions.visibilityOf((WebElement) locator));
    }

    public void wdElementToDisappear(By locator) {
        WebDriverWait wait = new WebDriverWait(browser(), 5);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public WebElement wdFindElement(By locator) {
        wdElementIsDisplayed(locator);
        return browser().findElement(locator);
    }

    public void wdIsElementFound(By locator, int timeout) {
        WebDriver driver = browser();
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

    public void wdClick(By locator) {
        wdFindElement(locator).click();
    }

    public void wdSendKeys(By locator, String text, boolean clearFirst) {
        if (clearFirst) wdClick(locator);
        wdFindElement(locator).sendKeys(text);
    }

    public void wdSwitchToFrame() {
        WebDriver driver = browser();
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
    }

    public Alert wdSwitchToAlert() {
        WebDriver driver = browser();
        return driver.switchTo().alert();
    }

    public void wdDriverFullScreen() {
        WebDriver driver = browser();
        driver.manage().window().fullscreen();
    }
}
