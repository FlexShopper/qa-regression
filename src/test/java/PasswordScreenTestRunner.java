import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/PasswordScreen.feature",
        glue = {"hooks", "stepdefinitions"},
        tags = {"~@Ignore"},
        plugin = {"html:target/cucumber-reports/cucumber-pretty",
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        })
public class PasswordScreenTestRunner extends AbstractTestNGCucumberTests {
        public static void main(String[] args) {
                cucumber.api.cli.Main.main(args);
        }
}
