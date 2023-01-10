import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/java/features",
        glue = {"hooks", "stepdefinitions"},
        tags = "@Email",
        plugin = {"html:target/cucumber-reports/cucumberExtentReport.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"},
        monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {
    @DataProvider(parallel = false)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
