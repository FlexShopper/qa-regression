package utils.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeWebDriver {
    private static WebDriver driver;

    public static void setupChromeDriver() {
        WebDriverManager.chromedriver().setup();
    }

    public static WebDriver loadChromeDriver(String chromeArgument) {
        setupChromeDriver();

        ChromeDriverService driverService = ChromeDriverService.createDefaultService();

        // Chrome needs to run in Headless mode in the Jenkins CI to solve error: "DevToolsActivePort file doesn't exist"
        ChromeOptions options = new ChromeOptions();
        options.addArguments(chromeArgument);

        driver = new ChromeDriver(driverService, options);
        return driver;
    }
}
