package pages;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.cucumber.datatable.DataTable;
import utils.ConfigReader;
import utils.ExcelReader;
import utils.LogHelper;
import utils.WebDriverWaitUtility;

public class RegisterPage extends BasePage {

	// Anjali

	public RegisterPage(WebDriver driver) {
		super(driver);
	}
     
	@FindBy(xpath ="//a[@href='/home']")
	private WebElement getstarted;
	
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
	
	@FindBy(xpath="//*[class='alert alert-primary']")
	private WebElement errorMessage;

//	public void clickRegister() {
//		WebDriverWaitUtility.waitForElementToBeClickable(registerlink);
//		registerlink.click();
//		
//	}
	
	public void clickRegisterButton() {
		WebDriverWaitUtility.waitForElementToBeClickable(regbutton);
		regbutton.click();
		
	}
	
	public void clickGetStartedButton() {
		WebDriverWaitUtility.waitForElementToBeClickable(getstarted);
		getstarted.click();
		
	}
	
	
	public Boolean userfieldsempty() {
	
	boolean isRequired =false;
	if(usernamebox.getText().isBlank()) {
		JavascriptExecutor js_user = (JavascriptExecutor) driver;
		isRequired =(Boolean) js_user.executeScript("return arguments[0].required;", usernamebox);
	}
	return isRequired;
		
}
	
	public Boolean pwfieldsempty() {
		
	boolean isRequired =false;
	if(passwordbox.getText().isBlank()) {
		JavascriptExecutor js_user = (JavascriptExecutor) driver;
		isRequired =(Boolean) js_user.executeScript("return arguments[0].required;", passwordbox);
	}
	return isRequired;
	}
	 
	public Boolean confmpwfieldsempty() {
		
	boolean isRequired =false;
	if(confirmpwbox.getText().isBlank()) {
		JavascriptExecutor js_user = (JavascriptExecutor) driver;
		isRequired =(Boolean) js_user.executeScript("return arguments[0].required;", confirmpwbox);
	}
	return isRequired;
	}
	
	public String errormsgEmptyUser() {
		return usernamebox.getAttribute("validationMessage");
		
	}
	
	public String errormsgEmptyPw() {
		return passwordbox.getAttribute("validationMessage");
		
	}
	public String errormsgEmptyConfPw() {
		return confirmpwbox.getAttribute("validationMessage");
		
	}
	
	public void enterUsername(String username) {
		WebDriverWaitUtility.waitForElementToBeVisible(usernamebox);
		usernamebox.clear();
		usernamebox.sendKeys(username);
		
	}
	
	public void enterPassword(String password) {
		WebDriverWaitUtility.waitForElementToBeVisible(passwordbox);
		passwordbox.clear();
		passwordbox.sendKeys(password);
		
	}
	public void enterCofmPassword(String cpassword) {
		WebDriverWaitUtility.waitForElementToBeVisible(confirmpwbox);
		confirmpwbox.clear();
		confirmpwbox.sendKeys(cpassword);
		
	}
	// Enter username PW and Con PW method for DataTable 
	
	public void validname(DataTable dataTable) {
		List<Map<String,String>> userdetail = dataTable.asMaps(String.class,String.class);
		for (Map<String,String> form : userdetail) {
			
			String userName = form.get("username");
			LogHelper.info("The user enter username as :"+ userName);
			usernamebox.sendKeys(userName);
		}
	}
			
		public void validPw(DataTable dataTable) {
			List<Map<String,String>> userdetail = dataTable.asMaps(String.class,String.class);
			for (Map<String,String> form : userdetail) {
				
				String password = form.get("password");
				LogHelper.info("The user enter username as :"+ password);
				usernamebox.sendKeys(password);
			}
		}
			
			public void validConfPw(DataTable dataTable) {
				List<Map<String,String>> userdetail = dataTable.asMaps(String.class,String.class);
				for (Map<String,String> form : userdetail) {
					
					String cpassword = form.get("Password confirmation");
					LogHelper.info("The user enter username as :"+ cpassword);
					usernamebox.sendKeys(cpassword);
				}
	}
	 
		
		// Register title method
	
	public String getRegisterTitle() {
		String title = driver.getTitle();
		return title;
		
		
	}
	
	// Error message method
	public String getErrormsg() {
		String msg = null;
		try {
			msg = errorMessage.getText();
			
		} catch(NoSuchElementException e) {
	}
		return msg;
		
	}
	
	public String[] submitRegistrationDetailsFromExcel(String sheetName, int rowIndex) throws IOException {
	    String[] registrationData = getRegistrationDataFromExcel(sheetName, rowIndex);
	    enterUsername(registrationData[0]);
	    enterPassword(registrationData[1]);
	    enterCofmPassword(registrationData[2]);	    
	    clickRegisterButton();
	    
	    // Return both expectedOutput and validation 
	    return new String[]{registrationData[3], registrationData[4]};
	}
	 
    private String[] getRegistrationDataFromExcel(String sheetName, int rowIndex) throws IOException {	
		ExcelReader excelReader = new ExcelReader(ConfigReader.getExcelFilePath());
	        String username =excelReader.getCellData(sheetName, rowIndex, 0);  
	        String password = excelReader.getCellData(sheetName, rowIndex, 1);  
	        String confirmPassword = excelReader.getCellData(sheetName, rowIndex, 2);  
	        String expectedOutput = excelReader.getCellData(sheetName, rowIndex, 3);    
	        String errorLocator = excelReader.getCellData(sheetName, rowIndex, 4); 
	        return new String[]{username, password, confirmPassword, expectedOutput,errorLocator};
    }

}
