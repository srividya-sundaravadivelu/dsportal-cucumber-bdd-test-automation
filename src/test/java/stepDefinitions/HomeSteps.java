package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utils.ConfigReader;

public class HomeSteps {

	HomePage homePage = new HomePage();

	@Given("The user is on the Home page")
	public void the_user_is_on_the_home_page() {
		homePage.navigateToPage(ConfigReader.getHomeUrl());
	}

	// Common Navigation
	@When("The user clicks the {string} item from the drop down menu")
	public void the_user_clicks_the_item_from_the_drop_down_menu(String itemName) {
		homePage.clickDropDownItem(itemName);
}

	@When("The user clicks the Get Started button in {string} Panel")
	public void the_user_clicks_the_get_started_button_in_panel(String itemName) {
		homePage.clickGetStarted(itemName);
	}

	@Then("The user should be redirected to the {string} page")
	public void the_user_should_be_redirected_to_the_page(String pageName) {
		String expectedUrl = getPageUrl(pageName);
		Assert.assertEquals(homePage.getCurrentUrl(), expectedUrl);
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

}