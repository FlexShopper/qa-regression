package flexshopper.com.pageObjects.flexshopper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProfileInfoPage {
    public AppiumDriver<?> driver;

    /**
     * Constructor & Page Initialization
     */
    public ProfileInfoPage(WebDriver driver) {
        this.driver= (AppiumDriver<?>) driver;
        PageFactory.initElements(driver,this);
    }


    /**
     * Elements
     */
    @FindBy(how = How.XPATH, using = "//h2[text()='Profile Info']")
    public WebElement profileInfoTab;


    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div/div/div/form/div/div[2]/div/div[1]/h3")
    @AndroidBy(xpath = "//*[@nodeName='H3']")
    public WebElement emailAddressTxt;

    @FindBy(how = How.ID, using = "notYou-button")
    @AndroidBy(xpath = "//*[@id='notYou-button' and @nodeName='BUTTON']")
    private WebElement notYouBtn;

    @FindBy(how = How.ID, using = "firstName-input")
    @AndroidBy(xpath = "//*[@name='firstName']")
    private WebElement firstNameField;

    @FindBy(how = How.ID, using = "lastName-input")
    @AndroidBy(xpath = "//*[@name='lastName']")
    private WebElement lastNameField;

   @FindBy(how = How.ID, using = "phone1-input")
   @AndroidBy(xpath = "//*[@name='phone1']")
    private WebElement phoneField;

    @FindBy(how = How.ID, using = "street1-input")
    @AndroidBy(xpath = "//*[@id='street1-input']")
    private WebElement streetField;

    @FindBy(how = How.ID, using = "enterManualLink")
    @AndroidBy(xpath = "//*[@id='enterManualLink' and @text='Enter Address Manually']")
    private WebElement enterManualLink;

    @AndroidBy(xpath = "//*[@name='street2']")
    private WebElement unitNumberField;

    @AndroidBy(xpath = "//*[@name='city']")
    private WebElement cityField;

    @AndroidBy(xpath = "//*[@name='region']")
    private WebElement regionField;

    @AndroidBy(xpath = "//*[@name='postalCode']")
    private WebElement postalCodeField;

    @FindBy(how =How.CSS, using = ".sc-jhAzac.dVrxkJ")
    @AndroidBy(xpath = "//*[@text='Sign me up to receive the latest news on FlexShopper and MyFlexLending products and promotions. We respect your privacy. Please view our ']")
    public WebElement signMeUpField;

    @FindBy(how = How.XPATH, using = "//span[(.)='Continue']")
    @AndroidBy(xpath = "//*[@id='formSubmitButton' and @nodeName='BUTTON']")
    private WebElement formSubmitBtn;
    @FindBy(how = How.XPATH, using = "//*[@id='headerPanel-close-button']")
    private WebElement closeBtn;
    @FindBy(how = How.XPATH, using = "//*[@id='headerPanel-faq-button']")
    private WebElement FAQBtn;
    @FindBy(how = How.XPATH, using = "//*[@id='headerPanel']/div[2]/div/div")
    private WebElement FlexShopperLogo;
    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div/div/div/form/div/div[6]/label/div[2]/span/a")
    private WebElement privacyPolicy;
    @FindBy(how = How.ID, using = "footer-privacy-button")
    private WebElement privacyFooter;
    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[3]/div/div/div/div[2]/div/p[1]")
    private WebElement privacyFooterInfo;
    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[3]/div/div/div/div[2]/div/p[1]")
    private WebElement privacyPolicyInfo;
    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]/div[2]/div/div/div/div/footer/div/div[1]")
    private WebElement copyrightInfo;
    @FindBy(how = How.ID, using = "footer-accessibility-button")
    private WebElement Accessibility;
    @FindBy(how = How.ID, using = "footer-terms-button")
    private WebElement Terms;
    @FindBy(how = How.XPATH, using = "//*[@id='app']/div[3]/div/div/div/div[2]/div/p[2]")
    private WebElement termsInfo;
    @FindBy(how = How.XPATH, using = "(//span[(.)='No special characters'])[1]")
    public WebElement errMsgFirstNameField;
    @FindBy(how = How.XPATH, using = "(//span[(.)='No special characters'])[2]")
    public WebElement errMsgLastNameField;
    @FindBy(how = How.ID, using = "formSubmitButton")
    private WebElement continueBtn;


    /**
     * Classes
     */

    /**
     * userIsInProfileInfoPage() - Verify user landed in the Profile Info screen
     */
    public void userIsInProfileInfoPage() {
        Assert.assertTrue(profileInfoTab.isDisplayed());
        Assert.assertTrue(emailAddressTxt.isDisplayed());
        Assert.assertTrue(notYouBtn.isDisplayed());
        Assert.assertTrue(enterManualLink.isDisplayed());
        Assert.assertTrue(firstNameField.isDisplayed());
        Assert.assertTrue(lastNameField.isDisplayed());
        Assert.assertTrue(phoneField.isDisplayed());
        Assert.assertTrue(streetField.isDisplayed());
        Assert.assertTrue(enterManualLink.isDisplayed());
      //  Assert.assertTrue(signMeUpField.isDisplayed());
        Assert.assertTrue(formSubmitBtn.isDisplayed());
    }
    public void enterName(String name){
        firstNameField.sendKeys(name);
    }
    public void enterLastName(String lastName){
        lastNameField.sendKeys(lastName);
    }
    public void enterPhone(String phoneNumber){
        phoneField.sendKeys(phoneNumber);
    }
    public void enterStreet(String street){
        streetField.sendKeys(street);
    }
    public void clickEnterAddressManually(){
        enterManualLink.click();
    }
    public void closeBtnExist(){
        Assert.assertTrue(closeBtn.isDisplayed());
    }
    public void FAQBtnExist(){
        Assert.assertTrue(FAQBtn.isDisplayed());
    }
    public void FlexShopperLogoExist(){
        Assert.assertTrue(FlexShopperLogo.isDisplayed());
    }

    public void NotYouExist(){
        Assert.assertTrue(notYouBtn.isDisplayed());
    }
    public void firstNameIsExist(){
        Assert.assertTrue(firstNameField.isDisplayed());
    }
    public void lastNameIsExist(){
        Assert.assertTrue(lastNameField.isDisplayed());
    }
    public void phoneNumberIsExist(){
        Assert.assertTrue(phoneField.isDisplayed());
    }
    public void homeAddressIsExist(){
        Assert.assertTrue(streetField.isDisplayed());
    }
    public void enterManuallyLinkIsExist(){
        Assert.assertTrue(enterManualLink.isDisplayed());
    }
    public void privacyPolicyIsExist(){
        Assert.assertTrue(privacyPolicy.isDisplayed());
    }
    public void signMeUpSelected(){
       // Assert.assertTrue(signMeUpField.isSelected());
    }
    public void continueBtnIsGrayed(){
        Assert.assertTrue(driver.findElement(By.id("formSubmitButton")).isDisplayed());
    }
    public void clickPrivacyPolicy(){
      privacyPolicy.click();

    }
    public void clickPrivacy(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", privacyFooter);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",privacyFooter);
    }
    public void clickAccessibility(){
        Accessibility.click();
    }
    public void privacyPolicyInfo(){
        Assert.assertTrue(privacyPolicyInfo.getText().contains("FlexShopper, LLC and MyFlexLending"));
    }
    public void copyrightInfoExist(){
        Assert.assertTrue(copyrightInfo.isDisplayed());
    }
    public void accessibilityExist(){
        Assert.assertTrue(Accessibility.isDisplayed());
    }
    public void termsExist(){
        Assert.assertTrue(Terms.isDisplayed());
    }
    public void privacyFooterExist(){
        Assert.assertTrue(privacyFooter.isDisplayed());
    }
    public void termsInfoExist(){
        Assert.assertTrue(termsInfo.getText().contains("IF YOU DO NOT AGREE WITH ANY OF THE TERMS OF THIS AGREEMENT, DO NOT ACCESS OR OTHERWISE USE THE SITE OR ANY INFORMATION CONTAINED IN IT"));
    }
    public void clickTermsLink(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Terms);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",Terms);
    }
    public void privacyInfo(){
        Assert.assertTrue(privacyFooterInfo.getText().contains("FlexShopper, LLC and MyFlexLending"));
    }
    public void notYouClick(){
        notYouBtn.click();
    }
    public void clickContinueBtn(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",continueBtn);
    }

}
