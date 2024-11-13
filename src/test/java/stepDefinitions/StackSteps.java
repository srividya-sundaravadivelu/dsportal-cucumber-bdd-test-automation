package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.StackPage;
import utils.ConfigReader;

public class StackSteps {

	StackPage stackPage = new StackPage();
	
	    //Operations Page
		@Given("The user is in the Stack page after logged in")
		public void the_user_is_in_the_stack_page_after_logged_in() {
			stackPage.navigateToPage(ConfigReader.getStackUrl());
		}

		@When("The user clicks Operations link in Stack page")
		public void the_user_clicks_operations_link_in_stack_page() {
			stackPage.clickOperationsInStackLink();
		}

		@Then("The user should be redirected to Operations page")
		public void the_user_should_be_redirected_to_operations_page() {
			Assert.assertEquals(stackPage.getCurrentUrl(), ConfigReader.getOperationsInStackUrl());
		}

		@Given("The user is in the Operations in Stack page")
		public void the_user_is_in_the_operations_in_stack_page() {
		    stackPage.navigateToPage(ConfigReader.getOperationsInStackUrl());
		}

		@When("The user clicks Try Here button in operations page")
		public void the_user_clicks_try_here_button_in_operations_page() {
			stackPage.clickTryHereButton();
		}
		
		@Then("The user should be redirected to a page having a text editor")
		public void the_user_should_be_redirected_to_a_page_having_a_text_editor() {
			Assert.assertEquals(stackPage.getCurrentUrl(), ConfigReader.getTryEditorUrl());
		}
		
		//Implementation
		//Given with user is in home page
		@When("The user clicks Implementation link")
		public void the_user_clicks_implementation_link() {
		    stackPage.clickImplementationLink();
		}
		//given is already implemented
		@Then("The user should be redirected to Implementation page")
		public void the_user_should_be_redirected_to_implementation_page() {
			Assert.assertEquals(stackPage.getCurrentUrl(), ConfigReader.getImplementationUrl());
		}
		
		@When("The user clicks Try Here button in Implementation")
		public void the_user_clicks_try_here_button_in_implementation() {
			stackPage.clickTryHereButton();
		}
		
		//Application Page
		@Given("The user is in the Implementation in Stack page")
		public void the_user_is_in_the_implementation_in_stack_page() {
			stackPage.navigateToPage(ConfigReader.getImplementationUrl());
		}

		@When("The user clicks Applications link")
		public void the_user_clicks_applications_link() {
			stackPage.clickApplicationsLink();
		}

		@Then("The user should be redirected to Applications page")
		public void the_user_should_be_redirected_to_applications_page() {
			Assert.assertEquals(stackPage.getCurrentUrl(), ConfigReader.getApplicationsUrl());
		}
		
		@Given("The user is in the Applications in Stack page")
		public void the_user_is_in_the_applications_in_stack_page() {
			stackPage.navigateToPage(ConfigReader.getApplicationsUrl());
		}
		
		@When("The user clicks Try Here button in Applications")
		public void the_user_clicks_try_here_button_in_applications() {
			stackPage.clickTryHereButton();
		}

		//Practice Question Page
		@Given("The user is in the Applications page after logged in")
		public void the_user_is_in_the_applications_page_after_logged_in() {
			stackPage.navigateToPage(ConfigReader.getApplicationsUrl());
		}

		@When("The user clicks Practice Questions link in stack page")
		public void the_user_clicks_practice_questions_link_in_stack_page() {
		    stackPage.clickPracticeQuesLink();
		}

		@Then("The user should be redirected to Practice Questions page")
		public void the_user_should_be_redirected_to_practice_questions_page() {
			Assert.assertEquals(stackPage.getCurrentUrl(), ConfigReader.getStackPracticeUrl());
		}


}
