package homeDepot.steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import homeDepot.utils.ConfigurationReader;
import homeDepot.utils.DriverFactory;
import homeDepot.utils.TestBase;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import javax.security.auth.login.Configuration;
import java.util.concurrent.TimeUnit;

public class Hooks {



    @Before
    public void setUp() {
           TestBase.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
           TestBase.driver.manage().window().maximize();
           TestBase.getDriver().get(ConfigurationReader.getProperty("url"));
    }



    @After
    public void tearDown(Scenario scenario) {
        // only takes a screenshot if the scenario fails
        if (scenario.isFailed()) {
            // taking a screenshot
            final byte[] screenshot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
            // adding the screenshot to the report
            scenario.embed(screenshot, "image/png");
        }
        TestBase.closeDriver();
    }


}