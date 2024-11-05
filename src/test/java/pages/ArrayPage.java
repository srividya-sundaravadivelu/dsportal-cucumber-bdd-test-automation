package pages;

import org.openqa.selenium.By;
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

	@FindBy(xpath = "//a[@href='/question/1']")
	WebElement searchTheArray;

	@FindBy(xpath = "//a[@href='/question/2']")
	WebElement maxCnscutivones;

	@FindBy(xpath = "//a[@href='/question/3']")
	WebElement fndNumbrsWithEvnNoOfDgts;

	@FindBy(xpath = "//a[@href='/question/4']")
	WebElement SqrsOfASrtdArray;

	@FindBy(xpath = "//*[@id='answer_form']/button")
	WebElement runButton;

	@FindBy(xpath = "//*[@class='button']")
	WebElement submitBtn;

	@FindBy(xpath = "//*[@class='CodeMirror-scroll']")
	WebElement codeEditor;

	@FindBy(id = "output")
	
	WebElement output;public void clickLinkUnderTopicsCovered(String itemName) {
		WebElement item = driver
				.findElement(By.xpath("//a[contains(@class,'list-group-item') and text()='" + itemName + "']"));
		WebDriverWaitUtility.waitForElementToBeClickable(item).click();
	}
	
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
	public void clickSearchTheArray() {
		WebDriverWaitUtility.waitForElementToBeClickable(searchTheArray);
		searchTheArray.click();
	}

	public void clickMaxCnsecutiveOnes() {
		WebDriverWaitUtility.waitForElementToBeClickable(maxCnscutivones);
		maxCnscutivones.click();
	}

	public void clickFndNumswithEvnNumOfDigts() {
		WebDriverWaitUtility.waitForElementToBeClickable(fndNumbrsWithEvnNoOfDgts);
		fndNumbrsWithEvnNoOfDgts.click();
	}

	public void clickSqrsOfASortdArray() {
		WebDriverWaitUtility.waitForElementToBeClickable(SqrsOfASrtdArray);
		SqrsOfASrtdArray.click();
	}


}
