package homeDepot.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/",
        glue = "homeDepot/steps/",
        // dryRun = true,
        tags =   {"@temp"} ,
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        }
)
public class TestRunner {
}
