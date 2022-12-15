package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.selenium.DriverController;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import static utils.selenium.Driver.browser;

public class CucumberHooks {
    @Before("@Web")
    public void beforeWeb() throws Exception {
        Properties browserProps = new Properties();
        browserProps.load(Files.newInputStream(Paths.get("src/test/resources/config.properties")));

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
    public void beforeChrome() {
        DriverController.instance.startChrome("--disable-extensions");
    }

    @Before("@Firefox")
    public void beforeFirefox() {
        DriverController.instance.startFirefox("--disable-extensions");
    }

    @Before("@HeadlessChrome")
    public void beforeChromeHeadless() {
        DriverController.instance.startChrome("--headless");
    }

    @Before("@HeadlessFirefox")
    public void beforeHeadlessFirefox() {
        DriverController.instance.startFirefox("--headless");
    }

    @AfterStep
    public void addScreenshot(Scenario scenario) {
        //validate if scenario has failed
        //if(scenario.isFailed()) {
        //    final byte[] screenshot = ((TakesScreenshot) browser()).getScreenshotAs(OutputType.BYTES);
        //    scenario.attach(screenshot, "image/png", "image");
        //}
    }

    @After
    public void stopWebDriver() {
        DriverController.instance.stopWebDriver();
    }
}
