package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.WebDriverWaitUtility;

public class LinkedListPage extends BasePage {
	@FindBy(xpath = "//a[@href='introduction']")
	WebElement introductionLink;

	@FindBy(xpath = "//a[@href='creating-linked-list']")
	WebElement creatingLinkedlistLink;

	@FindBy(xpath = "//a[@href='types-of-linked-list']")
	WebElement typesOfLinkedlistLLink;

	@FindBy(xpath = "//a[@href='implement-linked-list-in-python']")
	WebElement implementLinkedListInPythonLink;

	@FindBy(xpath = "//a[@href='traversal']")
	WebElement traversalLink;

	@FindBy(xpath = "//a[@href='insertion-in-linked-list']")
	WebElement insertionLink;

	@FindBy(xpath = "//a[@href='deletion-in-linked-list']")
	WebElement deletionLink;

	@FindBy(xpath = "//a[@href='/linked-list/practice']")
	WebElement practiceQuestionLinkOfLnkdList;

	@FindBy(xpath = "//a[@href='/tryEditor']")
	WebElement tryHereLink;

	@FindBy(xpath = "//*[@class=' CodeMirror-line ']")
	WebElement editorInput;

	@FindBy(xpath = "//*[@id='answer_form']/button")
	WebElement runButton;

	@FindBy(id = "output")
	WebElement output;

	public void clickIntroductionLink() {
		WebDriverWaitUtility.waitForElementToBeClickable(introductionLink);
		introductionLink.click();
	}

	public void clickCreatingLinkedlistLink() {
		WebDriverWaitUtility.waitForElementToBeClickable(creatingLinkedlistLink);
		creatingLinkedlistLink.click();
	}

	public void clickTypesOfLinkedlistLLink() {
		WebDriverWaitUtility.waitForElementToBeClickable(typesOfLinkedlistLLink);
		typesOfLinkedlistLLink.click();
	}

	public void clickImplementLinkedListInPythonLink() {
		WebDriverWaitUtility.waitForElementToBeClickable(implementLinkedListInPythonLink);
		implementLinkedListInPythonLink.click();
	}

	public void clickTraversalLink() {
		WebDriverWaitUtility.waitForElementToBeClickable(traversalLink);
		traversalLink.click();
	}

	public void clickInsertionLink() {
		WebDriverWaitUtility.waitForElementToBeClickable(insertionLink);
		insertionLink.click();
	}

	public void clickDeletionLink() {
		WebDriverWaitUtility.waitForElementToBeClickable(deletionLink);
		deletionLink.click();
	}
	public void clickPracticeQuestionLinkOfLnkdList() {
		WebDriverWaitUtility.waitForElementToBeClickable(practiceQuestionLinkOfLnkdList);
		practiceQuestionLinkOfLnkdList.click();
	}
	public String getLinkedListPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	public void tryHereLink(String btnName, String dsName) {
		
		tryHereLink.click();
	}

}
