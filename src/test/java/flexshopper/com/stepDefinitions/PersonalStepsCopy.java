package flexshopper.com.stepDefinitions;

import flexshopper.com.cucumber.TestContext;
import flexshopper.com.managers.FileReaderManager;
import flexshopper.com.pageObjects.flexshopper.*;
import flexshopper.com.testDataTypes.pojoClasses.Customer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class PersonalStepsCopy {
    TestContext testContext;
    EmailPage loginPage;
    ProfileInfoPage profileInfoPage;
    PasswordPage passwordPage;
    HomePage homePage;
    PersonalInfoPage personalInfoPage;

    public  PersonalStepsCopy (TestContext context) {
        testContext = context;
        loginPage = testContext.getPageObjectManager().getLoginPage();
        passwordPage = testContext.getPageObjectManager().getPasswordPage();
        homePage = testContext.getPageObjectManager().getHomePage();
        profileInfoPage=testContext.getPageObjectManager().getProfileInfoPage();
        personalInfoPage=testContext.getPageObjectManager().getPersonalInfoPage();
    }
    @When("the user lands in the PersonalInfo screen copy {string}")
    public void theUserLandsInThePersonalInfoScreenCopy(String customerEmail) {
        loginPage.getEmailScreen();
        testContext.getWebDriverManager().getDriver().switchTo().frame(0);
        testContext.getWebDriverManager().getDriver().switchTo().frame(0);
        loginPage.enterEmail("abcde.approve@flexshopper.com");
        loginPage.clickContinueBtn();
    }

    @Then("user can see {string}:")
    public void userCanSee(String personalInfo) {
        Assert.assertEquals(personalInfo, personalInfoPage.PersonalInfoPScreenP3.getText());
    }

    @And("the user can see the Date of Birth field")
    public void theUserCanSeeTheDateOfBirthField() {
        personalInfoPage.DOBExist();
    }

    @And("the user can see the Social Security Number or ITIN field")
    public void theUserCanSeeTheSocialSecurityNumberOrITINField() {
        personalInfoPage.SSNExist();
    }

    @And("the user can see the Gross Monthly Income field")
    public void theUserCanSeeTheGrossMonthlyIncomeField() {
        personalInfoPage.monthlyIncomeExist();
    }

    @And("the user can see the Pay Frequency drop down button")
    public void theUserCanSeeThePayFrequencyDropDownButton() {
    }
    @And("the user can see the following opt:")
    public void theUserCanSeeTheFollowingOpt(List<String> expectedOptions) {
        List<WebElement> actualOptions=testContext.getWebDriverManager().getDriver().findElements(By.className("sc-jwKygS ihsFnT"));
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : actualOptions) {
            elemTexts.add(el.getText());
        }
        Assert.assertEquals(expectedOptions, elemTexts);
        }
    }
