package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.WebDriverWaitUtility;

public class RegisterPage extends BasePage {

	// Anjali

	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(text(),' Register ')]")
	private WebElement registerlink;

	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	private WebElement signinlink;

	// An-11/7
	@FindBy(xpath = "//*[@id='id_username']")
	WebElement usernamebox;

	@FindBy(xpath = "//*[@id='id_password1']")
	WebElement passwordbox;

	@FindBy(xpath = "//*[@id='id_password2']")
	WebElement confirmpwbox;

	@FindBy(xpath = "//form/input[@type='submit']")
	WebElement regbutton;

	public void clickRegister() {
		WebDriverWaitUtility.waitForElementToBeClickable(registerlink).click();
		// registerlink.click();
	}

}
