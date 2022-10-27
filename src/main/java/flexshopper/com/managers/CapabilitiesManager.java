package flexshopper.com.managers;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class CapabilitiesManager {
    public DesiredCapabilities getCapabilities() {
      /*  DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4 New");
        desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
        desiredCapabilities.setCapability(MobileCapabilityType.VERSION, "91.0.4472");
        return desiredCapabilities;}*/
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("Version", 12);
        capabilities.setCapability("deviceName","Pixel 4 New");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("chromeOptions", ImmutableMap.of("w3c", false));
        capabilities.setCapability("chromeExec", "/Users/veneraserikova/IdeaProjects/FlexShopperLatestVersionNew11/src/test/java/mobile_drivers/chromedriver 2");
        capabilities.setCapability("forceMjsonwp", true);
        return capabilities;

    }
}
