package steps;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"./src/test/resources/features"},
        glue = {""},
        plugin = {"html:target/cucumber-reports",
                "json:target/json-report.json",
                "pretty:target/pretty-repot.txt",
                "junit:target/junit-report.xml"},
        monochrome = true,
        tags = {"@SmokeTest"},
        strict = true
)

public class MultipleFeatureTest {
}