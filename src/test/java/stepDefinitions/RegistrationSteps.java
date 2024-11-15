package stepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import driver.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import pages.RegisterPage;

import utils.ConfigReader;
import utils.LogHelper;

public class RegistrationSteps {
	TestContext testContext;
	WebDriver driver;

	RegisterPage registerPage;

	public RegistrationSteps(TestContext testContext) {
		this.testContext = testContext;
		this.driver = testContext.getdriver();
		this.registerPage = testContext.getRegisterPage();
	}
     // @register
	@Given("User open browser with url https:\\/\\/dsportalapp.herokuapp.com")
	public void user_open_browser_with_url_https_dsportalapp_herokuapp_com() {
		String baseUrl = ConfigReader.getBaseUrl();
		driver.get(baseUrl);
	}

	@When("User clicks Get Started button")
	public void user_clicks_get_started_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		registerPage.clickGetStartedButton();
	}

	@Then("User should see Home page")
	public void user_should_see_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		String title = registerPage.getRegisterTitle();
		assertEquals(title,"NumpyNinja", "title donot match");
	}

	
	//---- 11/12/2024
	//@TC_reg1 --Register Scenario for all empty fields
	@Given("The user is on Register page")
	public void the_user_is_on_register_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		LogHelper.info("The user open Register page");
		registerPage.navigateToPage(ConfigReader.getRegisterUrl());
	}

	@When("The user clicks {string} button with all empty fields")
	public void the_user_clicks_button_with_all_empty_fields(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		LogHelper.info("The user keeps all field empty");
		registerPage.clickRegisterButton();
	}

	@Then("User should get error message {string} below Username texbox")
	public void user_should_get_error_message_below_username_texbox(String expErrormsg) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		assertTrue(registerPage.userfieldsempty(),"Please fill out this field.- required");
		assertEquals(registerPage.errormsgEmptyUser(),expErrormsg);
	}
	
	//@TC_reg2
	//---Only Username field is enter
	@When("The user clicks {string} button with entering only username field")
	public void the_user_clicks_button_with_entering_only_username_field(String string, io.cucumber.datatable.DataTable dataTable) {
	  
		registerPage.validname(dataTable);
		registerPage.clickRegisterButton();
	}

	@Then("User should get error message {string} below Password texbox")
	public void user_should_get_error_message_below_password_texbox(String expErrormsg) {
	  
		assertTrue(registerPage.pwfieldsempty(),"Please fill out this field. - required attribute is validated");
		assertEquals(registerPage.errormsgEmptyPw(), expErrormsg);
	}

	
	//@TC_reg3 
	//---Only Username and password 
	@When("The user clicks {string} button with entering only {string} and {string}")
	public void the_user_clicks_button_with_entering_only_and(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
	    
	    registerPage.validname(dataTable);
	    registerPage.validPw(dataTable);
	    registerPage.clickRegisterButton();
	}

	@Then("User should get error message {string} below Confirmation texbox")
	public void user_should_get_error_message_below_confirmation_texbox(String expErrormsg) {
	     assertTrue(registerPage.confmpwfieldsempty(),"Please fill out this field.- required attribute is validated");
	     assertEquals(registerPage.errormsgEmptyConfPw(),expErrormsg);
	}

	//@TC_reg4
	@When("The user enters a {string} with characters other than Letters, digits and {string}")
	public void the_user_enters_a_with_characters_other_than_letters_digits_and(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
	   registerPage.validname(dataTable);
	   registerPage.validConfPw(dataTable);
	   registerPage.validConfPw(dataTable);
	   registerPage.clickRegisterButton();
	}
     // TC_reg4 and TC_reg5
	
	@Then("User should get error messages {string}")
	public void user_should_get_error_messages(String expErrormsg) {
		assertEquals(registerPage.getErrormsg(),expErrormsg);
	   
	}

     //@TC_reg5 
	//---Password with less than 8 character
	@When("The user enters a valid {string} and {string} with less than {int} characters")
	public void the_user_enters_a_valid_and_with_less_than_characters(String string, String string2, Integer int1, io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	   registerPage.validname(dataTable);
	   registerPage.validConfPw(dataTable);
	   registerPage.validConfPw(dataTable);
	   registerPage.clickRegisterButton();
	}

}

