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
                System.setProperty("webdriver.chrome.whitelistedIps", "");
                instance.webDriver = ChromeWebDriver.loadChromeDriver(arg);
            }
        }

        /**
        * TODO: To be added when Docker support is added again
        *    else if(System.getenv("LOCAL").trim().equals("false")) {
        *         instance.webDriver = ChromeRemoteWebDriver.loadChromeDriver(arg);
         *   }
        */
    }

    public void startFirefox(String arg) {
        if(instance.webDriver != null) return;
        if (System.getenv("LOCAL")==null) {
            String local = dotenv.get("LOCAL");
            assert local != null;
            if (local.equals("true")) {
                System.setProperty("webdriver.firefox.whitelistedIps", "");
                instance.webDriver = FirefoxWebDriver.loadFirefoxDriver(arg);
            }
        }

        /**
         * TODO: To be added when Docker support gets added again
         *    else if(System.getenv("LOCAL").trim().equals("false")) {
         *        instance.webDriver = FirefoxRemoteWebDriver.loadFirefoxDriver(arg);
         *    }
         */
    }

    public void stopWebDriver() {
        if (instance.webDriver == null) return;

        try {
            instance.webDriver.quit();
        } catch (Exception e) {
            log.error(e + "::WebDriver stop error");
        }

        instance.webDriver = null;
        log.debug(":: WebDriver stopped");
    }
}
