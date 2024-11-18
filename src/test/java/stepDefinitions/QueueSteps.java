package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driver.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.QueuePage;
import utils.ConfigReader;


public class QueueSteps {

	TestContext testContext;
	WebDriver driver;
	QueuePage queuePage;

	public QueueSteps(TestContext testContext) {
		this.testContext = testContext;		
		this.queuePage = testContext.getQueuePage();
	}
	
	@Given("The user is in the Queue page after logged in")
	public void the_user_is_in_the_queue_page_after_logged_in() {
		queuePage.navigateToPage(ConfigReader.getQueueUrl());
	}

	@When("The user clicks Implementation of Queue in Python link in Queue")
	public void the_user_clicks_implementation_of_queue_in_python_link_in_queue() {
		queuePage.clickImplementationofQueueinPythonLink();
	}

	@Then("The user should be redirected to Implementation of Queue in Python page")
	public void the_user_should_be_redirected_to_implementation_of_queue_in_python_page() {
		Assert.assertEquals(queuePage.getCurrentUrl(), ConfigReader.getImplementationofQueueinPython());
	}

	@When("The user clicks Try Here button in Implementation of Queue in Python")
	public void the_user_clicks_try_here_button_in_implementation_of_queue_in_python() {
	    queuePage.clickTryHereButton();
	}
	

	@Given("The user is in the Implementation of Queue in Python page")
	public void the_user_is_in_the_implementation_of_queue_in_python_page() {
		queuePage.navigateToPage(ConfigReader.getImplementationofQueueinPython());
	}

	@When("The user clicks Implementation using collections deque link in Queue")
	public void the_user_clicks_implementation_using_collections_deque_link_in_queue() {
		queuePage.clickImplementationUsingCollectionsLink();
	}

	@Then("The user should be redirected to Implementation using collections deque page")
	public void the_user_should_be_redirected_to_implementation_using_collections_deque_page() {
		Assert.assertEquals(queuePage.getCurrentUrl(), ConfigReader.getImplementationUsingCollectionsDeque());
	}

	@Given("The user is in the Implementation using collections deque page")
	public void the_user_is_in_the_implementation_using_collections_deque_page() {
		queuePage.navigateToPage(ConfigReader.getImplementationUsingCollectionsDeque());
	}
	
	@When("The user clicks Try Here button in Implementation using collections deque")
	public void the_user_clicks_try_here_button_in_implementation_using_collections_deque() {
		 queuePage.clickTryHereButton();
	}

	@Then("The user should be redirected to a page having a text editor in queue")
	public void the_user_should_be_redirected_to_a_page_having_a_text_editor_in_queue() {
		Assert.assertEquals(queuePage.getCurrentUrl(), ConfigReader.getTryEditorUrl());
	}
	
	@When("The user clicks Implementation using array link in Queue")
	public void the_user_clicks_implementation_using_array_link_in_queue() {
		queuePage.clickImplementationUsingArrayLink();
	}

	@Then("The user should be redirected to Implementation using array page")
	public void the_user_should_be_redirected_to_implementation_using_array_page() {
		Assert.assertEquals(queuePage.getCurrentUrl(), ConfigReader.getImplementationUsingArrayinQueue());
	}
	
	@When("The user clicks Try Here button in Implementation using array")
	public void the_user_clicks_try_here_button_in_implementation_using_array() {
		 queuePage.clickTryHereButton();
	}

	@Given("The user is in the Implementation using array page")
	public void the_user_is_in_the_implementation_using_array_page() {
		queuePage.navigateToPage(ConfigReader.getImplementationUsingArrayinQueue());
	}

	@When("The user clicks Queue Operations link in Queue")
	public void the_user_clicks_queue_operations_link_in_queue() {
		queuePage.clickQueueOperationsLink();
	}

	@Then("The user should be redirected to Queue Operations page")
	public void the_user_should_be_redirected_to_queue_operations_page() {
		Assert.assertEquals(queuePage.getCurrentUrl(), ConfigReader.getQueueOperations());
	}

	@Given("The user is in the Queue Operations page")
	public void the_user_is_in_the_queue_operations_page() {
		queuePage.navigateToPage(ConfigReader.getQueueOperations());
	}

	@When("The user clicks Try Here button in Queue Operations page")
	public void the_user_clicks_try_here_button_in_queue_operations_page() {
	    queuePage.clickTryHereButton();
	}
	
	@Given("The user is in the Queue Operations page after logged in")
	public void the_user_is_in_the_queue_operations_page_after_logged_in() {
		queuePage.navigateToPage(ConfigReader.getQueueOperations());
	}

	@When("The user clicks Practice Questions link in queue")
	public void the_user_clicks_practice_questions_link_in_queue() {
		queuePage.clickPracticeQuesLink();
	}

	@Then("The user should be redirected to Practice Questions page in queue")
	public void the_user_should_be_redirected_to_practice_questions_page_in_queue() {
		Assert.assertEquals(queuePage.getCurrentUrl(), ConfigReader.getQueuePracticeUrl());
	}

}
