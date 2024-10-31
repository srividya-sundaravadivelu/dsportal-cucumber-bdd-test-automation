package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.WebDriverWaitUtility;

public class ArrayPage extends BasePage {
	@FindBy(xpath=" //ul//a[@href='arrays-in-python']")
	WebElement arraysInPythonLink;
	
	@FindBy(xpath="//a[normalize-space()='Arrays Using List']")
	WebElement arraysUsingList;
	
	@FindBy(xpath="//a[normalize-space()='Basic Operations in Lists']")
	WebElement basicOperationsInLists;
	
	@FindBy(xpath="//a[contains(text(),'Applications of Array')]")
	WebElement applicationsOfarray;
	
	@FindBy(xpath="//a[@href='/array/practice']")
	WebElement arrayPracticeQns;
	
	@FindBy(xpath = "//a[@href='/tryEditor']")
	private WebElement tryEditorLink;
	
	public void clickArraysInPythonlink() {
		WebDriverWaitUtility.waitForElementToBeClickable(arraysInPythonLink);
		arraysInPythonLink.click();
	}
	public void clickArraysUsingList() {
		WebDriverWaitUtility.waitForElementToBeClickable(arraysUsingList);
		arraysUsingList.click();
	}
	public void clickBasicOperationsInLists() {
		WebDriverWaitUtility.waitForElementToBeClickable(basicOperationsInLists);
		basicOperationsInLists.click();
	}
	public void clickApplicationsOfArray() {
		WebDriverWaitUtility.waitForElementToBeClickable(applicationsOfarray);
		applicationsOfarray.click();
		
	}
	public void clickTryHereButton() {
		WebDriverWaitUtility.waitForElementToBeClickable(tryEditorLink);
		tryEditorLink.click();
	}
	public void clickPracticeQuestionslink() {
		WebDriverWaitUtility.waitForElementToBeClickable(arrayPracticeQns);
		arrayPracticeQns.click();
	}

}
