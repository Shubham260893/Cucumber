package WebDriverFactory;

import org.apache.commons.compress.harmony.pack200.NewAttribute;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PropertyFileUtils.ReadPropertyFile;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	private Scenario scenario;
	
	public WebDriver launchBrowser() {
		WebDriver driver=null;
		ReadPropertyFile readpropertyfile= new ReadPropertyFile() ;
		readpropertyfile.readPropertyFile();
		String browser = readpropertyfile.getProperty("browser");

		switch (browser) {
		case "chrome":
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--no-sandbox");
			options.addArguments("--start-maximized");
			options.addArguments("disable-popup");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);

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
