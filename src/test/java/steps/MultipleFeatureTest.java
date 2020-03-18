package steps;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:/Users/Javier/IdeaProjects/cucumber/src/test/resources/features"}//,
        //glue = "C:/Users/Javier/IdeaProjects/cucumber/src/test/java/steps",
        //plugin = "html:target/selenium-reports"
)

public class MultipleFeatureTest {
}