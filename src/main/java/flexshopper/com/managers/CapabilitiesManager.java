package flexshopper.com.managers;

import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class CapabilitiesManager {
    public String platform = "iOS";
    Properties prop = new Properties();
    InputStream input = null;

    public void propConfigFile() throws IOException {
        input = new FileInputStream("configs/Configuration.properties");
        prop.load(input);
    }
    public DesiredCapabilities getCapabilities() {
        if (platform.equalsIgnoreCase("android")) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("Version",prop.getProperty("android.platform.version"));
            capabilities.setCapability("deviceName", prop.getProperty("android.device.name"));
            capabilities.setCapability("platformName", prop.getProperty("android.platform"));
            capabilities.setCapability("browserName", "chrome");
            capabilities.setCapability("chromeOptions", ImmutableMap.of("w3c", false));
            capabilities.setCapability("chromeExec", "/Users/veneraserikova/qa-regression/drivers/chromedriverEmulator");
            capabilities.setCapability("forceMjsonwp", true);
            return capabilities;
        }
        else if (platform.equalsIgnoreCase("iOS")) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("Version", prop.getProperty("ios.platform.version"));
            capabilities.setCapability("deviceName", prop.getProperty("ios.device.name"));
            capabilities.setCapability("platformName", prop.getProperty("ios.platform"));
            capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
            capabilities.setCapability("chromeOptions", ImmutableMap.of("w3c", false));
            capabilities.setCapability("chromeExec", prop.getProperty("driverPath"));
            capabilities.setCapability("forceMjsonwp", true);
            capabilities.setCapability("bundleId", prop.getProperty("ios.bundle.id"));
            return capabilities;
        }
        return null;
    }
}

