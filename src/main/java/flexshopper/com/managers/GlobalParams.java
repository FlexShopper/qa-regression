package flexshopper.com.managers;

import flexshopper.com.appium.utilities.Settings;

public class GlobalParams {
    /**
     *  Thread Local Objects - Allow the automation to support parallel execution
     *  params: Platform Name, Device's UDID and Device's Name are common to Android and iOS
     */
    private final static ThreadLocal<String> platformName = new ThreadLocal<>();
    private final static ThreadLocal<String> udid = new ThreadLocal<>();
    private final static ThreadLocal<String> deviceName = new ThreadLocal<>();
    private final static ThreadLocal<String> appStart = new ThreadLocal<>();

    /**
     *  params:
     *	System Port and Chrome's Driver Port Name apply to Android only
     */
    private final static ThreadLocal<String> systemPort = new ThreadLocal<>();
    private final static ThreadLocal<String> chromeDriverPort = new ThreadLocal<>();

    /**
     *  params:
     *	WDA Local Port and Web Kit Debug Proxy Port applies to iOS only
     */
    private final static ThreadLocal<String> wdaLocalPort = new ThreadLocal<>();
    private final static ThreadLocal<String> webkitDebugProxyPort = new ThreadLocal<>();

    /**
     * Methods below create and return Platform Name
     */
    public void setPlatformName(String platformName1){
        platformName.set(platformName1);
    }

    public String getPlatformName(){
        return platformName.get();
    }

    /**
     * Methods below create and return how the app starts description
     */
    public void setAppStart(String property) {
        appStart.set(property);
    }

    public String getAppStart(){
        return appStart.get();
    }

    /**
     * Methods below create and return Device's UDID
     */
    public String getUDID() {
        return udid.get();
    }

    public void setUDID(String udid2) {
        udid.set(udid2);
    }

    /**
     * Methods below create and return Device Name
     */
    public String getDeviceName() {
        return deviceName.get();
    }

    public void setDeviceName(String deviceName2) {
        deviceName.set(deviceName2);
    }

    /**
     * Methods below create and return System Port
     */
    public String getSystemPort() {
        return systemPort.get();
    }

    public void setSystemPort(String systemPort2) {
        systemPort.set(systemPort2);
    }

    /**
     * Methods below create and return Chrome's Driver Port
     */
    public String getChromeDriverPort() {
        return chromeDriverPort.get();
    }

    public void setChromeDriverPort(String chromeDriverPort2) {
        chromeDriverPort.set(chromeDriverPort2);
    }

    /**
     * Methods below create and return WDA Local Port
     */
    public String getWdaLocalPort() {
        return wdaLocalPort.get();
    }

    public void setWdaLocalPort(String wdaLocalPort2) {
        wdaLocalPort.set(wdaLocalPort2);
    }

    /**
     * Methods below create and return Web Kit Debug Proxy Port
     */
    public String getWebkitDebugProxyPort() {
        return webkitDebugProxyPort.get();
    }

    public void setWebkitDebugProxyPort(String webkitDebugProxyPort2) {
        webkitDebugProxyPort.set(webkitDebugProxyPort2);
    }

    /**
     * Initialize Global Parameters
     */
    public void initializeGlobalParams(){
        GlobalParams parameters = new GlobalParams();

        /**
         * Params below used if automation runs from TestRunner instead of Maven commands
         * If parameters are passed via Maven, they will be received using the System.getProperty command
         */
        parameters.setPlatformName(System.getProperty("platformName", "Android"));
        parameters.setAppStart((Settings.appStartValue == null ? System.getProperty("appStartValue", "FreshInstall") : Settings.appStartValue));

        // TODO AN (08/06/201) - Move all the data below to JSON file(s)
        parameters.setDeviceName(System.getProperty("deviceName", "Galaxy S9"));
        parameters.setUDID(System.getProperty("deviceSerial", "48434a464e313498"));

        switch(parameters.getPlatformName()){
            case "Android":
                parameters.setSystemPort(System.getProperty("systemPort", "10000"));
                parameters.setChromeDriverPort(System.getProperty("chromeDriverPort", "11000"));
                break;
            case "iOS":
                parameters.setWdaLocalPort(System.getProperty("wdaLocalPort", "10001"));
                parameters.setWebkitDebugProxyPort(System.getProperty("webkitDebugProxyPort", "11001"));
                break;
            default:
                throw new IllegalStateException("Invalid Platform Name!");
        }
    }
}
