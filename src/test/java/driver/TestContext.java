package driver;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.*;
import utils.ConfigReader;
import utils.LogHelper;

public class TestContext {

	private static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();
	public GraphPage graphPage;
	public ArrayPage arrayPage;
	public DataStructuresIntroductionPage dataStructuresIntroductionPage;
	public HomePage homePage;
	public LinkedListPage linkedListPage;
	public LoginPage loginPage;
	public RegisterPage registerPage;
	public TreePage treePage;
	public TryEditorPage tryEditorPage;

	public void setDriver(String browser) {
//		String browser = ConfigReader.getBrowser();
		LogHelper.info("Browser value inside SetDriver method in TestContext:"+browser);
		long pageLoadTimeout = Long.parseLong(ConfigReader.getPageLoadTimeout());
		WebDriver driver;

		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			LogHelper.info("Chrome Driver is created");
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			LogHelper.info("Edge Driver is created");
			break;
		case "safari":
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;
		default:
			throw new RuntimeException("Browser not supported: " + browser);
		}

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTimeout));
		driver.manage().window().maximize();
		threadLocalDriver.set(driver);
	}

	public WebDriver getdriver() {
		return threadLocalDriver.get();		
	}

	public void quitDriver() {
		getdriver().quit();
		threadLocalDriver.remove();
	}

	public void initializePageObjects() {
		WebDriver driver = getdriver();
		this.graphPage = new GraphPage(driver);
		this.arrayPage = new ArrayPage(driver);
		this.dataStructuresIntroductionPage = new DataStructuresIntroductionPage(driver);
		this.homePage = new HomePage(driver);
		this.loginPage = new LoginPage(driver);
		this.registerPage = new RegisterPage(driver);
		this.treePage = new TreePage(driver);
		this.tryEditorPage = new TryEditorPage(driver);
	}

	public GraphPage getGraphPage() {
		return graphPage;
	}

	public HomePage getHomePage() {
		return homePage;
	}

	public DataStructuresIntroductionPage getDataStructuresIntroductionPage() {
		return dataStructuresIntroductionPage;
	}

	public LoginPage getLoginPage() {
		return loginPage;
	}

	public TreePage getTreePage() {
		return treePage;
	}

	public TryEditorPage getTryEditorPage() {
		return tryEditorPage;
	}

	public RegisterPage getRegisterPage() {
		return registerPage;
	}

}
