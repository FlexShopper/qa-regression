package managers;

import org.openqa.selenium.WebDriver;
import pages.pp3.EmailPage;
import pages.pp3.PasswordPage;

public class PageObjectManager {
    private WebDriver driver;
    private EmailPage emailPage;
    private PasswordPage passwordPage;
/**
    private ForgotPasswordPage forgotPasswordPage;
    private VerificationCodePage verificationCodePage;
    private ProfileInfoPage profileInfoPage;
    private PersonalInfoPage personalInfoPage;
    private BankingInfoPage bankingInfoPage;
*/
    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public EmailPage getEmailPage(){
        return (emailPage == null) ? emailPage = new EmailPage(driver) : emailPage;
    }

    public PasswordPage getPasswordPage() {
        return (passwordPage == null) ? passwordPage = new PasswordPage(driver) : passwordPage;
    }
/**
    public ForgotPasswordPage getForgotPasswordPage() {
        return (forgotPasswordPage == null) ? forgotPasswordPage = new ForgotPasswordPage(driver) : forgotPasswordPage;
    }

    public VerificationCodePage getVerificationCodePage() {
        return (verificationCodePage == null) ? verificationCodePage = new VerificationCodePage(driver) : verificationCodePage;
    }

    public ProfileInfoPage getProfileInfoPage(){
        return (profileInfoPage == null) ? profileInfoPage = new ProfileInfoPage(driver) : profileInfoPage;
    }

    public PersonalInfoPage getPersonalInfoPage(){
        return (personalInfoPage == null) ? personalInfoPage = new PersonalInfoPage(driver) : personalInfoPage;
    }

    public BankingInfoPage getBankingInfoPage(){
        return (bankingInfoPage == null) ? bankingInfoPage = new BankingInfoPage(driver) : bankingInfoPage;
    }
*/
 }
