package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driver.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArrayPage;
import utils.ConfigReader;
import utils.LogHelper;

public class ArraySteps {

	TestContext testContext;
	WebDriver driver;

	ArrayPage arrayPage;

	public ArraySteps(TestContext testContext) {
		this.testContext = testContext;
		this.driver = testContext.getdriver();
		this.arrayPage = testContext.getArrayPage();
	}

	String expectedMsg = "";

	// @TC_A1
	@Given("The user is on the Array page")
	public void the_user_is_on_the_array_page() {
		arrayPage.navigateToPage(ConfigReader.getArrayUrl());
		LogHelper.info("user is on Array Page");
	}

	@When("The user clicks {string} link under Topics Covered in Array page")
	public void the_user_clicks_link_under_topics_covered_in_array_page(String itemName) {
		arrayPage.clickLinkUnderTopicsCovered(itemName);
		LogHelper.info("The user clicks " + itemName + " link under Topics Covered in Graph Home page");
	}

	@Then("The user should be redirected to the Overview of Arrays in Python page")
	public void the_user_should_be_redirected_to_the_overview_of_arrays_in_python_page() {
		Assert.assertEquals(arrayPage.getCurrentUrl(), ConfigReader.getArraysInPythonUrl());
		LogHelper.info("Current Page title is: " + arrayPage.getArrayPageTitle());
	}

	// TC_A2
	@Then("The user should be redirected to the Overview of Arrays Using List page")
	public void the_user_should_be_redirected_to_the_overview_of_arrays_using_list_page() {
		Assert.assertEquals(arrayPage.getCurrentUrl(), ConfigReader.getArraysUsingListUrl());
		LogHelper.info("Current Page title is: " + arrayPage.getArrayPageTitle());
	}

	// TC_A3
	@Then("The user should be redirected to the Basic Operations in Lists page")
	public void the_user_should_be_redirected_to_the_basic_operations_in_lists_page() {
		Assert.assertEquals(arrayPage.getCurrentUrl(), ConfigReader.getBasicOperationsInListsUrl());
		LogHelper.info("Current Page title is: " + arrayPage.getArrayPageTitle());
	}

	// TC_A4
	@Then("The user should be redirected to the Applications of Array page")
	public void the_user_should_be_redirected_to_the_applications_of_array_page() {
		Assert.assertEquals(arrayPage.getCurrentUrl(), ConfigReader.getApplicationsOfArrayUrl());
		LogHelper.info("user redirected to" + arrayPage.getArrayPageTitle());
	}

	// TC_A5
	@When("The user clicks Arrays in Python link")
	public void the_user_clicks_arrays_in_python_link() {
		arrayPage.clickArraysInPythonlink();
		LogHelper.info("Current Page title is: " + arrayPage.getArrayPageTitle());
	}

	// TC_A6
	@Given("The user is on the Arrays in Python page")
	public void the_user_is_on_the_arrays_in_python_page() {
		arrayPage.navigateToPage(ConfigReader.getArraysInPythonUrl());
		LogHelper.info("The user is on the Arrays in Python page");
	}

	@When("The user clicks {string} button on {string} Page")
	public void the_user_clicks_button_on_page(String string, String string2) {
		arrayPage.clickTryHereButton();
		LogHelper.info("The user clicks Try Here button");
	}

