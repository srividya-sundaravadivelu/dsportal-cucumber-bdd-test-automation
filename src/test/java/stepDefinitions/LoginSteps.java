package stepDefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import driver.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utils.ConfigReader;

public class LoginSteps {

	TestContext testContext;
	WebDriver driver;

	LoginPage loginPage;

	public LoginSteps(TestContext testContext) {
		this.testContext = testContext;
		this.driver = testContext.getdriver();
		this.loginPage = testContext.getLoginPage();
	}

	@Given("The user is logged in with username {string} and password {string}")
	public void the_user_is_logged_in_with_username_and_password(String username, String password) {
		loginPage.navigateToPage(ConfigReader.getLoginUrl());
		loginPage.login(username, password);
//		Assert.assertTrue(homePage.isSignOutLinkVisible());
	}

	// Anj 11/8
	// @TC_log1
	@Given("The user is on login page")
	public void the_user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		loginPage.navigateToPage(ConfigReader.getLoginUrl());
	}

	@When("The user clicks on register link")
	public void the_user_clicks_on_register_link() {
		// Write code here that turns the phrase above into concrete actions
		loginPage.clickRegisterlink();
	}

	@Then("The user will be redirected to register page")
	public void the_user_will_be_redirected_to_register_page() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(loginPage.getCurrentUrl(), ConfigReader.getRegisterUrl());
	}

	// @TC_log2
	@When("The user enter invalid {string} and {string} click login button to verify")
	public void the_user_enter_invalid_and_click_login_button_to_verify(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		loginPage.verifyLogin(username, password);
		// boolean isRequired=loginPage.verifyLogin(username, password);
		loginPage.clickLogin();
	}

	@Then("User should get error message {string}")
	public void user_should_get_error_message(String expectedMessage) {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		String actualMessage = loginPage.actMsg();
		Assert.assertEquals("Please fill out this field", expectedMessage, actualMessage);
		
	}
	
	// 11/12---
	
	//@TC_log3
	@Given("The user is on login page with valid username {string} and password {string}")
	public void the_user_is_on_login_page_with_valid_username_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		loginPage.navigateToPage(ConfigReader.getLoginUrl());
		loginPage.login(username, password);
		
	}
	@When("The user click sigout")
	public void the_user_click_sigout() {
	    // Write code here that turns the phrase above into concrete actions
	   //throw new io.cucumber.java.PendingException();
		
		loginPage.clickSignoutlink();
	}

	@Then("The user is redirected to homepage")
	public void the_user_is_redirected_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Assert.assertEquals(loginPage.getCurrentUrl(), ConfigReader.getHomeUrl());
		
	}

	//---

}
