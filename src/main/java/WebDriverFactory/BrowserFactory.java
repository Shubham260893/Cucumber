package WebDriverFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.apache.commons.compress.harmony.pack200.NewAttribute;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PropertyFileUtils.ReadPropertyFile;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	private Scenario scenario;

	public WebDriver launchBrowser(String browser) throws MalformedURLException {
		WebDriver driver = null;

		switch (browser.toLowerCase()) {
		case "chrome":
			ChromeOptions options = new ChromeOptions();
			options.setBrowserVersion("102.0.5005.61");
			//WebDriverManager.chromedriver().browserVersion("100");
//			driver = new ChromeDriver(options);
			//options.setCapability("customcap", true);
			 driver = new RemoteWebDriver(new URL("http://192.168.29.21:4444"), options);
			break;
			
		case "firefox":
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubhamsharma12\\.cache\\selenium\\geckodriver\\win64\\0.31.0\\geckodriver.exe");
			driver= new FirefoxDriver();
			break;

		}

		return driver;

	}

	public Scenario getScenario() {
		return scenario;
	}

	public void setScenario(Scenario scenario) {
		this.scenario = scenario;
	}

}
