package utils.helpers;

public class SelectHelpers {

    public void selectFromDropdown(String textToSelect) {
        /**
        try {
            WebDriver driver = browser();
            List<WebElement> optionToSelect = driver.findElements(By.tagName("li"));
            for(WebElement option : optionToSelect) {
                //System.out.println("Text: " + element.getText());
                if (option.getText().equals(textToSelect)) {
                    System.out.println("Trying to select: " + textToSelect);
                    option.click();
                    break;
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println(e.getStackTrace());
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
         */
    }

    public boolean optionsReturned() {
        /**
        try {
            WebDriver driver = browser();
            List <WebElement>elements = driver.findElements(By.tagName("li"));
            if(elements.size() > 0) { return true; };
        } catch (NoSuchElementException e) {
            System.out.println(e.getStackTrace());
        }
         */
        return false;
    }
}
