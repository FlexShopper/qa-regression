package tsys.appium.common;

import org.openqa.selenium.support.PageFactory;
import managers.DriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AppiumBase {
    public static AppiumDriver<?> driver;

    public AppiumBase(){
        AppiumBase.driver = new DriverManager().getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(AppiumBase.driver), this);
    }
}
