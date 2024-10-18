package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RegistrationSteps {
	WebDriver driver;

	@Given("User open browser with url https:\\/\\/dsportalapp.herokuapp.com")
	public void user_open_browser_with_url_https_dsportalapp_herokuapp_com() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://dsportalapp.herokuapp.com/");

	}

	@Then("User should see Get Started page")
	public void user_should_see_get_started_page() {

	}

}
