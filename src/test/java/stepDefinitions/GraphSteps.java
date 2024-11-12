package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driver.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GraphPage;
import utils.ConfigReader;
import utils.LogHelper;

public class GraphSteps {
	
    // Page names
    private static final String GRAPH_PAGE = "Graph";
    private static final String GRAPH_REPRESENTATIONS_PAGE = "Graph Representations";
    private static final String PRACTICE_QUESTIONS_PAGE = "Practice Questions";
	
	TestContext testContext;
	GraphPage graphPage;
	
	public GraphSteps(TestContext testContext) {
		this.testContext = testContext;		
		this.graphPage = testContext.getGraphPage();
	}

	// Graph Home Page
	@Given("The user is on the Graph Home page")
	public void the_user_is_on_the_graph_home_page() {
		graphPage.navigateToPage(ConfigReader.getGraphHomeUrl());
		LogHelper.info("Current page is " + graphPage.getCurrentUrl());
	}
	
	@When("The user clicks {string} link under Topics Covered in Graph Home page")
	public void the_user_clicks_graph_link_under_topics_covered(String itemName) {
		graphPage.clickLinkUnderTopicsCovered(itemName);
		LogHelper.info("The user clicks " + itemName + " link under Topics Covered in Graph Home page");
	}

	@Then("The user should be redirected to the Graph page")
	public void the_user_should_be_redirected_to_the_graph_page() {
		Assert.assertEquals(graphPage.getCurrentUrl(), ConfigReader.getGraphUrl());
		LogHelper.info("Current Page title is: " + graphPage.getPageTitle());
		Assert.assertEquals(graphPage.getPageTitle(), GRAPH_PAGE);
	}

	@When("The user clicks Graph Representations link")
	public void the_user_clicks_graph_representations_link() {
		graphPage.clickGraphRepresentationsLink();
		LogHelper.info("Current page is " + graphPage.getCurrentUrl());
	}

	@Then("The user should be redirected to the Graph Representations page")
	public void the_user_should_be_redirected_to_the_graph_representations_page() {
		Assert.assertEquals(graphPage.getCurrentUrl(), ConfigReader.getGraphRepresentationsUrl());
		LogHelper.info("Current Page title is: " + graphPage.getPageTitle());
		Assert.assertEquals(graphPage.getPageTitle(), GRAPH_REPRESENTATIONS_PAGE);
	}

	// Graph Page
	@Given("The user is on the Graph page")
	public void the_user_is_on_the_graph_page() {
		graphPage.navigateToPage(ConfigReader.getGraphUrl());
		LogHelper.info("Current page is " + graphPage.getCurrentUrl());
	}

	@When("The user clicks Try Here button")
	public void the_user_clicks_try_here_button() {
		graphPage.clickTryHereButton();
		LogHelper.info("The user clicks Try Here button");
	}

	@Then("The user should be redirected to the Try Editor page")
	public void the_user_should_be_redirected_to_the_try_editor_page() {
		Assert.assertEquals(graphPage.getCurrentUrl(), ConfigReader.getTryEditorUrl());
		LogHelper.info("Current page is " + graphPage.getCurrentUrl());
	}

	// Graph Representations Page
	@Given("The user is on the Graph Representations page")
	public void the_user_is_on_the_graph_representations_page() {
		graphPage.navigateToPage(ConfigReader.getGraphRepresentationsUrl());
		LogHelper.info("Current page is " + graphPage.getCurrentUrl());
	}

	@When("The user clicks Practice Questions link in Graph Representations page")
	public void the_user_clicks_practice_questions_link() {
		graphPage.clickPracticeLink();
		LogHelper.info("The user clicks Practice Questions link in Graph Representations page");
	}

	@Then("The user should be redirected to the Practice Questions page in Graph")
	public void the_user_should_be_redirected_to_the_practice_questions_page_in_graph() {
		Assert.assertEquals(graphPage.getCurrentUrl(), ConfigReader.getGraphPracticeUrl());
		LogHelper.info("Current Page title is: " + graphPage.getPageTitle());
		Assert.assertEquals(graphPage.getPageTitle(), PRACTICE_QUESTIONS_PAGE);
		
	}

}