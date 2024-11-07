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
			LogHelper.info("Firefox Driver is created");
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			LogHelper.info("Edge Driver is created");
			break;
		case "safari":
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			LogHelper.info("Safari Driver is created");
			break;
		default:
			throw new RuntimeException("Browser not supported: " + browser);
		}
		
		threadLocalDriver.set(driver);
		getdriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTimeout));
		getdriver().manage().window().maximize();
		
	}

	public WebDriver getdriver() {
		return threadLocalDriver.get();		
	}

	public void quitDriver() {
		getdriver().quit();
		threadLocalDriver.remove();
	}

	public void initializePageObjects() {
		WebDriver threadLocalDriver = getdriver();
		this.graphPage = new GraphPage(threadLocalDriver);
		this.arrayPage = new ArrayPage(threadLocalDriver);
		this.dataStructuresIntroductionPage = new DataStructuresIntroductionPage(threadLocalDriver);
		this.homePage = new HomePage(threadLocalDriver);
		this.loginPage = new LoginPage(threadLocalDriver);
		this.registerPage = new RegisterPage(threadLocalDriver);
		this.treePage = new TreePage(threadLocalDriver);
		this.tryEditorPage = new TryEditorPage(threadLocalDriver);
		this.linkedListPage = new LinkedListPage(threadLocalDriver);
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
	
	public ArrayPage getArrayPage() {
		return arrayPage;
	}
	
	public LinkedListPage getLinkedListPage() {
		return linkedListPage;
	}

}
