package utils.helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static utils.selenium.Driver.browser;

public class ActionHelpers {
    public static void hoverAction(WebElement element) {
        Actions actions = new Actions(browser());
        actions.moveToElement(element).perform();
    }

    public static void clickAction(WebElement element) {
        Actions action = new Actions(browser());
        action.moveToElement(element).click().perform();
    }

    public static void doubleClickAction(WebElement element) {
        new Actions(browser()).doubleClick(element).build().perform();
    }
}
