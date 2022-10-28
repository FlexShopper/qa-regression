package flexshopper.com.stepDefinitions;

import flexshopper.com.cucumber.TestContext;
import flexshopper.com.managers.FileReaderManager;
import flexshopper.com.pageObjects.flexshopper.*;
import flexshopper.com.testDataTypes.pojoClasses.Customer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ProfileInfoStepsCopy {
    TestContext testContext;
    EmailPage loginPage;
    ProfileInfoPage profileInfoPage;
    PasswordPage passwordPage;
    HomePage homePage;
    PersonalInfoPage personalInfoPage;

    public ProfileInfoStepsCopy(TestContext context) {
        testContext = context;
        loginPage = testContext.getPageObjectManager().getLoginPage();
        passwordPage = testContext.getPageObjectManager().getPasswordPage();
        homePage = testContext.getPageObjectManager().getHomePage();
        profileInfoPage=testContext.getPageObjectManager().getProfileInfoPage();
        personalInfoPage=testContext.getPageObjectManager().getPersonalInfoPage();
    }

    @When("the user lands in the ProfileInfo screen1")
    public void theUserLandsInTheProfileInfoScreen() {
        loginPage.getEmailScreen();
        testContext.getWebDriverManager().getDriver().switchTo().frame(0);
        testContext.getWebDriverManager().getDriver().switchTo().frame(0);
        loginPage.enterEmail("abcde.approve@flexshopper.com");
        loginPage.clickContinueBtn();
    }
    @When("the user has entered {string} information Profile page and  starts entering a valid addresssss")
    public void theUserHasEnteredInformationProfilePageAndStartsEnteringAValidAddresssss(String customerEmail) {
        Customer customer = FileReaderManager.getInstance().getJsonReader().getCustomerByEmail(customerEmail);
        profileInfoPage.fillProfileDetails(customer);
    }

    @Then("the user should see address suggestionsss")
    public void theUserShouldSeeAddressSuggestionsss() {
        /** TODO
         * ASK STAN
         */
        List<WebElement> element = testContext.getWebDriverManager().getDriver().findElements(By.className("//*[@id='app']/div[1]/div[2]/div/div/div/div/div/div/form/div/div[5]/div/div[2]/div[2]/ul/div"));
        WebElement el=testContext.getWebDriverManager().getDriver().findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div/div/div/div/div/div/form/div/div[5]/div/div[2]/div[2]/ul/div[1]/li"));
        Assert.assertTrue(el.isDisplayed());
        System.out.println(el.getText());
        System.out.println(element.size()+" elements size");
        for (int i = 0; i < element.size(); i++) {
            WebElement elements = element.get(2);
            System.out.println("elements.getText() = " + elements.getText());
            elements.click();
        }
    }

    @And("the user can select the address from the suggestionssss")
    public void theUserCanSelectTheAddressFromTheSuggestionssss() {
        WebElement el=testContext.getWebDriverManager().getDriver().findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div/div/div/div/div/div/form/div/div[5]/div/div[2]/div[2]/ul/div[1]/li"));
        el.click();
    }

    @When("the user has entered {string} information")
    public void theUserHasEnteredInformation(String customerEmail) {
        Customer customer = FileReaderManager.getInstance().getJsonReader().getCustomerByEmail(customerEmail);
        profileInfoPage.fillProfileDetails(customer);
        WebElement el=testContext.getWebDriverManager().getDriver().findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div/div/div/div/div/div/form/div/div[5]/div/div[2]/div[2]/ul/div[1]/li"));
        el.click();
    }

    @When("the user clicks on the Enter Address Manually links")
    public void theUserClicksOnTheEnterAddressManuallyLinks() {
        profileInfoPage.clickEnterAddressManually();
    }

    @Then("the user should see Home Address field")
    public void theUserShouldSeeHomeAddressField() {
        profileInfoPage.homeAddressIsExist();
    }
    @And("the usersssss should see the Apt\\/Unit fields")
    public void theUsersssssShouldSeeTheAptUnitFields() {
        profileInfoPage.unitNumberFieldExist();
    }

    @And("the user should see the City field")
    public void theUserShouldSeeTheCityField() {
        profileInfoPage.cityFieldExist();
    }

    @And("the user should see the State field")
    public void theUserShouldSeeTheStateField() {
        profileInfoPage.regionFieldExist();
    }

    @And("the user should see the Postal Code field")
    public void theUserShouldSeeThePostalCodeField() {
        profileInfoPage.zipCodeFieldExist();
    }

    @And("the user clicks on the Continue button on copy Profile Page")
    public void theUserClicksOnTheContinueButtonOnCopyProfilePage() {
        WebDriverWait wait =new WebDriverWait(testContext.getWebDriverManager().getDriver(), 10);
        WebElement el=testContext.getWebDriverManager().getDriver().findElement(By.xpath("//span[(.)='Continue']"));
        wait.until(ExpectedConditions.visibilityOf(el));
        el.click();
    }
    @Then("the user should land {string} Screen")
    public void theUserShouldLandScreen(String personalInfo) {
       // Assert.assertEquals(personalInfo, personalInfoPage.PersonalInfoPScreenP3.getText());
    }


}

