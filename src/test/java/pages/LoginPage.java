package pages;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.testng.Assert;

import utils.WebDriverWaitUtility;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "id_username")
	private WebElement usernameField;

	@FindBy(id = "id_password")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@type='submit' and @value='Login']")
	private WebElement loginButton;
	//--11/12
	@FindBy(xpath="//div[@class='alert alert-primary']")
	private WebElement alert;
	
	@FindBy(xpath="//a[@href='/logout']")
	private WebElement signout;
    //--
	// Anjali-11/8
	@FindBy(xpath = "//a[@href=\"/register\"]")
	private WebElement register;

	public static boolean isRequired;

	String expectedMessage;

     //---
	public HomePage login(String username, String password) {
		usernameField.clear();
		usernameField.sendKeys(username);
		passwordField.clear();
		passwordField.sendKeys(password);
		loginButton.click();
		return new HomePage(driver);
	}

	public void clickRegisterlink() {
		WebDriverWaitUtility.waitForElementToBeClickable(register);

		register.click();
	}
	
	//--11/12
	
	public void clickSignoutlink() {
		WebDriverWaitUtility.waitForElementToBeClickable(signout);
		signout.click();
		
	}

	public Boolean verifyLogin(String username, String password) {
		usernameField.clear();
		usernameField.sendKeys(username);
		passwordField.clear();
		passwordField.sendKeys(password);

		if (username.isBlank()) {
			JavascriptExecutor js_user = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_user.executeScript("return arguments[0].required;", usernameField);
			return isRequired;
		} else if (password.isBlank()) {
			JavascriptExecutor js_password = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_password.executeScript("return arguments[0].required;", passwordField);
			return isRequired;

		}
		return isRequired;
	}

	public void clickLogin() {
		loginButton.click();
	}

	public String actMsg() {
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 String actualMessage = (String) js.executeScript("return arguments[0].validationMessage;", usernameField); 
//	return  actualMessage;

		WebElement activeElement = driver.switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		return messageStr;
	}
}