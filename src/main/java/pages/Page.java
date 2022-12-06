package pages;

import org.openqa.selenium.support.PageFactory;
import pages.pp3.EmailPage;
import utils.helpers.SendEmail;

import static utils.selenium.Driver.browser;

public class Page {
    public static <T extends EmailPage> T instanceOf(Class<SendEmail> clazz) {
        return PageFactory.initElements(browser(), clazz);
    }
}