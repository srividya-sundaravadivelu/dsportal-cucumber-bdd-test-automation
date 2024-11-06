package hooks;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driver.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import utils.ConfigReader;
import utils.LogHelper;
import utils.WebDriverWaitUtility;

public class Hooks {
	TestContext testContext;
	static WebDriver driver;
	static Scenario scenario;
	
	public Hooks(TestContext testContext) {
		this.testContext = testContext;
	}

	@Before
	public void setUp(Scenario scenario) {
		LogHelper.info("Initializing WebDriver...");
		testContext.setDriver(driver);
		driver = testContext.getdriver();
		testContext.initializePageObjects(driver);
		LogHelper.info("WebDriver initialized successfully.");
		Hooks.scenario = scenario;
		WebDriverWaitUtility.initializeWait(driver, ConfigReader.getWebDriverWaitTimeout()); //-- TODO
	}

	@AfterStep
	public void captureFailureDetails(Scenario scenario) {
		if (scenario.isFailed()) {
			LogHelper.error("Scenario failed: " + scenario.getName());
			try {
				byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshotBytes, "image/png", "Captured Screenshot");
				ByteArrayInputStream screenshotStream = new ByteArrayInputStream(screenshotBytes);
				Allure.addAttachment("Failure Screenshot", screenshotStream);
				LogHelper.info("Screenshot captured for failed scenario: " + scenario.getName());
			} catch (Exception e) {
				LogHelper.error("Failed to capture screenshot: " + e.getMessage());
			}
		}
	}

	@After
	public void tearDown(Scenario scenario) {

		LogHelper.info("Tearing down WebDriver...");
		driver.quit();
		LogHelper.info("Tear down WebDriver Successful");
	}
}