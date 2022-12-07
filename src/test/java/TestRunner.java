import com.aventstack.extentreports.testng.listener.ExtentITestListenerAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;

@CucumberOptions(
        features = "src/test/java/features",
        glue = {"hooks", "stepdefinitions"},
        tags = "@Email",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-reports/CucumberTestReport.json"},
        monochrome = true)
@Listeners({ExtentITestListenerAdapter.class})
public class TestRunner extends AbstractTestNGCucumberTests {

}
