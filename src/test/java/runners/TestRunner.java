package runners;

//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", // Path to feature files
		glue = { "stepDefinitions","hooks" }, // Path to step definitions package
		plugin = { "pretty", "html:target/cucumber-reports.html" ,
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, // For reporting
		monochrome = true // For better console output
		,tags="@data-structures-introduction or @graph or @tree"
)
public class TestRunner extends AbstractTestNGCucumberTests
{

}
