package utils.helpers;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class WebElementHelpers {

    public void webWaitForSeconds(int timeOut) throws InterruptedException {
        Thread.sleep(timeOut);
        //WebDriverWait wait = new WebDriverWait(driver, timeOut);
        //return wait;
    }

    public boolean webElementIsDisplayed(WebElement element) throws InterruptedException {
        //webWaitForSeconds(20).until(ExpectedConditions.visibilityOf(element));
        webWaitForSeconds(10);
        return element.isDisplayed();
    }

    public void webElementIsSelected(WebElement element) throws InterruptedException {
        webElementIsDisplayed(element);
        boolean selectState = element.isSelected();

        // Performing the click operation only if element is not selected
        if(selectState == false) {
            element.click();
        }
    }

    public void webWaitForClickable(WebElement element) throws InterruptedException {
        //webWaitForSeconds(20).until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(element)));
        webWaitForSeconds(10);
        element.isEnabled();
    }

    public void webClick(WebElement element) throws InterruptedException {
        //webWaitForSeconds(20).until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(element)));
        webWaitForSeconds(10);
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
    }

    public void webClickJSExecutor(WebElement element) {
        int attempts = 0;
        while(attempts < 5) {
            try {
                //JavascriptExecutor js = (JavascriptExecutor) driver;
                //js.executeScript("arguments[0].click();", element);
                break;
            }
            catch(StaleElementReferenceException staleException) {
                staleException.printStackTrace();
            }
            attempts++;
        }
    }

    public void webSendKeys(WebElement element, String text, boolean clearFirst) throws InterruptedException {
        //webWaitForSeconds(20).until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(element)));
        webWaitForSeconds(10);
        if (clearFirst) webClick(element);
        element.sendKeys(text);
    }

    public boolean webElementIsInvisible(WebElement element) throws InterruptedException {
        //webWaitForSeconds(20).until(ExpectedConditions.invisibilityOf(element));
        webWaitForSeconds(10);
        return !element.isDisplayed();
    }

    public static String webGetAttribute(WebElement element, String attribute) {
        return element.getAttribute(attribute);
    }

    public static String webGetText(WebElement element) {
        return element.getText();
    }
}
