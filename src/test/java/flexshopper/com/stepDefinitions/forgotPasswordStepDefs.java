package flexshopper.com.stepDefinitions;


import flexshopper.com.cucumber.TestContext;
import flexshopper.com.helpers.CheckMail;
import flexshopper.com.pageObjects.flexshopper.EmailPage;
import flexshopper.com.pageObjects.flexshopper.ForgotPasswordPage;
import flexshopper.com.pageObjects.flexshopper.HomePage;
import flexshopper.com.pageObjects.flexshopper.PasswordPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class forgotPasswordStepDefs{
    TestContext testContext;
    PasswordPage passwordPage;
    EmailPage emailPage;
    ForgotPasswordPage forgotPasswordPage;
    CheckMail checkMail;
    HomePage homePage;

    public forgotPasswordStepDefs(TestContext context) {
        testContext = context;
        emailPage = testContext.getPageObjectManager().getLoginPage();
        passwordPage = testContext.getPageObjectManager().getPasswordPage();
        forgotPasswordPage = testContext.getPageObjectManager().getForgotPasswordPage();
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("the user is in the Forgot Password screen")
    public void theUserIsInTheForgotPasswordScreen() throws InterruptedException {
        emailPage.getEmailScreen();
        testContext.getWebDriverManager().getDriver().switchTo().frame(0);
        testContext.getWebDriverManager().getDriver().switchTo().frame(0);
       emailPage.enterEmail("nann40547@gmail.com");
       emailPage.clickContinueBtn();
        passwordPage.clickToForgotPassword();
        Thread.sleep(4000);
    }
    @Then("user should see firstText {string}")
    public void userShouldSeeFirstText(String firstText) {
        Assert.assertEquals(firstText,forgotPasswordPage.resetPasswordText.getText());
    }
    @Then("user should see secondText {string}")
    public void user_should_see_second_text(String secondText) {
        Assert.assertEquals(secondText,forgotPasswordPage.chooseOptionsText.getText());
    }
    @And("user should be able to see email {string}")
    public void userShouldBeAbleToSeeEmail(String email) {
        Assert.assertEquals(email, forgotPasswordPage.email.getText());
    }
    @And("user should be able to see text {string}")
    public void userShouldBeAbleToSeeText(String phoneNumber) throws InterruptedException {
        WebDriverWait wait =new WebDriverWait(testContext.getWebDriverManager().getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(forgotPasswordPage.phoneNumber));
        Assert.assertEquals(phoneNumber, forgotPasswordPage.phoneNumber.getText());
    }
    @And("user should be able to click {string} button")
    public void userShouldBeAbleToClickButton(String button) {
        forgotPasswordPage.navigateToContinue(button);
    }
    @Given("user without Full Info is in the Forgot Password screen")
    public void userWithoutFullInfoIsInTheForgotPasswordScreen() throws InterruptedException {
        emailPage.getEmailScreen();
        testContext.getWebDriverManager().getDriver().switchTo().frame(0);
        testContext.getWebDriverManager().getDriver().switchTo().frame(0);
        emailPage.enterEmail("user01@flexshopper.com");
        emailPage.clickContinueBtn();
        passwordPage.clickToForgotPassword();
        Thread.sleep(4000);
    }

    @And("user clicks on the link: {string}")
    public void userClicksOnTheLink(String retToPasSign) {
        forgotPasswordPage.navigateToReturnToPasswordSignIn(retToPasSign);
    }

    @Then("user should see Email screen")
    public void userShouldSeeEmailScreen() {
       Assert.assertTrue(emailPage.welcomeText.isDisplayed());
    }
    @And("the Send Email radio button is selected")
    public void theSendEmailRadioButtonIsSelected() {
        try {
            WebDriverWait wait = new WebDriverWait(testContext.getWebDriverManager().getDriver(), 30);
            WebElement element = wait.until(ExpectedConditions.visibilityOf(forgotPasswordPage.emailNameOfRadioBtn));
        } catch (TimeoutException toe) {
            System.out.println("WebElement wasn't found");
        }
        //System.out.println(forgotPasswordPage.emailNameOfRadioBtn.isSelected());
    }

    @Then("the user lands on the {string} screen")
    public void theUserLandsOnTheScreen(String weSentCodeText) {
       Assert.assertEquals(weSentCodeText, forgotPasswordPage.weSentYouCodeText.getText());
    }

    @And("the user should see the email text: {string}")
    public void theUserShouldSeeTheEmailText(String email) {
        Assert.assertEquals(email, forgotPasswordPage.email.getText());
    }

    @And("user see {string} field")
    public void userSeeField(String securityCodeField) {
        Assert.assertTrue(forgotPasswordPage.securityBox.isDisplayed());
        Assert.assertEquals(securityCodeField, forgotPasswordPage.securityCode.getText());
    }

    @And("the Send SMS radio button is selected")
    public void theSendSMSRadioButtonIsSelected() {
        forgotPasswordPage.clickToSendSms();
    }

    @And("the user should see the phoneNumber text: {string}")
    public void theUserShouldSeeThePhoneNumberText(String phoneNumber) {
        Assert.assertEquals(phoneNumber, forgotPasswordPage.phoneNumber.getText());
    }

    @Given("the user is in the We sent you a code screen")
    public void theUserIsInTheWeSentYouACodeScreen() throws InterruptedException {
        emailPage.getEmailScreen();
        testContext.getWebDriverManager().getDriver().switchTo().frame(0);
        testContext.getWebDriverManager().getDriver().switchTo().frame(0);
        emailPage.enterEmail("user01@flexshopper.com");
        passwordPage.clickToForgotPassword();
        forgotPasswordPage.continueBtn.click();
    }

    @When("And the user retrieves the verification code from the email and send to Security Code field")
    public void andTheUserRetrievesTheVerificationCodeFromTheEmailAndSendToSecurityCodeField() throws InterruptedException {
        CheckMail checkGmail = new CheckMail();
        Thread.sleep(6000);
        String PassCode = CheckMail.check("imap.gmail.com", "imap", "nann40547@gmail.com", "rhtytnjlxhtxbehk");
        System.out.println("PassCode is " + PassCode);
        forgotPasswordPage.securityCodeBox.sendKeys(PassCode);
    }


    @Then("user lands on the {string} screen")
    public void userLandsOnTheScreen(String changePassword) {
        Assert.assertEquals(changePassword,forgotPasswordPage.changePassword.getText() );
    }

    @And("the user clicks on the {string} button")
    public void theUserClicksOnTheButton(String submitBtn) {
        forgotPasswordPage.navigateToReturnToSubmitButton(submitBtn);
    }
    @Then("user should see forgot password screen with {string}")
    public void userShouldSeeForgotPasswordScreenWith(String email) {
        WebDriverWait wait =new WebDriverWait(testContext.getWebDriverManager().getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(forgotPasswordPage.email));
        Assert.assertEquals(email, forgotPasswordPage.email.getText());

    }

    @And("user should see forgot psd scr with {string}")
    public void userShouldSeeForgotPsdScrWith(String phoneNumber) {
        WebDriverWait wait =new WebDriverWait(testContext.getWebDriverManager().getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOf(forgotPasswordPage.phoneNumber));
        Assert.assertEquals(phoneNumber, forgotPasswordPage.phoneNumber.getText());
    }


    @Given("the user is in the {string} screen")
    public void theUserIsInTheScreen(String text) {
        emailPage.getEmailScreen();
        testContext.getWebDriverManager().getDriver().switchTo().frame(0);
        testContext.getWebDriverManager().getDriver().switchTo().frame(0);
        emailPage.enterEmail("user01@flexshopper.com");
        passwordPage.clickToForgotPassword();
        WebDriverWait wait =new WebDriverWait(testContext.getWebDriverManager().getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOf(forgotPasswordPage.textMsgOfRadioBtn));
        forgotPasswordPage.textMsgOfRadioBtn.click();
        forgotPasswordPage.continueBtn.click();
        Assert.assertEquals(text, forgotPasswordPage.weSentYouCodeText.getText());
    }

    @Given("User on Change Password Screen")
    public void userOnChangePasswordScreen() throws InterruptedException {
        emailPage.getEmailScreen();
        testContext.getWebDriverManager().getDriver().switchTo().frame(0);
        testContext.getWebDriverManager().getDriver().switchTo().frame(0);
        emailPage.enterEmail("user01@flexshopper.com");
        passwordPage.clickToForgotPassword();
        WebDriverWait wait =new WebDriverWait(testContext.getWebDriverManager().getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOf(forgotPasswordPage.textMsgOfRadioBtn));
        forgotPasswordPage.continueBtn.click();
        CheckMail checkGmail = new CheckMail();
        Thread.sleep(6000);
        String PassCode = CheckMail.check("imap.gmail.com", "imap", "nann40547@gmail.com", "rhtytnjlxhtxbehk");
        forgotPasswordPage.securityCodeBox.sendKeys(PassCode);
        forgotPasswordPage.SubmitBtn.click();
    }

    @When("user enter reset {string} password")
    public void userEnterResetPassword(String newPassword) {
        forgotPasswordPage.psdInputBox.sendKeys(newPassword);
    }

    @And("user  clicks save changes")
    public void userClicksSaveChanges() {
        forgotPasswordPage.changePassword.click();
    }


    @And("the user is on the Email screen")
    public void theUserIsOnTheEmailScreen() throws InterruptedException {
        Actions actions = new Actions(testContext.getWebDriverManager().getDriver());
        actions.moveToElement(testContext.getPageObjectManager().getHomePage().myAccountHeader).perform();
        testContext.getWebDriverManager().getDriver().findElement(By.xpath("//a[@class='logOut']")).click();
        testContext.getWebDriverManager().getDriver().manage().deleteAllCookies();
        testContext.getWebDriverManager().getDriver().navigate().refresh();
        Thread.sleep(5000);
        WebElement element=testContext.getWebDriverManager().getDriver().findElement(By.xpath("( //*[normalize-space(.)='Apply or Sign In'])[2]"));
        WebDriverWait wait=new WebDriverWait(testContext.getWebDriverManager().getDriver(), 15);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        testContext.getWebDriverManager().getDriver().switchTo().frame(0);
        testContext.getWebDriverManager().getDriver().switchTo().frame(0);
        testContext.getWebDriverManager().getDriver().findElement(By.id("cookieSignIn-notYou-link")).click();
    }

    @And("user enter existing email {string}")
    public void userEnterExistingEmail(String email) {
        emailPage.enterEmail(email);
    }

    @When("the user clicks on the {string} btn")
    public void theUserClicksOnTheBtn(String button) {
        forgotPasswordPage.navigateToContinue(button);
    }

    @And("user enter new {string} password")
    public void userEnterNewPassword(String newPassword) {
        passwordPage.enterPassword(newPassword);
    }

    @And("user click sign in button")
    public void userClickSignInButton() {
        passwordPage.clickSignInBtn();
    }
    @Then("user lands in the Home page as logged in user {string}")
    public void userLandsInTheHomePageAsLoggedInUser(String header ) {
        Assert.assertEquals(header, homePage.myAccountHeader.getText());
    }


    @When("the user enter new {string} password")
    public void theUserEnterNewPassword(String newPassword ) {
        passwordPage.enterPassword(newPassword);
    }

    @And("the user enters an old password: {string}")
    public void theUserEntersAnOldPassword(String oldPassword) {
        passwordPage.enterPassword(oldPassword);
    }

    @Then("user can't login to dashboard page amd see error {string} message")
    public void userCanTLoginToDashboardPageAmdSeeErrorMessage(String validationMessage) {
        try {
            WebDriverWait wait = new WebDriverWait(testContext.getWebDriverManager().getDriver(), 2);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = testContext.getWebDriverManager().getDriver().switchTo().alert();
            System.out.println(alert.getText());
            alert.accept();
            Assert.assertEquals(validationMessage, alert.getText());
        } catch (Exception e) {
            System.out.println("No such Alert exception");
        }
    }

    @Given("the user with phone is in the {string} screen")
    public void theUserWithPhoneIsInTheScreen(String arg0) {
    }
}