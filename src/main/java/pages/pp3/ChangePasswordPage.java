package pages.pp3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.helpers.WebElementHelpers;

public class ChangePasswordPage extends EmailPage {
    protected WebElementHelpers elementHelpers = new WebElementHelpers();

    /**
     * Elements - PP3's Verification Change Password Screen
     */
    @FindBy(how = How.CSS, using = "#subtitle > img")
    private WebElement flexshopperLogo;

    @FindBy(how = How.XPATH, using = "//h3[normalize-space(.)='How would you like to reset your password? You can verify by email or request a text to be sent to the mobile number linked to your account.']")
    private WebElement resetYourPasswordTxt;

    @FindBy(how = How.XPATH, using = "//p[(.)='Create a new password for your account']")
    private WebElement createNewPasswordTxt;

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div[2]/div/div/div[1]/h3")
    public WebElement emailValueTxt;

    @FindBy(how = How.ID, using = "notYou-button")
    private WebElement notYouLink;

    @FindBy(how = How.ID, using = "password-input")
    private WebElement newPassword;

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div[2]/form/div[1]/div[2]")
    private WebElement passwordRequirementsTxt;

    @FindBy(how = How.XPATH, using = "//span[(.)='Change Password']")
    public WebElement changePasswordBtn;

    /**
     * verifyChangePasswordScreen() - Verify Change Password Screen
     */
    public void verifyChangePasswordScreen() throws InterruptedException {
        Thread.sleep(3000); //TODO: Replace this with a Java ScheduledExecutorService or other form of wait
        elementHelpers.webElementIsDisplayed(createNewPasswordTxt);
        elementHelpers.webElementIsDisplayed(emailValueTxt);
        elementHelpers.webElementIsDisplayed(notYouLink);
        elementHelpers.webElementIsDisplayed(newPassword);
        elementHelpers.webElementIsDisplayed(passwordRequirementsTxt);
        elementHelpers.webElementIsDisplayed(changePasswordBtn);
    }
}
