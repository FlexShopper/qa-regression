package flexshopper.com.e2eScripts;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Appium {

    AppiumDriver<MobileElement> driver;
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    @Test
    public void  setUp() throws MalformedURLException {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4 New");
        desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
        desiredCapabilities.setCapability(MobileCapabilityType.VERSION, "91.0.4472");
        capabilities.setCapability("Chrome", "/Users/veneraserikova/qa-regression/drivers/chromedriverEmulator");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(url, capabilities);
        driver.get("https://fmweb.staging.flexint.net/?do=pp3");
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        MobileElement element1 = driver.findElement(By.id("email-input"));
        element1.sendKeys("nann40547@gmail.com");






    }



}
