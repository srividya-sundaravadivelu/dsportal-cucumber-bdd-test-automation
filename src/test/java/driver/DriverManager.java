package driver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	public static WebDriver driver;

	public WebDriver SetupDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
	}

	public static WebDriver getdriver() {
		return driver;

	}

	public void tearDown() {
		driver.close();
	}

}