package hooks;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driver.DriverManager;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

public class Hooks {
	private static WebDriver driver;
	private static DriverManager driverManager;
	static Scenario scenario;

	@BeforeAll
	public static void before() throws Throwable {
		driverManager = new DriverManager();
		driver = driverManager.SetupDriver();

	}

	@Before
	public void scenario(Scenario scenario) {

	}

	@AfterStep
	public void afterstep(Scenario scenario) {
		if (scenario.isFailed()) {

			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "My screenshot");
			Allure.addAttachment("Myscreenshot",
					new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));

		}
	}

	@AfterAll
	public static void after() {

		driverManager.tearDown();
	}
}