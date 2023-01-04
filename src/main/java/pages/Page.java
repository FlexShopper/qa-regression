package pages;

import org.openqa.selenium.support.PageFactory;
import pages.pp3.EmailPage;
import utils.selenium.Driver;

public class Page {
    public static <T extends EmailPage> T instanceOf(Class<T> clazz) {
        return PageFactory.initElements(Driver.browser(), clazz);
    }
}
