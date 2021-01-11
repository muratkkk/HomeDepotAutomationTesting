package homeDepot.runner;


import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;


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
public class HomeRunner {
}
