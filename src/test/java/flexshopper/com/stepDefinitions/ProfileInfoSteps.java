package flexshopper.com.stepDefinitions;

import flexshopper.com.cucumber.TestContext;
import flexshopper.com.managers.CapabilitiesManager;
import flexshopper.com.pageObjects.flexshopper.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ProfileInfoSteps {

    EmailPage emailPage;
    PasswordPage passwordPage;
    ProfileInfoPage profileInfoPage;
    ForgotPasswordPage forgotPasswordPage;
    public AppiumDriver<?> driver;

    @When("the user lands in the ProfileInfo screen")
    public void theUserLandsInTheProfileInfoScreen() {
        CapabilitiesManager capabilitiesManager = new CapabilitiesManager();
        try {
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilitiesManager.getCapabilities());
            driver.get("https://fmweb.staging.flexint.net/?do=pp3");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        emailPage=new EmailPage(driver);
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        emailPage.enterEmail("user21@flexshopper.com");
        emailPage.clickContinueBtn();
    }
    @Then("the user can see the close button")
    public void theUserCanSeeTheCloseButton() {
        profileInfoPage=new ProfileInfoPage(driver);
        profileInfoPage.closeBtnExist();
    }

  /**
   *   TODO
   * @And("the user can see the title FlexShopper")
    public void theUserCanSeeTheTitleFlexShopper() {
        testContext.getWebDriverManager().getDriver().switchTo().frame(0);
        profileInfoPage.FlexShopperLogoExist();
    }*/

    @And("the user can see the FAQ link")
    public void theUserCanSeeTheFAQLink() {
        profileInfoPage.FAQBtnExist();
    }


    @Then("the user can see {string}:")
    public void theUserCanSee(String text) {
        profileInfoPage=new ProfileInfoPage(driver);
        Assert.assertEquals(text, profileInfoPage.profileInfoTab.getText());
    }

    @And("the user can see the {string} address")
    public void theUserCanSeeTheAddress(String email) {
        Assert.assertEquals(email, profileInfoPage.emailAddressTxt.getText());
    }

    @And("the user can see the Not You? link")
    public void theUserCanSeeTheNotYouLink() {
        profileInfoPage.NotYouExist();
    }

    @And("the user can see the First Name field")
    public void theUserCanSeeTheFirstNameField() {
        profileInfoPage.firstNameIsExist();
    }

    @And("the user can see the Last Name field")
    public void theUserCanSeeTheLastNameField() {
        profileInfoPage.lastNameIsExist();
    }

    @And("the user can see the Mobile Number field")
    public void theUserCanSeeTheMobileNumberField() {
        profileInfoPage.phoneNumberIsExist();
    }

    @And("the user can see the Home Address field")
    public void theUserCanSeeTheHomeAddressField() {
        profileInfoPage.homeAddressIsExist();
    }

    @And("the user can see the Enter Address Manually link")
    public void theUserCanSeeTheEnterAddressManuallyLink() {
        profileInfoPage.enterManuallyLinkIsExist();
    }

    @And("the user can see the text {string}")
    public void theUserCanSeeTheText(String signUp) {
     //  Assert.assertEquals(signUp, profileInfoPage.signMeUpField.getText());
    }

    @And("the user can see the link Privacy Policy")
    public void theUserCanSeeTheLinkPrivacyPolicy() {
        profileInfoPage.privacyPolicyIsExist();
    }

    @And("the sign me up is selected by default")
    public void theSignMeUpIsSelectedByDefault() {
        profileInfoPage.signMeUpSelected();
    }

    @And("the user can see the Continue button grayed out")
    public void theUserCanSeeTheContinueButtonGrayedOut() {
     profileInfoPage.continueBtnIsGrayed();
    }

    @When("user clicks on the Privacy Policy link")
    public void userClicksOnThePrivacyPolicyLink() {
        profileInfoPage=new ProfileInfoPage(driver);
        profileInfoPage.clickPrivacyPolicy();
    }

    @Then("the user can see the privacy policy information")
    public void theUserCanSeeThePrivacyPolicyInformation() {
        profileInfoPage.privacyPolicyInfo();}

    @Then("the user can see the copyright information")
    public void theUserCanSeeTheCopyrightInformation() {
        profileInfoPage=new ProfileInfoPage(driver);
        profileInfoPage.copyrightInfoExist();}

    @And("the user can see the Accessiblity link")
    public void theUserCanSeeTheAccessiblityLink() {
      profileInfoPage.accessibilityExist();
    }

    @And("the user can see the Terms link")
    public void theUserCanSeeTheTermsLink() {
        profileInfoPage.termsExist();}

    @And("the user can see the Privacy link")
    public void theUserCanSeeThePrivacyLink() {
        profileInfoPage.privacyFooterExist();
    }

    @When("the user clicks on the Accessibility  link")
    public void theUserClicksOnTheAccessibilityLink() {
        profileInfoPage=new ProfileInfoPage(driver);
        profileInfoPage.clickAccessibility();
    }


    @When("the user clicks on the Terms  link")
    public void theUserClicksOnTheTermsLink() {
        profileInfoPage=new ProfileInfoPage(driver);
        profileInfoPage.clickTermsLink();
    }

    @Then("the user can see the terms information")
    public void theUserCanSeeTheTermsInformation() {
        //profileInfoPage.termsInfoExist();
    }

    @When("the user clicks on the Privacy link in the footer")
    public void theUserClicksOnThePrivacyLinkInTheFooter() {
        profileInfoPage=new ProfileInfoPage(driver);
        profileInfoPage.clickPrivacy();
    }

    @Then("the user can see the privacy information")
    public void theUserCanSeeThePrivacyInformation() {
        profileInfoPage.privacyInfo();
    }

    @And("the email address shown is not his")
    public void theEmailAddressShownIsNotHis() {
    }

    @When("the user clicks on the Not You link")
    public void theUserClicksOnTheNotYouLink() {
        profileInfoPage=new ProfileInfoPage(driver);
        profileInfoPage.notYouClick();
    }

    @Then("the user lands in the Email screen")
    public void theUserLandsInTheEmailScreen() {
        emailPage=new EmailPage(driver);
        emailPage.userIsInEmailScreen();
    }

    @When("the user enters an invalid first name: {string}")
    public void theUserEntersAnInvalidFirstName(String firstName) {
        profileInfoPage=new ProfileInfoPage(driver);
        profileInfoPage.enterName(firstName);
    }
    @And("the user clicks on the Continue button on Profile Page")
    public void theUserClicksOnTheContinueButtonOnProfilePage() {
        profileInfoPage=new ProfileInfoPage(driver);
        profileInfoPage.clickContinueBtn();
    }

    @Then("the user should see the validation message in first name filed: {string}")
    public void theUserShouldSeeTheValidationMessageInFirstNameFiled(String validationMess) {
        Assert.assertEquals(validationMess, profileInfoPage.errMsgFirstNameField.getText());
    }

    @When("the user enters an invalid last name: {string}")
    public void theUserEntersAnInvalidLastName(String lastName) {
        profileInfoPage=new ProfileInfoPage(driver);
        profileInfoPage.enterLastName(lastName);
    }

    @Then("the user should see the validation message in last name field: {string}")
    public void theUserShouldSeeTheValidationMessageInLastNameField(String validationMess) {
        Assert.assertEquals(validationMess, profileInfoPage.errMsgLastNameField.getText());
    }

    @When("the user enters an invalid mobile number: {string}")
    public void theUserEntersAnInvalidMobileNumber(String mobileNumber) {
        profileInfoPage=new ProfileInfoPage(driver);
        profileInfoPage.enterPhone(mobileNumber);
    }

    @Then("the user should see the validation message: {string}")
    public void theUserShouldSeeTheValidationMessage(String validationMess) {
       Assert.assertEquals(validationMess, profileInfoPage.errMsfMobileField.getText());
    }

    @When("the user enters an invalid zip code: {string}")
    public void theUserEntersAnInvalidZipCode(String zipCode) {
        profileInfoPage=new ProfileInfoPage(driver);
        profileInfoPage.clickEnterAddressManually();
        profileInfoPage.enterZipcode(zipCode);
    }

    @Then("the user should see the validation message in zip code filed: {string}")
    public void theUserShouldSeeTheValidationMessageInZipCodeFiled(String validationMess) {
        Assert.assertEquals(validationMess, profileInfoPage.errMsgZipCode.getText());
    }

    @When("the user has entered {string} information Profile page and  starts entering a valid address")
    public void theUserHasEnteredInformationProfilePageAndStartsEnteringAValidAddress(String arg0) {
    }

    @Then("the user should see address suggestions")
    public void theUserShouldSeeAddressSuggestions() {
    }

    @And("the user can select the address from the suggestions")
    public void theUserCanSelectTheAddressFromTheSuggestions() {
    }


}