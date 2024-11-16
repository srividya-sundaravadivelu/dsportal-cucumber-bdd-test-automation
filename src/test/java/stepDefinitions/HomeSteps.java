package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driver.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utils.ConfigReader;
import utils.LogHelper;

public class HomeSteps {

	TestContext testContext;
	WebDriver driver;

	HomePage homePage;

	public HomeSteps(TestContext testContext) {
		this.testContext = testContext;
		this.driver = testContext.getdriver();
		this.homePage = testContext.getHomePage();
	}

	@Given("The user is on the Home page")
	public void the_user_is_on_the_home_page() {
		homePage.clickHomePageLink();
		LogHelper.info("user is on the Home page");
	}

	// Common Navigation
	@When("The user clicks the {string} item from the drop down menu")
	public void the_user_clicks_the_item_from_the_drop_down_menu(String itemName) {
		homePage.clickDropDownItem(itemName);
		LogHelper.info("user sees the dropdown of Home page");
	}

	@When("The user clicks the Get Started button in {string} Panel")
	public void the_user_clicks_the_get_started_button_in_panel(String itemName) {
		homePage.clickGetStarted(itemName);
		LogHelper.info("user clicks " + itemName + " Home page");
	}

	@Then("The user should be redirected to the {string} page")
	public void the_user_should_be_redirected_to_the_page(String pageName) {
		String expectedUrl = getPageUrl(pageName);
		Assert.assertEquals(homePage.getCurrentUrl(), expectedUrl);
		LogHelper.info("user is on " + pageName);
	}

	private String getPageUrl(String pageName) {
		switch (pageName.toLowerCase()) {
		case "graph home":
			return ConfigReader.getGraphHomeUrl();
		case "tree":
			return ConfigReader.getTreeUrl();
		case "array":
			return ConfigReader.getArrayUrl();
		case "linked list":
			return ConfigReader.getLinkedListUrl();
		case "stack":
			return ConfigReader.getStackUrl();
		case "queue":
			return ConfigReader.getQueueUrl();
		case "data-structures-introduction":
			return ConfigReader.getDataStructuresIntroductionUrl();
		default:
			throw new IllegalArgumentException("Unknown page: " + pageName);
		}
	}

	// @TS_H1
	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
		homePage.clickGetStarted_link(string);
		LogHelper.info("user clicks Get Started link");
	}

	// @TS_H1
	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
		String Title = homePage.getPageTitle();
		Assert.assertEquals(Title, "NumpyNinja", "Title do not match");
		LogHelper.info("current page is: " + Title);
	}

	// @TS_H2
	@Given("The user is on Home page")
	public void the_user_is_on_home_page() {
		homePage.clickHomePageLink();
		LogHelper.info("The user is on Home page");
	}

	// @TS_H2
	@When("The user clicks on Get Started link on homepage {string} without login")
	public void the_user_clicks_on_get_started_link_on_homepage_without_login(String string) {
		homePage.clickGetStarted(string);
		LogHelper.info("The user clicks Get Started  without login");

	}

	// @TS_H2&@TS_H3
	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String string) {
		String alert = homePage.alert();
		Assert.assertEquals(alert, string, "Title do not match");
		LogHelper.info("The user gets message " + alert);
	}

	// @TS_H3
	@When("The user clicks on dropdown {string}")
	public void the_user_clicks_on_dropdown(String string) {
		homePage.clickDropDownItem(string);
		LogHelper.info("The user clicks" + string);
	}

	// @TS_H4
	@When("The user clicks on signin link")
	public void the_user_clicks_on_signin_link() {
		homePage.signin_link();
		LogHelper.info("The user is on login page");
	}

	// @TS_H4
	@Then("The user redirected to login page")
	public void the_user_redirected_to_login_page() {
		String Title = homePage.home_page();
		Assert.assertEquals(Title, "Login", "Title do not match");
		LogHelper.info("The user is on" + Title + "page");
	}

	// @TS_H5
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
		homePage.dsalgopage();
		LogHelper.info("The user is on DsAlgo page");
	}

	// @TS_H5
	@When("The user clicks on register link of Home page")
	public void the_user_clicks_on_register_link_of_home_page() {
		homePage.register_link();
		LogHelper.info("The user clicks register of home page");
	}

	@Then("The user redirected to Registration page")
	public void the_user_redirected_to_registration_page() {
		String Title = homePage.register_page();
		Assert.assertEquals(Title, "Registration", "Title do not match");
		LogHelper.info("The user is on" + Title);
	}

}