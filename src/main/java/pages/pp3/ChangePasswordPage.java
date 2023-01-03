package pages.pp3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.helpers.WaitHelpers;

import java.util.concurrent.ExecutionException;

public class ChangePasswordPage {
    //protected WebElementHelpers elementHelpers = new WebElementHelpers();

    public ChangePasswordPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

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
    private WebElement emailValueTxt;

    @FindBy(how = How.ID, using = "notYou-button")
    private WebElement notYouLink;

    @FindBy(how = How.ID, using = "password-input")
    private WebElement newPassword;

    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div[2]/form/div[1]/div[2]")
    private WebElement passwordRequirementsTxt;

    @FindBy(how = How.XPATH, using = "//span[(.)='Change Password']")
    private WebElement changePasswordBtn;

    @FindBy(how = How.XPATH, using = "//span[(.)='Password changed successfully']")
    private WebElement passwordChangedTxt;

    /**
     * verifyChangePasswordScreen() - Verify Change Password Screen
     */
    public void verifyChangePasswordScreen() throws ExecutionException, InterruptedException {
        //WaitHelpers.waitFluentWait(newPassword, 240);
        WaitHelpers.waitForStaleElement(newPassword);
        //TODO: instanceOf(EmailPage.class).verifyHeader();

        // Verify elements are displayed
        createNewPasswordTxt.isDisplayed();
        emailValueTxt.isDisplayed();
        notYouLink.isDisplayed();
        newPassword.isDisplayed();
        passwordRequirementsTxt.isDisplayed();
        changePasswordBtn.isDisplayed();
    }

    /**
     * enterNewPassword() - Enter new password in the password field.
     * @param password
     */
    public void enterNewPassword(String password) {
        //elementHelpers.webSendKeys(newPassword, password, true);
        newPassword.sendKeys(password);
    }

    /**
     * clickOnChangePasswordBtn() - Clicks on the "Change Password" button
     */
    public void clickOnChangePasswordBtn() {
        //elementHelpers.webClick(changePasswordBtn);
        changePasswordBtn.click();
    }

    /**
     * passwordChangedMsg() - Verifies "Password Changed Successfully" message is shown
     */
    public void passwordChangedMsg() {
        //Assert.assertEquals("Password changed successfully", WebElementHelpers.webGetText(passwordChangedTxt));
    }
}
