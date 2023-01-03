package pages;

import org.openqa.selenium.support.PageFactory;
import utils.selenium.Driver;

public class Page {
    public static <T extends BasePage> T instanceOf(Class<T> clazz) {
        return PageFactory.initElements(Driver.browser(), clazz);
    }
}
