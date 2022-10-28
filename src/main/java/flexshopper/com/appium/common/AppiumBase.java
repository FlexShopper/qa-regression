package flexshopper.com.appium.common;

import flexshopper.com.managers.CapabilitiesManager;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumBase {
    public static AppiumDriver<?> driver;
    public String platform = "ios";

    public AppiumBase() {
        CapabilitiesManager capabilitiesManager = new CapabilitiesManager();

        //Instantiate Appium Driver
        try {
            driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilitiesManager.getCapabilities());

        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }
}