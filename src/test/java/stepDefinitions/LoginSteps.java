package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import pages.HomePage;
import pages.LoginPage;
import utils.ConfigReader;

public class LoginSteps {

	LoginPage loginPage = new LoginPage();

	@Given("The user is logged in with username {string} and password {string}")
	public void the_user_is_logged_in_with_username_and_password(String username, String password) {		
		loginPage.navigateToPage(ConfigReader.getLoginUrl());
		HomePage homePage = loginPage.login(username, password);
		Assert.assertTrue(homePage.isSignOutLinkVisible());
	}
}