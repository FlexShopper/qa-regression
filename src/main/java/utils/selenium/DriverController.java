package utils.selenium;

import io.github.cdimascio.dotenv.Dotenv;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utils.drivers.ChromeWebDriver;
import utils.drivers.FirefoxWebDriver;

public class DriverController {
    public static DriverController instance = new DriverController();

    WebDriver webDriver;
    Dotenv dotenv = Dotenv.load();

    private static Logger log = LogManager.getLogger(DriverController.class.getName());

    public void startChrome(String arg) {
        if(instance.webDriver != null) return;
        if (System.getenv("LOCAL")==null) {
            String local = dotenv.get("LOCAL");
            assert local != null;
            if (local.equals("true")) {
                // Added to solve error: " [SEVERE]: bind() failed: Cannot assign requested address (99)."
                System.setProperty("webdriver.chrome.whitelistedIps", "");
                instance.webDriver = ChromeWebDriver.loadChromeDriver(arg);
            }
        }
    }

    public void startFirefox(String arg) {
        if(instance.webDriver != null) return;
        if (System.getenv("LOCAL")==null) {
            String local = dotenv.get("LOCAL");
            assert local != null;
            if (local.equals("true")) {
                // Added to solve error: " [SEVERE]: bind() failed: Cannot assign requested address (99)."
                System.setProperty("webdriver.firefox.whitelistedIps", "");
                instance.webDriver = FirefoxWebDriver.loadFirefoxDriver(arg);
            }
        }
    }

    public void stopWebDriver() {
        if (instance.webDriver == null) return;

        try {
            instance.webDriver.quit();
            instance.webDriver.close();
        } catch (Exception e) {
            log.error(e + "::WebDriver stop error");
        }

        instance.webDriver = null;
        log.debug(":: WebDriver stopped");
    }
}
