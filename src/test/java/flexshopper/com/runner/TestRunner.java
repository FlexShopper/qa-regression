package flexshopper.com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber"},
        features = "src/test/java/flexshopper/com/features/",
        glue = {"flexshopper.com.stepDefinitions"},
        tags = "@personal",
        monochrome = true
)
public class TestRunner {

}





