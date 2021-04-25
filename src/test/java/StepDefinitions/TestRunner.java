package StepDefinitions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/Features", glue = {"StepDefinitions"},
monochrome = true,
        //plugin = {"pretty", "html:target/htmlReports"},
        plugin = {"pretty",
                "html:target/cucumber-html-report",
                "json:target/cucumber-report/cucumber.json",

        },
        tags = "@all"
      )
public class TestRunner {

}
