package flexshopper.com.appium.common;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AppiumBase {
    public static AppiumDriver<?> driver;

    public AppiumBase(){
        //AppiumBase.driver = new AppiumDriverManager().getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(AppiumBase.driver), this);
    }
}
