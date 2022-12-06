import com.aventstack.extentreports.testng.listener.ExtentITestListenerAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;

@CucumberOptions(
        features = "src/test/java/features",
        glue = {"hooks", "runners", "stepdefinitions"},
        tags = "@Email",
        plugin = {"html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"},
        monochrome = true)
@Listeners({ExtentITestListenerAdapter.class})
public class TestRunner extends AbstractTestNGCucumberTests {

}
