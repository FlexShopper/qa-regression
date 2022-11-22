package utils.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;
import static utils.helpers.WebElementHelpers.webWaitForSeconds;

public class SelectHelpers {
    public void selectOptionWithText(WebElement element, String textToSelect) {
        try {
            WebElement options = webWaitForSeconds().until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
            List<WebElement> optionsToSelect = options.findElements(By.tagName("li"));
            for(WebElement option : optionsToSelect) {
                if (option.getText().equals(textToSelect)) {
                    System.out.println("Trying to select: " + textToSelect);
                    option.click();
                    break;
                }
            }

        } catch (NoSuchElementException e) {
            System.out.println(e.getStackTrace());
        }
        catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public boolean optionsReturned(WebElement element) {
        try {
            WebElement options = webWaitForSeconds().until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
            List <WebElement>elements = options.findElements(By.tagName("li"));
            if(elements.size() > 0) { return true; };
        } catch (NoSuchElementException e) {
            System.out.println(e.getStackTrace());
        }
        return false;
    }
}
