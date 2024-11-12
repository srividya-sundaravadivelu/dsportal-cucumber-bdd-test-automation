package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.WebDriverWaitUtility;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(text(),'Sign out')]")
	private WebElement signOutLink;

	@FindBy(xpath = "//a[contains(@class,'dropdown-toggle')]")
	private WebElement dropdownMenu;

	// Anjali------
	// signin
	@FindBy(xpath = "//a[@href='/login']")
	private WebElement signin;

	// Register
	@FindBy(xpath = "//a[@href=\"/register\"]")
	private WebElement register;

	// alert
	@FindBy(xpath = "//*[@class='alert alert-primary']")
	private WebElement alert_msg;

	// ----till this line

	public Boolean isSignOutLinkVisible() {
		try {
			WebDriverWaitUtility.waitForElementToBeVisible(signOutLink);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void clickDropDownItem(String itemName) {
		WebDriverWaitUtility.waitForElementToBeClickable(dropdownMenu).click();
		WebElement item = driver.findElement(By.xpath("//a[text()='" + itemName + "']"));
		WebDriverWaitUtility.waitForElementToBeClickable(item).click();
	}

	public void clickGetStarted(String itemName) {
		WebElement item = driver.findElement(By.xpath("//a[@href='" + itemName.toLowerCase() + "']"));
		WebDriverWaitUtility.waitForElementToBeClickable(item).click();
	}
}