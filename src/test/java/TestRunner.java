import com.vimalselvam.cucumber.listener.Reporter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

import java.io.File;

@CucumberOptions(
        features = "src/test/java/features",
        glue = {"hooks", "runners", "stepdefinitions"},
        tags = "@Regression",
        plugin = {"html:target/cucumber-reports/cucumber-pretty.html",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"},
        monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {

}