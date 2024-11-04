package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GraphPage;
import utils.ConfigReader;

public class GraphSteps {

	GraphPage graphPage = new GraphPage();

	// Graph Home Page
	@Given("The user is on the Graph Home page")
	public void the_user_is_on_the_graph_home_page() {
		graphPage.navigateToPage(ConfigReader.getGraphHomeUrl());
	}
	
	@When("The user clicks {string} link under Topics Covered in Graph Home page")
	public void the_user_clicks_graph_link_under_topics_covered(String itemName) {
		graphPage.clickLinkUnderTopicsCovered(itemName);
	}

	@Then("The user should be redirected to the Graph page")
	public void the_user_should_be_redirected_to_the_graph_page() {
		Assert.assertEquals(graphPage.getCurrentUrl(), ConfigReader.getGraphUrl());
	}

	@When("The user clicks Graph Representations link")
	public void the_user_clicks_graph_representations_link() {
		graphPage.clickGraphRepresentationsLink();
	}

	@Then("The user should be redirected to the Graph Representations page")
	public void the_user_should_be_redirected_to_the_graph_representations_page() {
		Assert.assertEquals(graphPage.getCurrentUrl(), ConfigReader.getGraphRepresentationsUrl());
	}

	// Graph Page
	@Given("The user is on the Graph page")
	public void the_user_is_on_the_graph_page() {
		graphPage.navigateToPage(ConfigReader.getGraphUrl());
	}

	@When("The user clicks Try Here button")
	public void the_user_clicks_try_here_button() {
		graphPage.clickTryHereButton();
	}

	@Then("The user should be redirected to the Try Editor page")
	public void the_user_should_be_redirected_to_the_try_editor_page() {
		Assert.assertEquals(graphPage.getCurrentUrl(), ConfigReader.getTryEditorUrl());
	}

	// Graph Representations Page
	@Given("The user is on the Graph Representations page")
	public void the_user_is_on_the_graph_representations_page() {
		graphPage.navigateToPage(ConfigReader.getGraphRepresentationsUrl());
	}

	@When("The user clicks Practice Questions link in Graph Representations page")
	public void the_user_clicks_practice_questions_link() {
		graphPage.clickPracticeLink();
	}

	@Then("The user should be redirected to the Practice Questions page in Graph")
	public void the_user_should_be_redirected_to_the_practice_questions_page_in_graph() {
		Assert.assertEquals(graphPage.getCurrentUrl(), ConfigReader.getGraphPracticeUrl());
	}

}