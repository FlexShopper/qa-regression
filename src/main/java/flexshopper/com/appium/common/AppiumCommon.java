package tsys.appium.common;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

/**
 * This is the Appium Common class for the Automation Framework.
 * It should include any method used to support the integration with Appium.
 */
public class AppiumCommon {
    public final AutomationTools automation = new AutomationTools();

    public AppiumCommon() {
    }

    /**
     * SendKeys - Send Keys By Driver
     * @param driver
     * @param locator
     * @param aTextToSend
     */
    public void SendKeys(AppiumDriver<?> driver, By locator, String aTextToSend) {
        sendKeysPrep(driver, locator);
        driver.findElement(locator).sendKeys(aTextToSend);
    }

    /**
     * SendKeys - Send Keys By Keyboard
     * @param driver
     * @param locator
     * @param aTextToSend
     */
    public void sendKeysWithKeyboard(AppiumDriver<?> driver, By locator, String aTextToSend){
        sendKeysPrep(driver, locator);
        driver.getKeyboard().sendKeys(aTextToSend);
    }


    /**
     * sendKeysPrep - Helper method for SendKeys methods
     * @param driver
     * @param locator
     */
    private void sendKeysPrep(AppiumDriver<?> driver, By locator) {
        String aPlatform = driver.getCapabilities().getCapability("platformName").toString();
        if (aPlatform.equals(AppiumConstants.ANDROID_PLATFORM)) {
            automation.isElementClickable(driver, locator, 60);
            try {
                driver.findElement(locator).clear();
            } catch (Exception e) {
            }
            driver.findElement(locator).click();
        }
    }

    /**
     * SendKeysByKeyboardActions - Send Keys By Keyboard Actions
     * @param driver
     * @param locator
     * @param aTextToSend
     */
    public void SendKeysByKeyboardActions(AppiumDriver<?> driver, By locator, String aTextToSend) {
        //Creating object of Actions class
        Actions builder = new Actions(driver);
        String aPlatform = driver.getCapabilities().getCapability( "platformName" ).toString();
        if ( aPlatform.equals( AppiumConstants.ANDROID_PLATFORM ) ) {
            automation.isElementClickable(driver, locator, 60);
            //Generating an action to type a text
            Action type = builder.keyDown( driver.findElement(locator), Keys.SHIFT)
                    .sendKeys( driver.findElement(locator),aTextToSend)
                    .keyUp(driver.findElement(locator), Keys.SHIFT)
                    .build();
            //Performing the type action
            type.perform();
        } else {
            //TODO: iOS code here
        }
    }

    /**
     * SendKeysByJSExecutor - Send Keys By JavaScript Executor
     * @param driver
     * @param locator
     * @param aTextToSend
     */
    public void SendKeysByJSExecutor(AppiumDriver<?> driver, By locator, String aTextToSend) {
        JavascriptExecutor js = driver;
        String aPlatform = driver.getCapabilities().getCapability( "platformName" ).toString();
        if ( aPlatform.equals( AppiumConstants.ANDROID_PLATFORM ) ) {
            automation.isElementClickable(driver, locator, 60);
            js.executeScript("document.getElementById(locator).value=aTextToSend");
        } else {
            //TODO: iOS code here
        }
    }
}
