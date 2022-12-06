import com.aventstack.extentreports.testng.listener.ExtentITestListenerAdapter;
import io.cucumber.java.After;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;
import utils.helpers.SendEmail;
import static pages.Page.instanceOf;

@CucumberOptions(
        features = "src/test/java/features",
        glue = {"hooks", "runners", "stepdefinitions"},
        tags = "@PP3",
        plugin = {"html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"},
        monochrome = true)
@Listeners({ExtentITestListenerAdapter.class})
public class TestRunner extends AbstractTestNGCucumberTests {

    @After()
    public void tearDownClass() {
        instanceOf(SendEmail.class);
    }
}
