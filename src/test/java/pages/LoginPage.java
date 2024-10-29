package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	@FindBy(id = "id_username")
	private WebElement usernameField;

	@FindBy(id = "id_password")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@type='submit' and @value='Login']")
	private WebElement loginButton;

	public HomePage login(String username, String password) {
		usernameField.clear();
		usernameField.sendKeys(username);
		passwordField.clear();
		passwordField.sendKeys(password);
		loginButton.click();
		return new HomePage();
	}

}