package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.selenium.DriverController;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CucumberHooks {
    @Before("@Web")
    public void beforeWeb() throws IOException {
        Properties browserProps = new Properties();
        browserProps.load(new FileInputStream("src/test/resources/config.properties"));

        String browser = browserProps.getProperty("browserName");

        if (browser.equalsIgnoreCase("chrome")) {
            DriverController.instance.startChrome("--disable-extensions");
        }
        else if (browser.equalsIgnoreCase("firefox")) {
            DriverController.instance.startFirefox("--disable-extensions");
        }
        else if (browser.equalsIgnoreCase("headlessChrome")) {
            DriverController.instance.startChrome("--headless");
        }
        else if (browser.equalsIgnoreCase("headlessFirefox")) {
            DriverController.instance.startFirefox("--headless");
        }
    }

    @Before("@Chrome")
    public void beforeChrome(){
        DriverController.instance.startChrome("--disable-extensions");
    }

    @Before("@Firefox")
    public void beforeFirefox() throws Exception {

        DriverController.instance.startFirefox("--disable-extensions");
    }

    @Before("@HeadlessChrome")
    public void beforeChromeHeadless() {
        DriverController.instance.startChrome("--headless");
    }

    @Before("@HeadlessFirefox")
    public void beforeHeadlessFirefox() throws Exception {
        DriverController.instance.startFirefox("--headless");
    }

    @After
    public void stopWebDriver() {
        DriverController.instance.stopWebDriver();
    }
}
