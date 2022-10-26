package flexshopper.com.stepDefinitions;

import flexshopper.com.cucumber.TestContext;
import flexshopper.com.pageObjects.flexshopper.EmailPage;
import flexshopper.com.pageObjects.flexshopper.PasswordPage;
import flexshopper.com.pageObjects.flexshopper.ProfileInfoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileInfoSteps {

    TestContext testContext;
    EmailPage emailPage;
    PasswordPage passwordPage;
    ProfileInfoPage profileInfoPage;

    public ProfileInfoSteps(TestContext context) {
        testContext=context;
        emailPage=testContext.getPageObjectManager().getLoginPage();
        passwordPage =testContext.getPageObjectManager().getPasswordPage();
        profileInfoPage=testContext.getPageObjectManager().getProfileInfoPage();
    }
    @When("the user lands in the ProfileInfo screen")
    public void theUserLandsInTheProfileInfoScreen() {
        emailPage.getEmailScreen();
        testContext.getWebDriverManager().getDriver().switchTo().frame(0);
        testContext.getWebDriverManager().getDriver().switchTo().frame(0);
       emailPage.enterEmail("user02@flexshoper.com");
       emailPage.clickContinueBtn();
        profileInfoPage.userIsInProfileInfoPage();
    }
    @Then("the user can see the close button")
    public void theUserCanSeeTheCloseButton() {
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




}