import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"@target/cucumber-reports/rerun.txt"}, glue = {"hooks", "stepdefinitions"},
        plugin = {})
public class FailedRunnerTests extends AbstractTestNGCucumberTests {
}