	@Then("The user should be redirected to the Try Editor page from Array page")
	public void the_user_should_be_redirected_to_the_try_editor_page_from_array_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		Assert.assertEquals(arrayPage.getCurrentUrl(), ConfigReader.getTryEditorUrl());
		LogHelper.info("Current page is " + arrayPage.getCurrentUrl());
	}

	// TC_A7
	@When("The user clicks of Arrays Using List link")
	public void the_user_clicks_of_arrays_using_list_link() {
		arrayPage.clickArraysUsingList();
		LogHelper.info("The user is on Arrays Using List page");
	}

	// TC_A8
	@Given("The user is on the Arrays Using List page")
	public void the_user_is_on_the_arrays_using_list_page() {
		arrayPage.navigateToPage(ConfigReader.getArraysUsingListUrl());
		LogHelper.info("Current page is " + arrayPage.getCurrentUrl());
	}

	// TC_A9
	@When("The user clicks  of Basic Operations in Lists link")
	public void the_user_clicks_of_basic_operations_in_lists_link() {
		arrayPage.clickBasicOperationsInLists();
		LogHelper.info("The user clicks  of Basic Operations in Lists");
	}

	// TC_A10
	@Given("The user is on the Basic Operations in Lists page")
	public void the_user_is_on_the_basic_operations_in_lists_page() {
		arrayPage.navigateToPage(ConfigReader.getBasicOperationsInListsUrl());
		LogHelper.info("The user is on the Basic Operations in page");
	}

	// TC_A11
	@When("The user clicks  Applications of Array link")
	public void the_user_clicks_applications_of_array_link() {
		arrayPage.clickApplicationsOfArray();
		LogHelper.info("The user clicks  Applications of Array");
	}

	// TC_A12
	@Given("The user is on the Applications of Array page")
	public void the_user_is_on_the_applications_of_array_page() {
		arrayPage.navigateToPage(ConfigReader.getApplicationsOfArrayUrl());
		LogHelper.info("The user is on the Applications of Array page");
	}

	// TC_A13
	@Given("The user is on the Arrays in Python page after logged in")
	public void the_user_is_on_the_arrays_in_python_page_after_logged_in() {
		arrayPage.navigateToPage(ConfigReader.getArraysInPythonUrl());
		LogHelper.info("The user is on the Arrays in Python page");

	}

	@When("The user clicks Practice Questions link of Array Page")
	public void the_user_clicks_practice_questions_link_of_array_page() {
		arrayPage.clickPracticeQuestionslink();
		LogHelper.info(" user clicks Practice Questions");
	}

	@Then("The user should be redirected to Array practice Questions page")
	public void the_user_should_be_redirected_to_array_practice_questions_page() {
		Assert.assertEquals(arrayPage.getCurrentUrl(), ConfigReader.getArrayPracticeQuestionsUrl());
		LogHelper.info("user is on " + arrayPage.getArrayPageTitle());
	}

	// @TC_A14
	@Given("The user is on the Array practice Questions page")
	public void the_user_is_on_the_array_practice_questions_page() {
		arrayPage.navigateToPage(ConfigReader.getArrayPracticeQuestionsUrl());
		LogHelper.info("user is on" + arrayPage.getArrayPageTitle());
	}

	@When("The user clicks on the link for question {string}")
	public void the_user_clicks_on_the_link_for_question(String questionTitle) {
		arrayPage.clickQuestionLinkByTitle(questionTitle);
		LogHelper.info("User is on " + questionTitle + "page");
	}

	@Then("The user should be redirected to the expected {string} page")
	public void the_user_should_be_redirected_to_the_expected_page(String string) {
		Assert.assertEquals(arrayPage.getArrayPageTitle(), "Assessment", "Title do not match");
		LogHelper.info("current page:" + arrayPage.getArrayPageTitle());
	}

	// TC_A15
	@Given("The user is on Question page of {string} after logged in")
	public void the_user_is_on_question_page_of_after_logged_in(String questionTitle) {
		arrayPage.getPracticeQuestionLinksOfArray(questionTitle);
		LogHelper.info("The user should be on question page of array ");

	}

	@When("The user enter valid python code in tryEditor from sheet {string} and {string} for the question")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and_for_the_question(String sheetName,
			String questionTitle) throws IOException {
		arrayPage.enterPythonCode(sheetName, questionTitle);
		expectedMsg = arrayPage.getExpectedResult(sheetName, questionTitle);
		LogHelper.info("The Result:" + expectedMsg);

	}

	@When("The user clicks on run button")
	public void the_user_clicks_on_run_button() {
		arrayPage.clickRunBtn();
		LogHelper.info("The user clicks on run button");
	}

	@Then("The user should be presented with Run result")
	public void the_user_should_be_presented_with_run_result() {
		String actualResult = arrayPage.getActualResult();
		Assert.assertEquals(expectedMsg, actualResult, "Result do not match");
		LogHelper.info("Result: " + actualResult);
	}

	// TC_16
	@When("The user clicks on submit button")
	public void the_user_clicks_on_submit_button() {
		arrayPage.clickSubmitBtn();
		LogHelper.info("The user clicks on submit button");

	}

	@Then("The user should be presented with successful submission message")
	public void the_user_should_be_presented_with_successful_submission_message() {
		String actualResult = arrayPage.getActualResult();
		Assert.assertEquals(actualResult, expectedMsg, "Result do not match");
		LogHelper.info("The user should be presented with successful submission message");

	}

	// @TC_A17
	@When("The user enter  python code with invalid syntax in tryEditor from sheet {string} and {string} for the question")
	public void the_user_enter_python_code_with_invalid_syntax_in_try_editor_from_sheet_and_for_the_question(
			String sheetName, String questionTitle) throws IOException {
		arrayPage.enterPythonCode(sheetName, questionTitle);
		expectedMsg = arrayPage.getExpectedResult(sheetName, questionTitle);
		LogHelper.info("Error message: " + expectedMsg);
	}

	@Then("The user should be presented with error message as {string}")
	public void the_user_should_be_presented_with_error_message_as(String string) {
		String actualMsg = arrayPage.getErrorText();
		Assert.assertEquals(actualMsg, expectedMsg, "Result do not match");
		LogHelper.info("The user is presented with error message");

	}

}