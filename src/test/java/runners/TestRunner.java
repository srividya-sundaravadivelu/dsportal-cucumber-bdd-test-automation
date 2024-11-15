package runners;

//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;

import org.testng.annotations.*;

import io.cucumber.testng.CucumberOptions;
import utils.ConfigReader;
import utils.LogHelper;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", // Path to feature files
		glue = { "stepDefinitions", "hooks" }, // Path to step definitions package
		plugin = { "pretty", "html:target/cucumber-reports.html", 
				"json:target/cucumber-reports/cucumber.json",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, // For reporting
<<<<<<< HEAD
<<<<<<< HEAD
		monochrome = true // For better console output
		, tags = "@home or @array or @linkedlist")

public class TestRunner extends AbstractTestNGCucumberTests {

	// Important! Uncomment below for CrossBrowser & Parallel Testing
=======
=======
>>>>>>> master
		monochrome = true // For better console output 
		, tags = "@graph or @tree or @data-structures-introduction or @array1 or @Linkedlist or @stack or @queue or @home or @login or @register")


public class TestRunner extends AbstractTestNGCucumberTests {
	
//	Important! Uncomment below for CrossBrowser & Parallel Testing
<<<<<<< HEAD
>>>>>>> 6af90c78c2a1533990f0f34e929b5e044f167c48
=======
>>>>>>> master
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

	@BeforeClass
	@Parameters({ "browser" })
	public void setUp(@Optional String browser) throws Throwable {
		LogHelper.info("Browser value from Testng Xml file:" + browser);
		if (browser != null) {
			ConfigReader.setBrowser(browser);
			LogHelper.info("Config Reader browser value: " + ConfigReader.getBrowser());
		}
	}
}
