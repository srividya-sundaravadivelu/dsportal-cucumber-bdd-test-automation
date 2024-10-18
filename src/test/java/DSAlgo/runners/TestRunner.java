package DSAlgo.runners;

//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", // Path to feature files
		glue = { "stepDefinitions" }, // Path to step definitions package
		plugin = { "pretty", "html:target/cucumber-reports.html" }, // For reporting
		monochrome = true // For better console output
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
