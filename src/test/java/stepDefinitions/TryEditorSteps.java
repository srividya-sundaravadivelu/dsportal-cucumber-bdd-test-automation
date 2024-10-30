package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TryEditorSteps {
	
	
	@Given("The user is on the Try Editor page")
	public void the_user_is_on_the_try_editor_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}	
	
	@When("The user enters valid Python code from sheet {string} and row {int} and clicks the Run button")
	public void the_user_enters_valid_python_code_from_sheet_and_row_and_clicks_the_run_button(String sheetName, int rowNumber) throws IOException {
	    
	}
	
	@Then("The user is able to see the output inside the console")
	public void the_user_is_able_to_see_the_output_inside_the_console() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("The user is on the Try Editor page with an alert error message")
	public void the_user_is_on_the_try_editor_page_with_an_alert_error_message() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
	@When("The user clicks the OK button in the alert window")
	public void the_user_clicks_the_ok_button_in_the_alert_window() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
	@Then("The user is on the same page having the Editor and Run button")
	public void the_user_is_on_the_same_page_having_the_editor_and_run_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}	

	@When("The user enters invalid Python code from sheet {string} and row {int} and clicks the Run button")
	public void the_user_enters_invalid_python_code_from_sheet_and_row_and_clicks_the_run_button(String sheetName, int rowNumber) throws IOException {
	
	}
	
	@Then("The user sees an error message in the alert window")
	public void the_user_sees_an_error_message_in_the_alert_window() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
	
	@When("The user clicks the Run Button without entering code in the Editor")
	public void the_user_clicks_the_run_button_without_entering_code_in_the_editor() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
	@Then("The focus remains in the same page and no error message is displayed")
	public void focus_remains_in_the_same_page_and_no_error_message_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

}