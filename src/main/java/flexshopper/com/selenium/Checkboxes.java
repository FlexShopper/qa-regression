package flexshopper.com.selenium;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class Checkboxes {
    public static AppiumDriver<?> driver;
    public static void selectCheckBox(WebElement element, boolean check) {
        if (check) {
            if (!element.isSelected()) {
                element.click();
            }
        } else {
            if (element.isSelected()) {
                element.click();
            }
        }
    }
}
