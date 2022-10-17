package flexshopper.com.appium.utilities;

/**
 * Settings - Class to store global parameters
 */
public class Settings {
    //This value is set from the AppLaunchHooks.doDriverInitialize() method if appLaunch hook is called. Default value from GlobalParams setAppStart() method
    public static String appStartValue;
    //Value set when starting the appium server in the managers.ServerManager class
    public static String ChromePort;
    public static String appiumUrl;
    public static boolean haltRemainingTests;
}
