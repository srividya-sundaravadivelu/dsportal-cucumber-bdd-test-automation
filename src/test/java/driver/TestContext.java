package driver;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.*;
import utils.ConfigReader;
import utils.LogHelper;

public class TestContext {

	private static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();
	private GraphPage graphPage;
	private ArrayPage arrayPage;
	private DataStructuresIntroductionPage dataStructuresIntroductionPage;
	private HomePage homePage;
	private LinkedListPage linkedListPage;
	private LoginPage loginPage;
	private RegisterPage registerPage;
	private TreePage treePage;
	private TryEditorPage tryEditorPage;
	private StackPage stackPage;

	public void setDriver(String browser) {
		LogHelper.info("Browser value inside SetDriver method in TestContext:" + browser);
		long pageLoadTimeout = Long.parseLong(ConfigReader.getPageLoadTimeout());
		WebDriver driver;

		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			if (ConfigReader.isChromeHeadless())
				chromeOptions.addArguments("--headless");
			driver = new ChromeDriver(chromeOptions);
			LogHelper.info("Chrome Driver is created");
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions ffOptions = new FirefoxOptions();
			if (ConfigReader.isFireFoxHeadless())
				ffOptions.addArguments("--headless");
			driver = new FirefoxDriver(ffOptions);
			LogHelper.info("Firefox Driver is created");
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			EdgeOptions edgeOptions = new EdgeOptions();
			if (ConfigReader.isEdgeHeadless())
				edgeOptions.addArguments("--headless");
			driver = new EdgeDriver(edgeOptions);
			LogHelper.info("Edge Driver is created");
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
	    WebDriver driver = getdriver();
	    if (driver != null) {
	        LogHelper.info("Quitting WebDriver instance: " + driver);
	        driver.quit();
	        threadLocalDriver.remove();
	    } else {
	        LogHelper.warn("WebDriver instance is already null or has been quit.");
	    }
	}

	public GraphPage getGraphPage() {
		if (graphPage == null)
			graphPage = new GraphPage(getdriver());
		return graphPage;
	}

	public HomePage getHomePage() {
		if (homePage == null)
			homePage = new HomePage(getdriver());
		return homePage;
	}

	public DataStructuresIntroductionPage getDataStructuresIntroductionPage() {
		if (dataStructuresIntroductionPage == null)
			dataStructuresIntroductionPage = new DataStructuresIntroductionPage(getdriver());
		return dataStructuresIntroductionPage;
	}

	public LoginPage getLoginPage() {
		if (loginPage == null)
			loginPage = new LoginPage(getdriver());
		return loginPage;
	}

	public TreePage getTreePage() {
		if (treePage == null)
			treePage = new TreePage(getdriver());
		return treePage;
	}

	public TryEditorPage getTryEditorPage() {
		if (tryEditorPage == null)
			tryEditorPage = new TryEditorPage(getdriver());
		return tryEditorPage;
	}

	public RegisterPage getRegisterPage() {
		if (registerPage == null)
			registerPage = new RegisterPage(getdriver());
		return registerPage;
	}

	public ArrayPage getArrayPage() {
		if (arrayPage == null)
			arrayPage = new ArrayPage(getdriver());
		return arrayPage;
	}

	public LinkedListPage getLinkedListPage() {
		if (linkedListPage == null)
			linkedListPage = new LinkedListPage(getdriver());
		return linkedListPage;
	}
	
	public StackPage getStackPage() {
		if (stackPage == null)
			stackPage = new StackPage(getdriver());
		return stackPage;
	}

}
