package flexshopper.com.appium.utilities;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.ScreenOrientation;

public class AppiumCommonUtils {
    /**
     * Android Scrolls to a specific text within the page.
     * @param driver - An Appium Android driver
     * @return - Tablet or Mobile
     */
    public static String deviceType(AppiumDriver<?> driver)
    {
        String device;
        if(driver.getOrientation() == ScreenOrientation.valueOf("LANDSCAPE")){
            device = "TABLET";
        } else{
            device = "MOBILE";
        }
        return device;
    }

    /**
     *  Hide Soft Keyboard.
     * @Param driver
     */
    public void hideKeyboard_Android(AppiumDriver driver) {
        driver.getKeyboard();
        driver.hideKeyboard();
    }
}
