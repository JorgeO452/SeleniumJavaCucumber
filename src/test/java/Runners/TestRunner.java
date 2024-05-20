package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Src/test/resources/firstTest.feature",
        glue = {"StepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports"}, tags = "@Navigation"
)
public class TestRunner {
    @AfterClass
    public static void cleanDriver() {
        BasePage.closeBrowser();
    }
}
