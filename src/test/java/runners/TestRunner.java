package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import java.util.stream.Stream;

/**
 * Main class used by the JAR executable.
 */
public class TestRunner extends AbstractTestNGCucumberTests {
    private static String[] defaultOptions = {
            "--glue", "hooks", "runners", "stepdefinitions",
            "--plugin", "cucumber-pretty",
            "--plugin", "CucumberTestReport.json"
    };
    public static void main(String[] args) {
        Stream<String> cucumberOptions = Stream.concat(Stream.of(defaultOptions), Stream.of(args));
        cucumber.api.cli.Main.main(args);
    }
}
